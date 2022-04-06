
// source: Chapter 14 - introduction to Java Programming, 10th edition

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws FileNotFoundException {
        // Create a pane and set its properties
        BorderPane pane = new BorderPane();
        pane.setTop(getHTop()); 
        pane.setBottom(getHBot());


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    private HBox getHTop() throws FileNotFoundException {
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Label("Number1"));
        TextField num1 = new TextField();
        hBox.getChildren().add(num1);
        hBox.getChildren().add(new Label("Number2"));
        TextField num2 = new TextField();
        hBox.getChildren().add(num2);
        hBox.getChildren().add(new Label("Result"));
        TextField tf = new TextField();
        tf.setEditable(false);
        hBox.getChildren().add(tf);
        return hBox;
    }
    private HBox getHBot() throws FileNotFoundException {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.setAlignment(Pos.CENTER);
        Button add = new Button("ADD");
        hBox.getChildren().add(add);
        Button sub = new Button("SUB");
        hBox.getChildren().add(sub);
        Button mul = new Button("MUL");
        hBox.getChildren().add(mul);
        Button div = new Button("DIV");
        hBox.getChildren().add(div);
        return hBox;
    }
    public static void main(String[] args) {
        launch(args);
    }
}

