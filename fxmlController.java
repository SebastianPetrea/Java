package taschenrechner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class fxmlController {
	@FXML private TextField zahl1;
	@FXML private TextField zahl2;
	@FXML private Label ergebnis;
	
	//Die Auswahl
	@FXML private ComboBox<String> auswahl;
	
	//Wenn auf dem Beenden Knopf gedrückt wird schließt sich die Anwendung
	@FXML protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}
	
	//Die Methode berechnet die eingegebenen Zahlen
	@FXML protected void ausahlKlick(ActionEvent event) {
		// ergebnis muss initialisiert werden
		double zahl_1 = 0, zahl_2 = 0, ergebnis_ausgabe = 0;
		String ausgabe;
		
		DecimalFormat format = new DecimalFormat();		
		//Es sollen nur 2 nachkommastellen angezeigt werden
		format.setMinimumFractionDigits(0);
		format.setMaximumFractionDigits(2);

		//Fehler abfangen
		try {
			// Die zahl Konvertieren und in Double umwandeln
			Number wert = NumberFormat.getNumberInstance(Locale.GERMANY).parse(zahl1.getText());
			zahl_1 = wert.doubleValue();
		} catch (Exception ParseException) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Ihre eingabe ist nicht gültig!");
			alert.setContentText("Eingabefehler");
			alert.showAndWait();
			zahl1.clear();
			zahl2.clear();
		}

		try {
			Number wert = NumberFormat.getNumberInstance(Locale.GERMANY).parse(zahl2.getText());
			zahl_2 = wert.doubleValue();
		} catch (Exception ParseException) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Ihre eingabe ist nicht gültig!");
			alert.setContentText("Eingabefehler");
			alert.showAndWait();
			zahl1.clear();
			zahl2.clear();
		}
		// welche Operation ist ausgewÃ¤hlt?
		if (auswahl.getSelectionModel().getSelectedIndex() == 0)
			ergebnis_ausgabe = zahl_1 + zahl_2;
			ausgabe = format.format(ergebnis_ausgabe);
			ergebnis.setText(ausgabe);
		if (auswahl.getSelectionModel().getSelectedIndex() == 1)
			ergebnis_ausgabe = zahl_1 - zahl_2;
			ausgabe = format.format(ergebnis_ausgabe);
			ergebnis.setText(ausgabe);
		if (auswahl.getSelectionModel().getSelectedIndex() == 2)
			ergebnis_ausgabe = zahl_1 * zahl_2;
			ausgabe = format.format(ergebnis_ausgabe);
			ergebnis.setText(ausgabe);
		if (auswahl.getSelectionModel().getSelectedIndex() == 3) {
			ergebnis_ausgabe = zahl_1 / zahl_2;
			ausgabe = format.format(ergebnis_ausgabe);
			ergebnis.setText(ausgabe);
		}
		
		
	}
	@FXML void initialize() {
		//die Einträge im Kombinationsfeld setzen
		auswahl.getItems().addAll("Addition", "Subtraktion", "Multiplikation", "Division");
		}
}
