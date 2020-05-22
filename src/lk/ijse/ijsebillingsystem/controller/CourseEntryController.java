package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import lk.ijse.ijsebillingsystem.dto.CourseDTO;
import lk.ijse.ijsebillingsystem.service.ServiceFactory;
import lk.ijse.ijsebillingsystem.service.custom.CourseService;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class CourseEntryController implements Initializable {

    @FXML
    private JFXButton btnClearTexts;
    @FXML
    private JFXButton btnManageStudent;
    @FXML
    private TextField txtCourseName;
    @FXML
    private TextField txtCourseFee;
    @FXML
    private TextField txtCourseDiscount;
    @FXML
    private TextField txtCourseDuration;
    @FXML
    private TextField txtLatePayment;
    @FXML
    private JFXButton btnSaveCourseDetails;
    @FXML
    private ComboBox<?> comboCourseType;
    @FXML
    private TextField txtTax;
    @FXML
    private ComboBox<?> comboNoOfPaymentTime;
    @FXML
    private TextField txtStudentLimit;

    private CourseService courseService;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        courseService = (CourseService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.COURSE);
    }

    @FXML
    private void btnManageStudentOnAction(ActionEvent event) {

    }

    @FXML
    private void btnSaveCourseDetailsOnAction(ActionEvent event) {

        try {
            String courseName = txtCourseName.getText();
            String courseType = "full";
            String duration = txtCourseDuration.getText();
            String no_of_payment = "sdf";
            String student_limit = txtStudentLimit.getText();
            String tax = txtTax.getText();
            double course_fee = Double.parseDouble(txtCourseFee.getText());
            String discount =txtCourseDiscount.getText();
            String late_payment_added_value = txtLatePayment.getText();
            
            boolean isAdded = courseService.add(new CourseDTO(0, courseName, courseType, duration, no_of_payment, student_limit, tax, course_fee, discount, late_payment_added_value));
            
            if (isAdded) {
                Image img = new Image("/lk/ijse/ijsebillingsystem/assets/tick.png");
                Notifications notifications = Notifications.create()
                        .title("Save Complete")
                        .text("Course Details Saved to database")
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
            Logger.getLogger(CourseEntryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
