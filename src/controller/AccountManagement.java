package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountManagement {

    public void addupdaterole(ActionEvent actionEvent) throws IOException {
        Parent update = FXMLLoader.load(getClass().getResource("/view/accountmanagement/RoleUpdate.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(update));
        stage.setResizable(false);
        stage.show();
    }

    public void addnewuser(ActionEvent actionEvent) {
    }

    public void changepassword(ActionEvent actionEvent) {
    }
}
