/*
Scene  
  |   
  V
Root Pane (Vbox for example)
  |                   |
  V                   V
Pane1                Pane2
*/

package textMaze;

import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public abstract class View2 extends Application implements EventHandler<ActionEvent>{

	String Title = "Text Maze";

	
	public void start(Stage primaryStage) throws Exception {
		// this will use a standard exception handler

		GridPane pane = new GridPane();
		 pane.setAlignment(Pos.CENTER);
		 pane.setHgap(5);
		 pane.setVgap(5);
		 pane.setPadding(new Insets(25,25,25,25)); // set top, right, bottom, left
		 // this allows input fields to be placed in the window

		 TextArea out = new TextArea("Type Here");
		 out.setEditable(false);
		 
		TextField user_in = new TextField();




		 out.setPrefColumnCount(14);
	
		user_in.setPrefColumnCount(10);
		 // this sets the number of spaces in the text fields


		 // these labels are set and used before the text fields as show below
;
		 pane.add(out, 1, 2);
	
		 pane.add(user_in, 1, 3);
		 // call on the labels and text fields to be placed into the window
		 // must be done individually so that location and order can be set by column/row

		 Button calc_button = new Button("ENTER");
		 Button help = new Button("Help Tab");
		 Button lb = new Button("leaderboard tab");
		 
		
		 
		 pane.add(calc_button, 1, 6);
		 pane.add(help, 2, 1);
		 pane.add(lb, 1, 1);
		 // make a button and put it in the Gridpane

		 BorderPane borderPane = new BorderPane();
		 borderPane.setCenter(pane);

		 Scene scene = new Scene(borderPane, 500, 500);
		 primaryStage.setTitle(Title);
		 primaryStage.setScene(scene);
		 primaryStage.show();

		 calc_button.setOnAction(e -> {
		 user_in.clear();
		 
		 });

		}



}//closing bracket
