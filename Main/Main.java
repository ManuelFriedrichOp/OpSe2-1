package Main;

import gui.VolkshochschulkursControl;
import gui.VolkshochschulkursView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		new VolkshochschulkursControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch();
	}
}