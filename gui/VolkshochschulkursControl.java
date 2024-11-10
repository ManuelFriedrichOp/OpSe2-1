package gui;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import business.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import ownUtil.MeldungsfensterAnzeiger;

public class VolkshochschulkursControl {
	
	private VolkshochschulkursView view;
	private VolkshochschulkursModel model;
	
	public VolkshochschulkursControl(Stage primaryStage) throws Exception {
		this.model = new VolkshochschulkursModel();
		this.view = new VolkshochschulkursView(primaryStage, this, model);
	}
	
	public void schreibeVolkshochschulkursInDatei(String typ) {
		try {
			if("csv".equals(typ)) {
				this.model.schreibeVolkshochschulkursInCsvDatei();
				this.view.zeigeInformationsfensterAn("Die Volkshochschulkurse wurden gespeichert");
			} else {
				this.view.zeigeInformationsfensterAn("Noch nicht implementiert");
			}
		} 
		catch (IOException ioe) {
			view.zeigeFehlermeldungsfensterAn("IOException");
			ioe.printStackTrace();
		} catch(Exception exc) {
			view.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
			exc.printStackTrace();
		} 
	}
}