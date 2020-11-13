module TMS {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.swt;

    opens main;
    opens view.aboutus;
    opens view.aboutus.controllers;
    opens view.accountmanagement;
    opens view.accountmanagement.controllers;
    opens view.backup_restore;
    opens view.backup_restore.controllers;
    opens view.dashboard;
    opens view.dashboard.controllers;
    opens view.expenditures;
    opens view.expenditures.controllers;
    opens view.inventory;
    opens view.inventory.controllers;
    opens view.mainview;
    opens view.mainview.controllers;
    opens view.management;
    opens view.management.controllers;
    opens view.registration;
    opens view.registration.controllers;
    opens view.reports;
    opens view.reports.controllers;
}