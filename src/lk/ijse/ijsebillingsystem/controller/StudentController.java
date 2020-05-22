/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
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
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class StudentController implements Initializable {

    @FXML
    private JFXButton btnAccount;
    @FXML
    private StackPane stackPane;
    @FXML
    private JFXButton btnCourseEntry;
    @FXML
    private JFXButton btnGeneratedReports;
    @FXML
    private JFXButton btnStudentEntry;
    @FXML
    private JFXButton btnBackups;
    @FXML
    private JFXButton btnBatchEntry;
    @FXML
    private JFXButton btnCalculator;
    @FXML
    private JFXButton btnTransferSnaps;
    @FXML
    private JFXButton btnSystemSettings;
    @FXML
    private JFXButton btnAbout;
    @FXML
    private JFXButton btnPayment;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnCourseEntryOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/CourseEntry.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnCourseEntry.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnGeneratedReportsOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/ViewAll.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnGeneratedReports.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBatchEntryOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/BatchEntry.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnGeneratedReports.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnCalculatorOnAction(ActionEvent event) {
    }

    @FXML
    private void btnTransferSnapsOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSystemSettingsOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/SystemSettings.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnGeneratedReports.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnAboutOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/About.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnGeneratedReports.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnStudentEntryOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/StudentEntry.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnStudentEntry.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnPaymentOnAction(ActionEvent event) {
    }

    @FXML
    private void btnBackupsOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/Backup.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnBackups.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
