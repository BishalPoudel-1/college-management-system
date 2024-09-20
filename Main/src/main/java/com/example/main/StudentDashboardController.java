package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StudentDashboardController {

//    @FXML
//    private AnchorPane MainDashboard1;
//
//    @FXML
//    private Button allform;
//
//    @FXML
//    private AnchorPane allform1;
//
//    @FXML
//    private Button backtoallform;
//
//    @FXML
//    private Button backtoallform1;
//
//    @FXML
//    private Button backtoallform2;
//
//    @FXML
//    private Button backtoallform3;
//
//    @FXML
//    private Button backtoallform5;
//
//    @FXML
//    private TextField c_counselorname;
//
//    @FXML
//    private DatePicker c_date;
//
//    @FXML
//    private TextField c_email;
//
//    @FXML
//    private TextField c_name;
//
//    @FXML
//    private TextField c_note;
//
//    @FXML
//    private TextField c_stdid;
//
//    @FXML
//    private AnchorPane counselling_form;
//
//    @FXML
//    private Button counselling_form1;
//
//    @FXML
//    private Button counsellingform1;
//
//    @FXML
//    private Button courses;
//
//    @FXML
//    private AnchorPane courses1;
//
//    @FXML
//    private Label dateLabel;
//
//    @FXML
//    private Button grades;
//
//    @FXML
//    private AnchorPane grades1;
//
//    @FXML
//    private Button libary;
//
//    @FXML
//    private AnchorPane libary1;
//
//    @FXML
//    private Button mainDashboard;

    @FXML
    private Button MainDashboard1;

    @FXML
    private AnchorPane courses;

    @FXML
    private Button courses1;

    @FXML
    private Label dateLabel;

    @FXML
    private Button forms;

    @FXML
    private AnchorPane grades;

    @FXML
    private Button grades1;

    @FXML
    private AnchorPane libary;

    @FXML
    private Button libary1;

    @FXML
    private AnchorPane mainDashboard;

    @FXML
    private Button roundedButton;

    @FXML
    void getCourse(ActionEvent event) {
        visibility(false, true, false, false);
    }

    @FXML
    void getGrade(ActionEvent event) throws IOException {
        visibility(false, false, true, false);
    }

    @FXML
    void getLibary(ActionEvent event) throws IOException {
        visibility(false, false, false, true);
    }

    @FXML
    void getMainDashboard(ActionEvent event) {

        visibility(true, false, false, false);
    }

    private void visibility(boolean b, boolean b1, boolean b2, boolean b3) {
        mainDashboard.setVisible(b);
        courses.setVisible(b1);
        grades.setVisible(b2);
        libary.setVisible(b3);

    }
    @FXML
    void getallforms(ActionEvent e ) throws IOException{
        Controller.changeScene(e,"Allforms.fxml","All Form");
    }
    public void future(ActionEvent e) throws IOException {
        ErrorController.showAlert(Alert.AlertType.INFORMATION,"Future","Due to time limitation feature will be adding soon");
    }
   
}
