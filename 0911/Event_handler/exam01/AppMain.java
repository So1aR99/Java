package com.example.fxappbuttonevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox();
        root.setPrefSize(200, 50);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);       // 여백

        // 버튼 달기
        Button btn1 = new Button("OK");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // btn1을 눌렀을때 내용
                System.out.println("OK 클릭");
            }
        });

        Button btn2 = new Button("Cancel");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // btn2를 눌렀을때 내용
                System.out.println("Cancel 클릭");
            }
        });

        //root.getChildren().add(btn1);
        //root.getChildren().add(btn2);
        root.getChildren().addAll(btn1, btn2);

        Scene scene = new Scene(root);

        primaryStage.setTitle("메인화면");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
