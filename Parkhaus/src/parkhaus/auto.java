package parkhaus;

public class auto { 

    // speichert die Marke vom Auto
    private String marke;

    // Konstruktor mit Marke
    public auto(String marke){
        this.marke = marke;
    }
	
    // gibt die Marke zurück
    @Override
    public String toString() {
        return marke;
    }
}
