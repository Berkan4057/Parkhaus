package parkhaus;

public class ticketAutomat { //tests

	long startTimer;
	long endTimer;
	int ticket = 0;
	ticketAutomat(){
		
	}
	void ticketZiehen() {
		System.out.println("ticket wird gedruckt");
		ticket ++;
		startTimer = System.currentTimeMillis() / 1000;
	}
	void ticketBezahlen() {
		endTimer =  System.currentTimeMillis() / 1000;
		long parkDauer = endTimer - startTimer;
		System.out.println("Sie haben für "+ (parkDauer/60)+ "Minuten parkiert");
		if (parkDauer<60) {
			System.out.println("Sie schulden 0 CHF");
		}
		else if((parkDauer>60)&&(parkDauer<600)) {
			System.out.println("Sie schulden 2.50 CHF");
		}
		else if(parkDauer> 600) {
			System.out.println("Sie schulden 5 CHF");
		}

		ticket --;
		System.out.println("wurde bezahlt");
		
	}
}
