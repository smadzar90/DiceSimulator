/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author stipanmadzar
 */

public class JavaFXApplication extends Application  {
    
    
    
    public void start(Stage primaryStage) {
        
        
        primaryStage.setTitle("Dice Simulator");
        primaryStage.setResizable(true);
        
        GridPane gp = new GridPane();
        HBox Hbox = new HBox();
        Hbox.setAlignment(Pos.CENTER);
        Hbox.setPadding(new Insets(0));
        Button button = new Button();
        button.setText("Toss");
        Hbox.getChildren().add(button);
        
        HBox Hbox2 = new HBox(15);
        Hbox2.setPadding(new Insets(10, 10, 0, 10));
        
        ImageView view1 = new ImageView();
        ImageView view2 = new ImageView();
        view1.setFitHeight(145);
        view1.setFitWidth(142.5);
        view2.setFitHeight(145);
        view2.setFitWidth(142.5);
        Hbox2.getChildren().addAll(view1, view2);
        
        VBox Vbox = new VBox(10);
        Vbox.getChildren().addAll(Hbox2, Hbox);
        gp.add(Vbox, 0, 0);
        gp.setAlignment(Pos.TOP_LEFT);
        
        
        button.setOnAction(e ->
        {
             Random rand = new Random();
             int random1 = rand.nextInt(6) + 1;
             int random2 = rand.nextInt(6) + 1;
             Image image1 = new Image("/Users/stipanmadzar/Desktop/ProjectsToShow/DiceSimulator/src/javafxapplication/" + random1 + "Die.b             mp");
             Image image2 = new Image("/Users/stipanmadzar/Desktop/ProjectsToShow/DiceSimulator/src/javafxapplication" + random2 + "Die.bm             p");
             view1.setImage(image1);
             view2.setImage(image2);
        });

        Scene scene = new Scene(gp, 320, 200);
        primaryStage.setScene(scene);
        primaryStage.show();       
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
