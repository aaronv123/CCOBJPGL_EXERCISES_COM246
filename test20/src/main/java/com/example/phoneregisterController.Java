package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class phoneregisterController {

    @FXML
    private Label phareacode;

    @FXML
    private ImageView phflag;

    @FXML
    private TextField spphoneno;

    @FXML
    private Button nextbtn;

    // Initialize method (optional, called after FXML is loaded)
    @FXML
    private void initialize() {
        // You can add initialization code here if needed
        phareacode.setText("+63");
        // For example, set up event handlers:
        nextbtn.setOnAction(event -> handleNext());
    }

    // Example handler for Next button
    private void handleNext() {
        String phoneNumber = spphoneno.getText();
        System.out.println("Phone number entered: " + phoneNumber);
        // Add your logic here for what happens on clicking Next
    }
}