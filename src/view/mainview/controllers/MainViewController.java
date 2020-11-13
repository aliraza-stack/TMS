package view.mainview.controllers;

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
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/dashboard/DashboardModule.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void management(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/management/Management.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void AccountManagement(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/accountmanagement/AccountManagement.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Reports(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/reports/Reports.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void BackupRestore(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/backup_restore/Backup&Restore.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Inventory(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/inventory/Inventory.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Registration(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/registration/Registration.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void Expenditures(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/expenditures/Expenditures.fxml"));
        allView.getChildren().setAll(pane);
    }

    public void AboutUs(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/aboutus/AboutUs.fxml"));
        allView.getChildren().setAll(pane);
    }
}
