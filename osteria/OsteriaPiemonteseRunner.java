
public class OsteriaPiemonteseRunner {

	public static void main(String[] args) {
		
		
		PiattoPiemontese piatto1 = new PiattoPiemontese("agnolotti",12.5);
		PiattoPiemontese piatto2 = new PiattoPiemontese("bagna_caoda",18.5);
		PiattoPiemontese piatto3 = new PiattoPiemontese("bonet",5.00);
		PiattoPiemontese piatto4 = new PiattoPiemontese("bollito_misto",20.5);
		
		
		
		piatto1.aggiungiIngredienti("carne","pasta","ripieno");
		
		piatto2.aggiungiIngredienti("aglio","olio","acciughe","verdura");
		
		MenuPiemontese menu1 = new MenuPiemontese();
		
		menu1.aggiungiPiatto(piatto1);
		menu1.aggiungiPiatto(piatto2);
		menu1.aggiungiPiatto(piatto3);
		menu1.aggiungiPiatto(piatto4);
		

		
		System.out.println(menu1);
		
		
		Conto conto1= new Conto();
		
		Conto conto2= new Conto();
		
		
		conto1.aggiungiAlConto(piatto1);
		conto1.aggiungiAlConto(piatto4);
		conto1.aggiungiAlConto(piatto1);
		
		
		conto2.aggiungiAlConto(piatto2);
		conto2.aggiungiAlConto(piatto3);
		
			
		System.out.println(conto1);

		System.out.println(conto2);
		

	}

}
