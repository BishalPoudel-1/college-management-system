package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button try1;

    @FXML
    private Button cancelButton;
    @FXML
    private RadioButton r1,r2,r3,r4,r5,r6;
    @FXML
    private TextField Email;
    @FXML
    private PasswordField Password;
    @FXML
    private Label errorLabel1;


//    public void getPassword (ActionEvent e) {
//       String password = Password.getText();
//    }
//    public void getEmail (ActionEvent e)  {
//        String email = Email.getText();
//    }
//    public void Role (ActionEvent e) {
//        String role ="";
//        if(r1.isSelected()) {
//            role =  r1.getText();
//        }
//        else if(r2.isSelected()) {
//             role =r2.getText();
//        }
//        else if(r3.isSelected()) {
//            role =r3.getText();
//        }
//        else if(r4.isSelected()) {
//            role =r4.getText();
//        }
//        else{
//            role =r5.getText();
//        }
//    }
    public String getPassword() {
    return Password.getText();
}

    public String getEmail() {
        return Email.getText();
    }

    public String Role() {
        if (r1.isSelected()) {
            return r1.getText();
        } else if (r2.isSelected()) {
            return r2.getText();
        } else if (r3.isSelected()) {
            return r3.getText();
        } else if (r4.isSelected()) {
            return r4.getText();
//        } else if (r5.isSelected()) {
//            return r5.getText();
        }
        else {
            return r5.getText();
        }
    }


    private ValidateCredentials validator = new ValidateCredentials();
    public void displayDetails(ActionEvent e) throws IOException {
        String email = getEmail();
        String password = getPassword();
        String role = Role();

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);

        if (validator.validateCredentials(email, password, role)) {
//            System.out.println("Login successful!");
//            System.out.println("Email: " + email);
//            System.out.println("Password: " + password);
//            System.out.println("Role: " + role);

//            System.out.println("Ok");
           switchToDashboard(e,role);

        } else if (email.isEmpty() || password.isEmpty() || role.isEmpty()) {
            ErrorController.error(errorLabel1, "All fields must be filled out.");
            ErrorController.showAlert(Alert.AlertType.ERROR,"empty field","All fields must be filled out.");
        }
        else{
            ErrorController.error(errorLabel1,"Invalid email, password, or may be role.");
            ErrorController.showAlert(Alert.AlertType.ERROR,"invalid credential","Invalid email, password, or may be role.");
        }
    }

    private void switchToDashboard(ActionEvent e, String role) throws IOException {
        String fxmlFile = "";
        switch (role.toLowerCase()) {
            case "student":
                fxmlFile = "StudentDashboard.fxml";
                break;
            case "teacher":
                fxmlFile = "teacherdas.fxml";
                break;
            case "admission office":
                fxmlFile = "admissionoffice.fxml";
                break;
            case "librarian":
                fxmlFile = "LibrarianDashboard.fxml";
                break;
            case "admin":
                fxmlFile = "Admin.fxml";
                break;

            default:
                ErrorController.error(errorLabel1,"Undefine role");
                return;
        }
        // Change scene to the appropriate dashboard
        System.out.println(fxmlFile);
        Controller.changeScene(e, fxmlFile, role + " Dashboard");
    }

    public void cancelButtonOnAction (ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    ///test case.............>>>>>>>>>>>>>>>>>>>>


    public void tableDisplay(ActionEvent e) throws IOException {
        Controller.changeScene(e, "displaydata.fxml",  " Dashboard");
    }
    @FXML
    void getallform(ActionEvent e)throws IOException
    {
        Controller.changeScene(e,"allforms.fxml","foms");
    }
    @FXML
    void getadmin(ActionEvent e)throws IOException
    {
        Controller.changeScene(e,"Admin.fxml","Admin");
    }


}
