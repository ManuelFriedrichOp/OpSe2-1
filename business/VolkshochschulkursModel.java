package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class VolkshochschulkursModel {
	
	public Volkshochschulkurs vhk;
	
	public void schreibeVolkshochschulkursInCsvDatei() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Volkshochschulkurs.csv", true));
		aus.write(this.getVhk().gibVolkshochschulkursZurueck(';'));
		aus.close();
	}
	
	public Volkshochschulkurs getVhk() {
		return vhk;
	}

	public void setVhk(Volkshochschulkurs vhk) {
		this.vhk = vhk;
	}
	
}