package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ActivitycenterController {

    @FXML
    private Button HomeButton;

    @FXML
    public void gohome(ActionEvent event) throws IOException {
    System.out.println("Home Button Clicked");
    App.setRoot("Homepage");

 
    }
    
}
