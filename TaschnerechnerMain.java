package taschenrechner;

import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TaschnerechnerMain extends Application{

	public static void main(String[] args) {
		//der Start
		launch(args);

	}

	@Override
	public void start(Stage meineStage) throws Exception {
		//die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und
		//die Größe übergeben
		Scene meineScene = new Scene(root, 400, 250);
		//den Titel über stage setzen
		meineStage.setTitle("Taschenrechner");
		//die Szene setzen
		meineStage.setScene(meineScene);
		//und anzeigen
		meineStage.show();
	}

}
