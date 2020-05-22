package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author suuti
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private AnchorPane mainPanel;
    @FXML
    private JFXButton btnAbout;
    @FXML
    private JFXButton btnAccount;
    @FXML
    private JFXListView<String> popList;
    @FXML
    private AnchorPane pnlStudent;
    @FXML
    private TextField txtSearch;
    @FXML
    private TextField txtSearch1;
    @FXML
    private TextField txtSearch11;
    @FXML
    private TextField txtSearch111;
    @FXML
    private TextField txtSearch1111;
    @FXML
    private TextField txtSearch112;
    @FXML
    private TextField txtSearch11111;
    @FXML
    private TextField txtSearch12;
    @FXML
    private TextField txtSearch121;
    @FXML
    private TextField txtSearch13;
    @FXML
    private TextField txtSearch131;
    @FXML
    private TextField txtSearch1311;
    @FXML
    private TextField txtSearch132;
    @FXML
    private TextField txtSearch1321;
    @FXML
    private TextField txtSearch13211;
    @FXML
    private TextField txtSearch1322;
    @FXML
    private StackPane stackPaneInStudentPanel;
    @FXML
    private AnchorPane pnlHome;
    @FXML
    private JFXButton btnStudentEntry;
    @FXML
    private JFXButton btnBatchEntry;
    @FXML
    private AnchorPane pnlCourse;
    @FXML
    private TextField txtSearch2;
    @FXML
    private ImageView btnBackInStudentPane;
    @FXML
    private ImageView btnBackInCoursePane;
    @FXML
    private JFXButton btnCourse;
    @FXML
    private AnchorPane pnlBatch;
    @FXML
    private ImageView btnBackInBatchPane;
    @FXML
    private TextField txtSearch21;
    @FXML
    private TextField txtSearch14;
    @FXML
    private TextField txtSearch141;
    @FXML
    private TextField txtSearch211;
    @FXML
    private JFXButton btnRequestCourse;
    @FXML
    private JFXButton btnPayment;
    @FXML
    private AnchorPane pnlPayment;
    @FXML
    private TextField txtSearch1411;
    @FXML
    private TextField txtSearch2121;
    @FXML
    private TextField txtSearch1412;
    @FXML
    private TextField txtSearch14121;
    @FXML
    private ImageView btnBackInPaymentPane;
    @FXML
    private TextField txtSearch14111;
    @FXML
    private TextField txtSearch14112;
    @FXML
    private TextField txtSearch14113;
    @FXML
    private TextField txtSearch1413;
    @FXML
    private TextField txtSearch21211;
    @FXML
    private AnchorPane pnlReports;
    @FXML
    private ImageView btnBackInReportPane;
    @FXML
    private TextField txtSearch212;
    @FXML
    private JFXButton btnReports;
    @FXML
    private JFXButton btnSystemSettings;
    @FXML
    private AnchorPane pnlSystemSettings;
    @FXML
    private ImageView btnBackInSystemSettingsPane;
    @FXML
    private ImageView btnSSCourseType;
    @FXML
    private ImageView btnSSCourseDuration;
    @FXML
    private ImageView btnSSNoOfPaymentTime;

    //Customize attributes
    private static String initSSBtn;
    @FXML
    private Text lblSSCourseType;
    @FXML
    private TextField txtSSCourseType;
    @FXML
    private ImageView btnBackInSystemSettingsPane1;
    @FXML
    private JFXButton btnBackup;
    @FXML
    private AnchorPane pnlBatchTransfer;
    @FXML
    private ImageView btnBackInBatchTransferPane;
    @FXML
    private TextField txtSearch1415;
    @FXML
    private TextField txtSearch1416;
    @FXML
    private TextField txtSearch221;
    @FXML
    private TextField txtSearch22;
    @FXML
    private TextField txtSearch14161;
    @FXML
    private ImageView btnSSTransferReason;
    @FXML
    private TextField txtSearch1417;
    @FXML
    private TextField txtSearch14171;
    @FXML
    private TextField txtSearch141611;
    @FXML
    private JFXButton btnBatchTransfer;
    @FXML
    private ImageView btnSSInBatchTransferPane;
    @FXML
    private ImageView btnSSTransferFee;
    @FXML
    private ImageView btnSSInStudent;
    @FXML
    private ImageView btnSSRegFeeInStudent;
    @FXML
    private ImageView btnSSRegTaxInStudent;
    @FXML
    private ImageView btnSSInCoursePane;
    @FXML
    private ImageView btnSSInBatch;
    @FXML
    private ImageView btnSSInPayment;
    @FXML
    private ImageView btnSSInReports;
    @FXML
    private ImageView btnEyeViewBatchHistory;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pnlHome.setVisible(true);
        pnlStudent.setVisible(false);
        pnlCourse.setVisible(false);
        pnlBatch.setVisible(false);
        pnlPayment.setVisible(false);
        pnlReports.setVisible(false);
        pnlSystemSettings.setVisible(false);
        pnlBatchTransfer.setVisible(false);
    }

    @FXML
    private void aboutButtonActions(MouseEvent event) {

        ObservableList<String> list = FXCollections.observableArrayList();

        for (int i = 1; i < 3; i++) {

            list.add("Item " + i);
        }
        popList.setItems(list);
        popList.setOpacity(1);

    }

    @FXML
    private void onListItemClick(MouseEvent event) {
        System.out.println(popList.getSelectionModel().getSelectedItem());
        popList.setOpacity(0);
    }

    @FXML
    private void btnStudentEntryOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlStudent);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBatchEntryOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatch.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlBatch);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInStudentPaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInCoursePaneOnAction(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(false);
        pnlCourse.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnCourseOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlCourse.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlCourse);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInBatchPaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatch.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnRequestCourseOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        //pnlStudent.setVisible(false);
        pnlCourse.setVisible(true);
        ft.setNode(pnlCourse);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnPaymentOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        //pnlStudent.setVisible(false);
        pnlPayment.setVisible(true);
        ft.setNode(pnlPayment);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInPaymentPaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlPayment.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInReportPaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlReports.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnReportsOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        //pnlStudent.setVisible(false);
        pnlReports.setVisible(true);
        ft.setNode(pnlReports);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSystemSettingsOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        //pnlStudent.setVisible(false);
        pnlSystemSettings.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBackInSystemSettingsPaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlSystemSettings.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSCourseTypeMouseClick(MouseEvent event) {

        String btnID = btnSSCourseType.getId();
        //  System.out.println(btnID);

        if (btnID.equals("btnSSCourseType")) {

            //txtSSCourseType.setStyle("-fx-background-color:red");
            //initSSBtn = "btnSSCourseType";
            FadeTransition ft = new FadeTransition(Duration.millis(600));
            pnlSystemSettings.setVisible(true);
            //pnlHome.setVisible(true);
            ft.setNode(pnlSystemSettings);
            ft.setFromValue(0.1);
            ft.setToValue(1);
            ft.setCycleCount(1);
            ft.setAutoReverse(false);
            ft.play();

        } else {
            System.out.println("else");
        }
    }

    @FXML
    private void btnSSCourseDurationMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSNoOfPaymentTimeMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnAboutonAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/About.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnAbout.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();
            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBackupOnAction(ActionEvent event) {
        try {
            if (event != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/Backup.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initOwner(btnBackup.getScene().getWindow());
                stage.setScene(new Scene(parent));
                stage.show();

            }

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBackInBatchTransferPaneOnAction(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatchTransfer.setVisible(false);
        pnlHome.setVisible(true);
        ft.setNode(pnlHome);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSTransferReasonMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatchTransfer.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnBatchTransferOnAction(ActionEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        //pnlBatchTransfer.setVisible(false);
        pnlBatchTransfer.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlBatchTransfer);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInBatchTransferPanemouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatchTransfer.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSTransferFeeMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatchTransfer.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInStudentMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSRegFeeInStudentMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSRegTaxInStudentMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlStudent.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        //pnlHome.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInCoursePaneMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlCourse.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInBatchMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlBatch.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInPaymentMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlPayment.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnSSInReportsMouseClick(MouseEvent event) {
        FadeTransition ft = new FadeTransition(Duration.millis(600));
        pnlReports.setVisible(false);
        pnlHome.setVisible(false);
        pnlSystemSettings.setVisible(true);
        ft.setNode(pnlSystemSettings);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }

    @FXML
    private void btnEyeViewBatchHistoryMouseClick(MouseEvent event) {
        //
    }

}
