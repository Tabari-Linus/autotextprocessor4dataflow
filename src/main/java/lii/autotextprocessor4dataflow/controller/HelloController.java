package lii.autotextprocessor4dataflow.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    // Method to handle the button click event
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to AutoTextProcessor for DataFlow!");
    }
}