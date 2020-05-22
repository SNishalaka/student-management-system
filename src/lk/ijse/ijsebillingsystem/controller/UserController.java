package lk.ijse.ijsebillingsystem.controller;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.ijsebillingsystem.dto.UserDTO;
import lk.ijse.ijsebillingsystem.service.ServiceFactory;
import lk.ijse.ijsebillingsystem.service.custom.UserService;

/**
 * FXML Controller class
 *
 * @author suuti
 */
public class UserController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;

    private UserService userService;
    @FXML
    private AnchorPane mainPane;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.USER);
    }

    @FXML
    private void txtPasswordOnAction(ActionEvent event) {

        try {
            String userName = txtUserName.getText();
            String password = txtPassword.getText();

            UserDTO user = userService.search(1);

            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/ijsebillingsystem/views/Student.fxml"));
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.show();
                stage.setResizable(false);
                stage.setMaximized(true);

                //close this stage
                Stage stages = (Stage) mainPane.getScene().getWindow();
                stages.close();

            } else if (!user.getUserName().equalsIgnoreCase(userName)) {
                txtUserName.setStyle("-fx-border-color:red");
            } else {
                txtPassword.setStyle("-fx-border-color:red");
            }

        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
