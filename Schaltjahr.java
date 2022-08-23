
import javax.swing.*;
public class Schaltjahr{

	public static void main(String[] args) {
		// Variablen erstellen
		int schaltjahr;
		int a,b,c;
		boolean ausdruck1,ausdruck2,ausdruck3;
		
		//Das Jahr eingeben
		schaltjahr = Integer.parseInt (JOptionPane.showInputDialog("Bitte geben Sie das Jahr ein: "));
		
		//Das Jahr in zwei Variablen speichern
		b = schaltjahr;
		c = schaltjahr;
		
		//Die berechnung
		a = schaltjahr % 4;
		b = schaltjahr % 100;
		c = schaltjahr % 400;
		
		//Vergleichen
		ausdruck1 = a == 0;
		ausdruck2 = b > 0;
		ausdruck3 = c == 0;
		
		//Die Auswertung ob es ein Schaljahr ist oder nicht
		if (ausdruck1 && ausdruck2)
			System.out.print(schaltjahr + " " + "ist ein Schaltjahr.");
		else
			if (ausdruck1 && ausdruck2 && ausdruck3)
			System.out.print(schaltjahr + " " +"ist ein Schaltjahr1");
		else
			System.out.print(schaltjahr + " " + "ist kein Schaltjahr");

	}

}
