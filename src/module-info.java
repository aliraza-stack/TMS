module TMS {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.swt;

    opens controller;
    opens main;
    opens view.aboutus;
    opens view.accountmanagement;
    opens view.backup_restore;
    opens view.dashboard;
    opens view.expenditures;
    opens view.inventory;
    opens view.mainview;
    opens view.management;
    opens view.registration;
    opens view.reports;
}