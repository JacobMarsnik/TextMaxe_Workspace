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

public class View2 extends Application implements EventHandler<ActionEvent>{

	
	private final String TITLE = "Text Maze V1.0";
	Stage window;
	Scene scene;
	Button enter;
	Button help;
	private final int SCENE_WIDTH  = 750;
	private final int SCENE_HEIGHT = 500;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
						
	primaryStage.setTitle(	TITLE );
    
	//building enter button and text field
	enter = new Button("enter");
	help = new Button("help");
    
	
	
	TextField in  = new TextField(); 
	TextField in2 = new TextField();
	Label ceanterdText = new Label("I want this text centered");
	
    HBox hbox = new HBox(help, enter);
    
   // hbox.getChildren().add(in);
   // hbox.getChildren().add(in2);
   
   // This class will handle the button events
    enter.setOnAction(this);
   
    Scene scene = new Scene(hbox, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
}

//When button is clicked, handle() gets called
//Button click is an ActionEvent (also MouseEvents, TouchEvents, etc...)
@Override
public void handle(ActionEvent event) {
	int click =0; 
	if (event.getSource() == enter) {	
		while(click <= 10) {
		
    System.out.println("click");
	
	click++;
    		System.out.println(click);
		}//end of while
	}//end of if
}//end of handle

}//closing bracket
