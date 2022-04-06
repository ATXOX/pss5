
// source: Chapter 14 - introduction to Java Programming, 10th edition

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class board extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Place nodes in the pane
        int flag = 1;
        Rectangle rectangle= new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(5);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.TRANSPARENT);
        rectangle.setStrokeType(StrokeType.INSIDE);
        rectangle.setStrokeWidth(1);
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                pane.add(rectangle, i, j);
                if (flag == 1){
                    rectangle.setWidth(5);
                    rectangle.setHeight(5);
                    rectangle.setFill(Color.BLACK);
                    rectangle.setStroke(Color.TRANSPARENT);
                    rectangle.setStrokeType(StrokeType.INSIDE);
                    rectangle.setStrokeWidth(1);

                    flag = 0;
                }
                if (flag == 0){
                    rectangle.setWidth(5);
                    rectangle.setHeight(5);
                    rectangle.setFill(Color.WHITE);
                    rectangle.setStroke(Color.TRANSPARENT);
                    rectangle.setStrokeType(StrokeType.INSIDE);
                    rectangle.setStrokeWidth(1);

                    flag = 1;
                }
            }
        }

        

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("board"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

