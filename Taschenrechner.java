import javax.swing.JOptionPane;

public class Taschenrechner{
	//Methoden fur die berechnung erstellen
		static double addition(double zahl1, double zahl2) {
			return (zahl1 + zahl2);
		}
		static double subtraktion(double zahl1, double zahl2) {
			return (zahl1 -zahl2);
		}
		static double division(double zahl1, double zahl2) {
			return (zahl1 / zahl2);
		}
		static double multiplication(double zahl1, double zahl2) {
			return (zahl1 * zahl2);
		}
		static double potenz(double basis, double exponent) {
			double ergebnis = 1;
			for (double i= 1; i <= exponent; i++) {
				ergebnis = ergebnis * basis;
			}
			return ergebnis;
		}

		public static void main(String[] args) {
			double eingabeZahl1,eingabeZahl2;
			String rechenart_eingeben;
			char rechenart_auswahl;
			
			//Benutzer eingabe
			eingabeZahl1 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die erste Zahl ein:"));
			eingabeZahl2 = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein:"));
			rechenart_eingeben = JOptionPane.showInputDialog("Wählen Sie die Rechenart aus:\n a addition\n b subtraktion\n c division\n d multiplication\n e potenzrechnung");
			
			rechenart_auswahl = rechenart_eingeben.charAt(0);
			
			switch (rechenart_auswahl) {
				case 'a':
				case 'A':
					System.out.print(eingabeZahl1 + " + " + eingabeZahl2 + " = " + addition(eingabeZahl1,eingabeZahl2));
					break;
				case 'b':
				case 'B':
					System.out.print(eingabeZahl1 + " - " + eingabeZahl2 + " = " + subtraktion(eingabeZahl1,eingabeZahl2));
					break;
				case 'c':
				case 'C':
					System.out.print(eingabeZahl1 + " / " + eingabeZahl2 + " = " + division(eingabeZahl1,eingabeZahl2));
					break;
				case 'd':
				case 'D':
					System.out.print(eingabeZahl1 + " * " + eingabeZahl2 + " = " + multiplication(eingabeZahl1,eingabeZahl2));
					break;
				case 'e':
				case 'E':
					System.out.print(eingabeZahl1 + " ^ " + eingabeZahl2 + " = " + potenz(eingabeZahl1,eingabeZahl2));
					break;
				default:
					System.out.print("Die eingegebene Rechenart ist ungultigültig.");
			}			
			System.exit(0);
		}

}
