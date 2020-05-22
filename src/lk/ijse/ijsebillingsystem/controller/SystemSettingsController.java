/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class SystemSettingsController implements Initializable {

    @FXML
    private TextField txtBatchNo;
    @FXML
    private TextField txtBatchNo1;
    @FXML
    private TextField txtBatchNo11;
    @FXML
    private TextField txtBatchNo111;
    @FXML
    private TextField txtBatchNo1111;
    @FXML
    private JFXButton btnManageStudent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnManageStudentOnAction(ActionEvent event) {
    }
    
}
