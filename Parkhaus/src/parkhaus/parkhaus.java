package parkhaus;

public class parkhaus {

	auto [] autos = new auto[100];

	int parkplatz = 100;
	parkhaus(){
		
		
	}
	void anzahlFreiePlaetze() {
		System.out.println("Es sind "+ parkplatz+" Parkplätze frei");
	}
	void parklatzbenutzen() {
		parkplatz --;
	}
	void parkplatzBelegt() {
		System.out.println("das Parkhaus hat keine freie Parkplätze zur verfügung ");
	}
	void autoErstellen() {
		for(int i= 0; i<100; i++ ) {
			autos[i] = new auto("auto" + (i));}
		}
	void reinfahren() {
		
			System.out.println(autos[1]+" fährt ins Parkhaus rein drücken sie 'j' wenn sie ein Ticket ziehen wollen");
			
		
}
	void rausfahren() {
		
	}

	}

