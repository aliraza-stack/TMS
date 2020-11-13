package view.management.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Management {
    public void mapview(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/view/management/MapView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.setMaximized(true);
        stage.setResizable(false);
        stage.show();
    }
}
