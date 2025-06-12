package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginpageController {

    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        App.setRoot("firstscene");
    }
    
    @FXML
    TextField nametextfield;

    @FXML
    TextField passwordtextfield;

    @FXML
    Button loginButton;


    public static User user;


        public void loginButtonHandler(ActionEvent event) throws IOException {

        // Get text from text field
        String username = nametextfield.getText();
        String password = passwordtextfield.getText();  
  
        user = new User(username, password);

        File accountsfile = new File("Accounts.txt");

        if (accountsfile.exists()) {

            Scanner filescanner = new Scanner(accountsfile);
            while (filescanner.hasNextLine()) {

                String data = filescanner.nextLine();
    
                String username_from_file = data.split(",")[0];
                String password_from_file = data.split(",")[1];


                if (username_from_file.equals(user.getUsername()) && password_from_file.equals(user.getPassword())) {
                    
                    System.out.println("Login successful");

                    
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage.fxml"));

                } 
            }
        }
    }    
}