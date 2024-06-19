package com.example.user_aashish;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField username;
    public TextField password;
    @FXML
    private Label welcomeText;

    // Define instance variables
    private String correctUsername = "Aashish";
    private String correctPassword = "456";
    private int failedAttempts = 0;
    private static final int MAX_FAILED_ATTEMPTS = 5;

    @FXML
    protected void onLogInButtonClick() {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            welcomeText.setText("Success!!!");
        } else {
            failedAttempts++;
            if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
                welcomeText.setText("Sorry, Your Account is Locked!!!");
            } else {
                welcomeText.setText("Sorry, Invalid Username or Password.");
            }
        }
    }
}
