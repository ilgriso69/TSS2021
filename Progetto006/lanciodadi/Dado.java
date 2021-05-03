package lanciodadi;

public class Dado {

	int valore;
	
	static int numero_lanci;
	static int uno;
	static int due;
	static int tre;
	static int quattro;
	static int cinque;
	static int sei;
	
	
	
	public Dado() {
		
	}
	
	
	public void mostraLancio() {
		
		numero_lanci++;
		
		valore = (int)(Math.random()*6)+1;
		
		System.out.printf("\nLancio n. %d",numero_lanci);
		System.out.println("\nRisultato lancio:");
		
		switch (valore) {
		case 1:
		uno++;
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*  o  *");
		System.out.println("*     *");
		System.out.println("*******");
		break;
		
		
		case 2:
			due++;
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*     *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 3:
			tre++;
			System.out.println("*******");
			System.out.println("* o   *");
			System.out.println("*  o  *");
			System.out.println("*   o *");
			System.out.println("*******");
		break;
		
		
		case 4:
			quattro++;
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*     *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 5:
			cinque++;
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("*  o  *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		case 6:
			sei++;
			System.out.println("*******");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("* o o *");
			System.out.println("*******");
		break;
		
		
		

		default:
		break;
		}
		
	}
	
	
	
}
