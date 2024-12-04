package gui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import business.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import ownUtil.MeldungsfensterAnzeiger;
import business.Volkshochschulkurs;
import business.VolkshochschulkursModel;

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
				this.view.zeigeInformationsfensterAn("Volkshochschulkurs wurde gespeichert");
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
	public void leseAusDatei(String typ){
    	
    	try {
			if("csv".equals(typ)) {
				this.model.leseVolkshochschulkursAusCsvDatei();
				this.view.zeigeInformationsfensterAn("Volkshochschulkurs wurde importiert");
			} 
			else if("txt".equals(typ)) {
				this.model.leseVolkshochschulkursAusTxtDatei();
				this.view.zeigeInformationsfensterAn("Volkshochschulkurs wurde importiert");
			}
			else {
				this.view.zeigeInformationsfensterAn("Noch nicht implementiert");
			}
		} 
		catch (IOException ioe) {
			view.zeigeFehlermeldungsfensterAn("IOException");
			ioe.printStackTrace();
		} catch(Exception exc) {
			view.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Importieren!");
			exc.printStackTrace();
		} 
	}
}