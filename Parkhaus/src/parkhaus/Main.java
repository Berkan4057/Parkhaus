package parkhaus;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		parkhaus parkhaus1 = new parkhaus();
		ticketAutomat ticketAutomat1 = new ticketAutomat();
		Schranke schranke1 = new Schranke();
		parkhaus1.autoErstellen();
		parkhaus1.anzahlFreiePlaetze();
		parkhaus1.reinfahren();
		String input = scanner.nextLine();
		if(input.equals("j") && parkhaus1.parkplatz > 0) {
			ticketAutomat1.ticketZiehen();
			parkhaus1.parklatzbenutzen();					//SRP
			schranke1.öffnen();								//SRP
			System.out.println("Drücken sie 'b' wenn sie ihre Parkgebühren bezahlen möchten");
			String bezahlen = scanner.nextLine();
			if (bezahlen.equals("b")) {
				ticketAutomat1.ticketBezahlen();			//SRP
		}
		else {
			parkhaus1.parkplatzBelegt();					//SRP
		}
	}

}
}
