package com.example.fxappcontrollertest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Evnet처리를 여기에 코딩
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1번 버튼 눌림");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("2번 버튼 눌림");
            }
        });
    }
    public void handleBtn3Action(ActionEvent event) {
        System.out.println("3번 버튼 눌림");
    }
}
