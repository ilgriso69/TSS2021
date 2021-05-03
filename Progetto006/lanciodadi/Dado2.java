package lanciodadi;

public class Dado2 {

	int valore;
	
	static int numero_lanci;
	
	static int due;
	static int tre;
	static int quattro;
	static int cinque;
	static int sei;
	static int sette;
	static int otto;
	static int nove;
	static int dieci;
	static int undici;
	static int dodici;
	
	
	
	public Dado2() {
		
	}
	
	
	public void mostraLancio() {
		
		numero_lanci++;
		
		int valore1 = (int)(Math.random()*6)+1;
		int valore2 = (int)(Math.random()*6)+1;
		
		valore = valore1+valore2;
		
		System.out.printf("\nLancio n. %d",numero_lanci);
		System.out.println("\nRisultato lancio:");
		
		
		// stampa primo dado
		
		System.out.println("\nDado1:");
		
		switch (valore1) {
		case 1:
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*  o  *");
		System.out.println("*     *");
		System.out.println("*******");
		break;
		
		
		case 2:
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*     *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 3:
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*  o  *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 4:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*     *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 5:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*  o  *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 6:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		

		default:
		break;
		}
		
		
		// stampa secondo  dado
		
		
		System.out.println("\nDado2:");
		
		switch (valore2) {
		case 1:
		
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*  o  *");
		System.out.println("*     *");
		System.out.println("*******");
		break;
		
		
		case 2:
			
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*     *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 3:
			
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*  o  *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 4:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*     *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 5:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*  o  *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 6:
			
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		

		default:
		break;
		}
		
		
		
		// stampa risultato (dado1+dado2)
		
		System.out.println("\nRisultato : "+valore);
		
		// memorizzazione valore estrazione
		
		switch (valore) {
		case 2:
		due++;	
		break;
		
		case 3:
		tre++;	
		break;
		
		case 4:
		quattro++;	
		break;
			
		case 5:
		cinque++;	
		break;
		
		case 6:
		sei++;	
		break;
		
		case 7:
		sette++;	
		break;

		case 8:
		otto++;	
		break;

		case 9:
		nove++;	
		break;

		
		case 10:
		dieci++;	
		break;

		case 11:
		undici++;	
		break;

		case 12:
		dodici++;	
		break;

		
		default:
			break;
		}
		
		
	}
	
	
	
}
