package parkhaus;

public class parkhaus { 

    // Array für Autos
    auto[] autos = new auto[100]; 

    // Anzahl Parkplätze
    int parkplatz = 100;

    // Konstruktor
    parkhaus() { }

    // zeigt freie Plätze an
    void anzahlFreiePlaetze() {
        System.out.println("Es sind " + parkplatz + " Parkplätze frei");
    }

    // ein Platz wird belegt
    void parklatzbenutzen() {
        parkplatz--;
    }

    // wenn keine Plätze frei sind
    void parkplatzBelegt() {
        System.out.println("Das Parkhaus ist voll");
    }

    // erstellt Autos für das Parkhaus
    void autoErstellen() {
        for (int i = 0; i < 100; i++) {
            autos[i] = new auto("auto" + i);
        }
    }

    // Auto fährt rein
    void reinfahren() {
        System.out.println(autos[1] + " fährt ins Parkhaus rein. Drücken Sie 'j' für Ticket");
    }

    // Auto fährt raus (noch leer)
    void rausfahren() { }
}
