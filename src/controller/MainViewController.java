package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController {
    public AnchorPane allView;

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void dashboard(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/DashboardModule.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void management(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Management.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void AccountManagement(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AccountManagement.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Reports(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Reports.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void BackupRestore(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Backup&Restore.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Inventory(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Inventory.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Registration(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Registration.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Expenditures(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Expenditures.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void AboutUs(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        allView.getChildren().setAll(pane);
    }
}
