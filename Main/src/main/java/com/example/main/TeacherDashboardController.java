package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class TeacherDashboardController {

    @FXML
    private AnchorPane Dashboard;

    @FXML
    private Button course;

    @FXML
    private AnchorPane course1;

    @FXML
    private Label dateLabel;

    @FXML
    private Button libary;

    @FXML
    private AnchorPane libary1;

    @FXML
    private Button roundedButton;

    @FXML
    private Button student;

    @FXML
    private AnchorPane student1;

    @FXML
    private Button submission;

    @FXML
    void course(ActionEvent event) {

    }

    @FXML
    void getcourse(ActionEvent event) {
        course1.setVisible(true);
        libary1.setVisible(false);
        student1.setVisible(false);
        Dashboard.setVisible(false);
    }
    @FXML
    void getCourse(ActionEvent event) {
        course1.setVisible(true);
        libary1.setVisible(false);
        student1.setVisible(false);
        Dashboard.setVisible(false);
    }

    @FXML
    void getDashboard(ActionEvent event) {
        course1.setVisible(false);
        libary1.setVisible(false);
        student1.setVisible(false);
        Dashboard.setVisible(true);
    }

    @FXML
    void getLibary(ActionEvent event) {
        course1.setVisible(false);
        libary1.setVisible(true);
        student1.setVisible(false);
        Dashboard.setVisible(false);
    }

    @FXML
    void getStudent(ActionEvent event) {
        course1.setVisible(false);
        libary1.setVisible(false);
        student1.setVisible(true);
        Dashboard.setVisible(false);
    }



}
