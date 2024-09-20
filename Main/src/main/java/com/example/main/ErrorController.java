package com.example.main;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class ErrorController {

    public static void error (Label error,String errorName){

            error.setText(errorName);
            error.setVisible(true);
            error.setStyle("-fx-text-fill: red;-fx-font-weight: bold;");
    }
    public static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
