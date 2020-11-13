package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public Button login_btn;
    public Button close_btn;
    
    public void Login_Action(ActionEvent actionEvent) throws IOException {
        ((Stage) login_btn.getScene().getWindow()).close();
        Login_Click();
    }
    
    public void Login_Click() throws IOException {
        Parent Layout = FXMLLoader.load(getClass().getResource("/view/mainview/MainView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(Layout));
        stage.setMaximized(true);
        stage.show();
    }
    
    public void Close_Action(ActionEvent actionEvent) {
        ((Stage) close_btn.getScene().getWindow()).close();
    }
}
