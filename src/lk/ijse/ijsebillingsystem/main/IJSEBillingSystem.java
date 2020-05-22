/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ijsebillingsystem.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author suuti
 */
public class IJSEBillingSystem extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/ijsebillingsystem/views/Home.fxml"));
        // stage.initStyle(StageStyle.UNDECORATED);
        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/ijsebillingsystem/views/FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
        stage.setResizable(false);
        //stage.setMaxWidth(768);
        // stage.setMinHeight(1024);

//        WebView webView = new WebView();
//        WebEngine engine = webView.getEngine();
//        engine.load(getClass().getResource("").toExternalForm());
//        
//        VBox root = new VBox();
//        root.getChildren().addAll(webView);
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.setMaximized(true);
//        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
