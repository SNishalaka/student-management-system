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
import javafx.scene.control.Alert;
import javax.swing.JFileChooser;
import lk.ijse.ijsebillingsystem.view.util.Backup;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class BackupController implements Initializable {

    @FXML
    private JFXButton btnBackUp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnBackUpOnAction(ActionEvent event) {
        String backUpPath = "";
        JFileChooser fc = null;
        if (fc == null) {
            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setAcceptAllFileFilterUsed(false);
        }
        int returnVal = fc.showDialog(null, "Open");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                backUpPath = fc.getSelectedFile().getAbsolutePath();
                Backup b = new Backup();
                boolean res = b.getData("localhost", "3306", "root", "suutikolla", "ijse", backUpPath);
                if (res) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText(null);
                    alert.setContentText("BackUp is success");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("BackUp Fail.");
                    alert.setHeaderText(null);
                    alert.setContentText("BackUp Fail. \n Try again.");
                    alert.showAndWait();
                    return;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
