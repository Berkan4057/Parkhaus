package parkhaus;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Objekte erstellen
        parkhaus parkhaus1 = new parkhaus();
        ticketAutomat ticketAutomat1 = new ticketAutomat();
        Schranke schranke1 = new Schranke();

        // Startzustand
        parkhaus1.autoErstellen();
        parkhaus1.anzahlFreiePlaetze();
        parkhaus1.reinfahren();

        // Eingabe vom Nutzer
        String input = scanner.nextLine();

        // wenn Ticket gezogen wird und Platz frei ist
        if (input.equals("j") && parkhaus1.parkplatz > 0) {
            ticketAutomat1.ticketZiehen();
            parkhaus1.parklatzbenutzen();
            schranke1.öffnen();

            System.out.println("Drücken Sie 'b' wenn Sie Ihre Parkgebühren bezahlen möchten");
            String bezahlen = scanner.nextLine();

            // Ticket wird bezahlt
            if (bezahlen.equals("b")) {
                ticketAutomat1.ticketBezahlen();
            } else {
                parkhaus1.parkplatzBelegt();
            }
        }
    }
}
