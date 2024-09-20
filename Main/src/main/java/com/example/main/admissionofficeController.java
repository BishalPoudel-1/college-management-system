package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class admissionofficeController {

    @FXML
    private Button Dashboard;

    @FXML
    private AnchorPane Dashboard1;

    @FXML
    private Button course;

    @FXML
    private AnchorPane course1;

    @FXML
    private Label dateLabel;

    @FXML
    private Button roundedButton;

    @FXML
    private Button student;

    @FXML
    private AnchorPane student1;

    @FXML
    private Button teacher;

    @FXML
    private AnchorPane teacher1;

    @FXML
    void getDashboard(ActionEvent event) {
        Dashboard1.setVisible(true);
        course1.setVisible(false);
        student1.setVisible(false);
        teacher1.setVisible(false);
    }

    @FXML
    void getcourse(ActionEvent event) {
        Dashboard1.setVisible(false);
        course1.setVisible(true);
        student1.setVisible(false);
        teacher1.setVisible(false);
    }

    @FXML
    void getstudent(ActionEvent event) {
        Dashboard1.setVisible(false);
        course1.setVisible(false);
        student1.setVisible(true);
        teacher1.setVisible(false);
    }

    @FXML
    void getteacher(ActionEvent event) {
        Dashboard1.setVisible(false);
        course1.setVisible(false);
        student1.setVisible(false);
        teacher1.setVisible(true);
    }
    public void future(ActionEvent e) throws IOException {
        ErrorController.showAlert(Alert.AlertType.INFORMATION,"Future","Due to time limitation feature will be adding soon");
    }
}
