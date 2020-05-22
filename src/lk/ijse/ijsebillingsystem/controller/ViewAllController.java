/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class ViewAllController implements Initializable {

    @FXML
    private AnchorPane mainPane;
    @FXML
    private JFXButton btnStudent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnStudentOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/AllStudent.fxml"));
            AnchorPane studentPane = loader.load();
            mainPane.getChildren().clear();
            mainPane.getChildren().add(studentPane);
        } catch (IOException ex) {
            Logger.getLogger(ViewAllController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
