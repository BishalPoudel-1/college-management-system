package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class AllFormsController {

    @FXML
    private Button Questionform;

    @FXML
    private Button ReportForm;

    @FXML
    private Button Sportsform;

    @FXML
    private AnchorPane allform1;

    @FXML
    private Button back1;

    @FXML
    private TextField c_counselorname;

    @FXML
    private DatePicker c_date;

    @FXML
    private TextField c_email;

    @FXML
    private TextField c_id;

    @FXML
    private TextField c_name;

    @FXML
    private TextField c_note;

    @FXML
    private Button c_submit;

    @FXML
    private Button counsellingform;

    @FXML
    private Label dateLabel;

    @FXML
    private Button imageButton1;

    @FXML
    private Button imageButton11;

    @FXML
    private Button imageButton12;

    @FXML
    private Button imageButton13;

    @FXML
    private Button imageButton14;

    @FXML
    private Button logout;

    @FXML
    private TextField p_course;

    @FXML
    private TextField p_email;

    @FXML
    private TextField p_form;

    @FXML
    private TextField p_name;

    @FXML
    private TextField p_stdid;

    @FXML
    private Button p_submit;

    @FXML
    private Button problemForm;

    @FXML
    private AnchorPane problemForms;

    @FXML
    private TextField q_email;

    @FXML
    private TextField q_id;

    @FXML
    private TextField q_name;

    @FXML
    private TextField q_question;

    @FXML
    private AnchorPane questionform;

    @FXML
    private TextField r_id;

    @FXML
    private TextField r_incident;

    @FXML
    private TextField r_mail;

    @FXML
    private TextField r_name;

    @FXML
    private TextField r_stdname;

    @FXML
    private AnchorPane reportform;

    @FXML
    private Button return2;

    @FXML
    private Button return4;

    @FXML
    private Button return5;

    @FXML
    private Button return6;

    @FXML
    private TextField s_achievement;

    @FXML
    private DatePicker s_date;

    @FXML
    private TextField s_id;

    @FXML
    private TextField s_mail;

    @FXML
    private TextField s_name;

    @FXML
    private TextField s_sportname;

    @FXML
    private AnchorPane sports_forms;

    @FXML
    private AnchorPane counselingForm;


    @FXML
    private Button submitquestion;

    @FXML
    private Button submitreport;

    @FXML
    private Button submitsportforms;


    @FXML
    void getCounsellingForm(ActionEvent event) {
        formvisibility(false, true, false, false, false, false);
    }

    @FXML
    void getProblemForm(ActionEvent event) {
        formvisibility(false, false,true,  false, false, false);
    }

    @FXML
    void getQuestionForm(ActionEvent event) {
        formvisibility(false,  false, false, false, false,true);
    }

    @FXML
    void getReporrtform(ActionEvent event) {
        formvisibility(false,  false, false, false,true, false);
    }

    @FXML
    void getSportForm(ActionEvent event) {
        formvisibility(false, false, false, false, true, false);
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Controller.changeScene(event,"login.fxml","Login Page");
    }

    @FXML
    void returntoAllform(ActionEvent event) {
        formvisibility(true,false,false,false,false,false);
    }
    @FXML
    void getallform(ActionEvent event) {
        formvisibility(true,false,false,false,false,false);
    }
    @FXML
    void getStudentDashboard(ActionEvent e) throws IOException {
        Controller.changeScene(e,"StudentDashboard.fxml","Student Dashboard");
    }
    @FXML
    void submitforms(ActionEvent event) {
        try {
            if (allform1.isVisible() && validateCounsellingFields()) {
                saveCounsellingToCSV();
            } else if (problemForms.isVisible() && validateProblemFields()) {
                saveProblemToCSV();
            } else if (questionform.isVisible() && validateQuestionFields()) {
                saveQuestionToCSV();
            } else if (reportform.isVisible() && validateReportFields()) {
                saveReportToCSV();
            } else if (sports_forms.isVisible() && validateSportsFields()) {
                saveSportsToCSV();
            } else {
                ErrorController.showAlert(Alert.AlertType.ERROR, "Error", "Please fill in all required fields.");
                return;
            }
            ErrorController.showAlert(Alert.AlertType.INFORMATION, "Success", "Form submitted successfully!");
        } catch (IOException e) {
            ErrorController. showAlert(Alert.AlertType.ERROR, "Error", "Failed to save form data.");
            e.printStackTrace();
        }
    }


    void formvisibility  (boolean b,boolean b1,boolean b2,boolean b3,boolean b4,boolean b5){
        allform1.setVisible(b);
        counselingForm.setVisible(b1);
        problemForms.setVisible(b2);
        sports_forms.setVisible(b3);
        reportform.setVisible(b4);
        questionform.setVisible(b5);
    }
    private boolean validateCounsellingFields() {
        TextField[] fields = {c_name, c_email, c_id, c_counselorname, c_note};
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                return false;
            }
        }
        return c_date.getValue() != null;
    }

    private boolean validateProblemFields() {
        TextField[] fields = {p_name, p_email, p_stdid, p_course, p_form};
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean validateQuestionFields() {
        TextField[] fields = {q_name, q_email, q_id, q_question};
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean validateReportFields() {
        TextField[] fields = {r_name, r_mail, r_id, r_incident, r_stdname};
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean validateSportsFields() {
        TextField[] fields = {s_name, s_mail, s_id, s_sportname, s_achievement};
        for (TextField field : fields) {
            if (field.getText().isEmpty()) {
                return false;
            }
        }
        return s_date.getValue() != null;
    }

    private void saveCounsellingToCSV() throws IOException {
        String data = String.join(",",
                c_name.getText(),
                c_email.getText(),
                c_id.getText(),
                Objects.toString(c_date.getValue(), ""),
                c_counselorname.getText(),
                c_note.getText()
        );
        appendToCSV(data);
    }

    private void saveProblemToCSV() throws IOException {
        String data = String.join(",",
                p_name.getText(),
                p_email.getText(),
                p_stdid.getText(),
                p_course.getText(),
                p_form.getText()
        );
        appendToCSV(data);
    }

    private void saveQuestionToCSV() throws IOException {
        String data = String.join(",",
                q_name.getText(),
                q_email.getText(),
                q_id.getText(),
                q_question.getText()
        );
        appendToCSV(data);
    }

    private void saveReportToCSV() throws IOException {
        String data = String.join(",",
                r_name.getText(),
                r_mail.getText(),
                r_id.getText(),
                r_incident.getText(),
                r_stdname.getText()
        );
        appendToCSV(data);
    }

    private void saveSportsToCSV() throws IOException {
        String data = String.join(",",
                s_name.getText(),
                s_mail.getText(),
                s_id.getText(),
                Objects.toString(s_date.getValue(), ""),
                s_sportname.getText(),
                s_achievement.getText()
        );
        appendToCSV(data);
    }

    private void appendToCSV(String data) throws IOException {
        try (FileWriter csvWriter = new FileWriter("formsrequest.csv", true)) {
            csvWriter.append(data).append("\n");
        }
    }


}

