package lk.ijse.ijsebillingsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXToggleButton;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import lk.ijse.ijsebillingsystem.dto.StudentDTO;
import lk.ijse.ijsebillingsystem.service.ServiceFactory;
import lk.ijse.ijsebillingsystem.service.custom.StudentService;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class StudentEntryController implements Initializable {

    @FXML
    private ComboBox comboStuId;
    @FXML
    private JFXButton btnSaveStuDetails;
    @FXML
    private JFXButton btnClearTexts;
    @FXML
    private JFXButton btnManageStudent;
    @FXML
    private TextField txtStuNameWithInitials;
    @FXML
    private TextField txtStuFullName;
    @FXML
    private TextArea txtStuAddress;
    @FXML
    private TextField txtStuMobileTel;
    @FXML
    private TextField txtStuHomeTel;
    @FXML
    private TextField txtStuEmail;
    @FXML
    private JFXDatePicker tpDateOfBirth;
    @FXML
    private TextField txtStuNic;
    @FXML
    private TextField txtStuSchool;
    @FXML
    private TextField txtStuUniversity;
    @FXML
    private TextField txtStuFaculty;
    @FXML
    private JFXRadioButton txtRadioMale;
    @FXML
    private JFXRadioButton txtRadioFemale;

    private StudentService studentService;
    @FXML
    private JFXToggleButton btnStatus;
    @FXML
    private TextField btnRegFee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentService = (StudentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
    }

    @FXML
    private void btnManageStudentOnAction(ActionEvent event) {
        txtStuNameWithInitials.setVisible(false);
        comboStuId.setVisible(true);
    }

    @FXML
    private void btnSaveStuDetailsOnAction(ActionEvent event) {

        try {
            String initialStudentName = txtStuNameWithInitials.getText();
            String studentFullName = txtStuFullName.getText();
            String addressLine = txtStuAddress.getText();
            String telHome = txtStuHomeTel.getText();
            String mobile = txtStuMobileTel.getText();
            String email = txtStuEmail.getText();
            String dob = "";
            String nic = txtStuNic.getText();
            String gender = "";
            String school = txtStuSchool.getText();
            String university = txtStuUniversity.getText();
            String faculty = txtStuFaculty.getText();
            String status;
            if (btnStatus.isSelected()) {
                status = "Active";
            } else {
               status = "Inactive";
            }
            double regFee = 12.23;

            boolean isSave = studentService.add(new StudentDTO(0, initialStudentName, studentFullName, addressLine, telHome, mobile, email, dob, nic, gender, school, university, faculty, status, regFee));

            if (isSave) {
                Image img = new Image("/lk/ijse/ijsebillingsystem/assets/tick.png");
                Notifications notifications = Notifications.create()
                        .title("Save Complete")
                        .text("Student Saved to database")
                        .graphic(new ImageView(img))
                        .hideAfter(Duration.seconds(5))
                        .position(Pos.TOP_RIGHT)
                        .onAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                //
                            }
                        });
                notifications.show();

            } else {
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
            Logger.getLogger(StudentEntryController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
