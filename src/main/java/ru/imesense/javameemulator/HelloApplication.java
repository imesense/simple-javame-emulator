package ru.imesense.javameemulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        var scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Java ME Emulator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
