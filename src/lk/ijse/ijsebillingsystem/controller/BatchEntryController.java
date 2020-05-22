package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import lk.ijse.ijsebillingsystem.dto.BatchDTO;
import lk.ijse.ijsebillingsystem.service.ServiceFactory;
import lk.ijse.ijsebillingsystem.service.custom.BatchService;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class BatchEntryController implements Initializable {

    private AnchorPane rootPane;
    @FXML
    private JFXButton btnClearTexts;
    @FXML
    private JFXButton btnManageStudent;
    @FXML
    private TextField txtBatchName;
    @FXML
    private ComboBox<?> cmbCourseName;
    @FXML
    private JFXDatePicker dpStarTime;
    @FXML
    private ComboBox<?> comboBranch;
    @FXML
    private JFXButton btnSaveBatchDetails;

    private BatchService batchService;
    @FXML
    private TextField txtBatchNo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        batchService = (BatchService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.BATCH);
    }

    private void btnAction(ActionEvent event) {
        try {

            AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("About.fxml"));
            System.out.println("working");
            rootPane.getChildren().addAll(anchorPane);
            System.out.println("workinsdfsdfsdfg");
        } catch (IOException ex) {
            Logger.getLogger(BatchEntryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnManageStudentOnAction(ActionEvent event) {
    }

    @FXML
    private void btnSaveBatchDetailsOnAction(ActionEvent event) {
        try {
            int batchNo = Integer.parseInt(txtBatchNo.getText());
            String batchName = txtBatchName.getText();
            String courseName = "CMJD";
            String startDate = "";
            String branch = "sdfdf";
            
            BatchDTO batchDTO =  new BatchDTO(0, 0, batchNo, courseName, batchName, startDate, branch);
            
            boolean isAdded = batchService.add(batchDTO);
            
            if (isAdded) {
                Image img = new Image("/lk/ijse/ijsebillingsystem/assets/tick.png");
                Notifications notifications = Notifications.create()
                        .title("Save Complete")
                        .text("Batch Details Saved to database")
                        .graphic(new ImageView(img))
                        .hideAfter(Duration.seconds(2))
                        .position(Pos.TOP_RIGHT)
                        .onAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                //
                            }
                        });
                notifications.show();
            }else{
                Image img = new Image("/lk/ijse/ijsebillingsystem/assets/error.png");
                Notifications notifications = Notifications.create()
                        .title("Save Failed")
                        .text("Could not save details")
                        .graphic(new ImageView(img))
                        .hideAfter(Duration.seconds(2))
                        .position(Pos.TOP_RIGHT)
                        .onAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                //
                            }
                        });
                notifications.show();
            }
             
        } catch (Exception ex) {
            Logger.getLogger(BatchEntryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
