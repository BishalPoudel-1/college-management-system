package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public static Stage getCurrentStage(ActionEvent e) {
         Node node = (Node) e.getSource();
         Stage stage = (Stage) node.getScene().getWindow();
         return stage;
    }
    public static void changeScene(ActionEvent event, String sceneName, String title) throws IOException {
          FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource(sceneName));
          Scene scene = new Scene(fxmlLoader.load());

          Stage stage = getCurrentStage(event);
          stage.setTitle(title);
          stage.setScene(scene);
    }
}
