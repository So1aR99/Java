package com.example.fxplusapp;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private TextField txt1;
    @FXML private TextField txt2;
    @FXML private TextField txtResult;

    @FXML public void onBtnResult() {
        int num1 = Integer.parseInt(txt1.getText());
        int num2 = Integer.parseInt(txt2.getText());
        int result = num1 + num2;

        txtResult.setText(String.valueOf(result));
    }

}
