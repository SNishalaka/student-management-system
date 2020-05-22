/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.ijsebillingsystem.dto.StudentDTO;
import lk.ijse.ijsebillingsystem.service.ServiceFactory;
import lk.ijse.ijsebillingsystem.service.custom.StudentService;
import lk.ijse.ijsebillingsystem.view.util.StudentsTableModel;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class AllStudentController implements Initializable {

    @FXML
    private JFXButton btnSaveStuDetails1;
    @FXML
    private JFXButton btnSaveStuDetails11;
    @FXML
    private JFXButton btnSaveStuDetails111;
    @FXML
    private AnchorPane allStudentPane;
    @FXML
    private TableColumn<StudentsTableModel, Integer> tblColSid;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColSName;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColSAddress;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColSTel;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColStatus;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColEmail;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColGender;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColDOB;
    @FXML
    private TableColumn<StudentsTableModel, String> tblColSelect;
    @FXML
    private TableView<StudentsTableModel> tblStudent;
    
    private JFXToggleButton statusBtn;

    private final ObservableList<StudentsTableModel> studentsTableModels = FXCollections.observableArrayList();

    private StudentService studentService;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        studentService = (StudentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);

        loadStudentDetailsTable();
    }

    @FXML
    private void btnSaveStuDetailsOnAction(ActionEvent event) {
    }

    private void loadStudentDetailsTable() {
        tblColSid.setCellValueFactory(new PropertyValueFactory<>("sid"));
        tblColSName.setCellValueFactory(new PropertyValueFactory<>("studentFullName"));
        tblColSAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tblColSTel.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        tblColStatus.setCellValueFactory(new PropertyValueFactory<>("statusBtn"));
        tblColEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tblColGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        tblColGender.setCellValueFactory(new PropertyValueFactory<>("dob"));
        tblColSelect.setCellValueFactory(new PropertyValueFactory<>("select"));

        tblStudent.setItems(studentsTableModels);

        List<StudentDTO> studentDTOs = null;

        try {
            studentDTOs = studentService.getAll();
        } catch (Exception ex) {
            Logger.getLogger(AllStudentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        studentsTableModels.clear();

        for (StudentDTO students : studentDTOs) {

            try {
                statusBtn = new JFXToggleButton();
                statusBtn.setSelected(true);
                
                JFXCheckBox selectBtn = new JFXCheckBox();
                
                StudentsTableModel stm = new StudentsTableModel();
                stm.setSid(students.getSID());
                stm.setStudentFullName(students.getStudentFullName());
                stm.setAddress(students.getAddressLine());
                stm.setMobile(students.getMobile());

                //check status
                if (students.getStatus().equals("Active")) {
                        stm.setStatusBtn(statusBtn);
                        System.out.println(students.getTelHome());
                    } else {
                     statusBtn.setSelected(false);
                     stm.setStatusBtn(statusBtn);
                    }

                stm.setEmail(students.getEmail());
                stm.setGender(students.getGender());
                stm.setDob(students.getDob());
                stm.setSelect(selectBtn);

                studentsTableModels.add(stm);
            } catch (Exception ex) {
                Logger.getLogger(AllStudentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
