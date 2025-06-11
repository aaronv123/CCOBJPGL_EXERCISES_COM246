package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginpageController {

    @FXML
    private void switchTofirstscene() throws IOException {
        App.setRoot("firstscene");
    }
}