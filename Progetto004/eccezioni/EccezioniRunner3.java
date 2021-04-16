package eccezioni;

public class EccezioniRunner3 {

	public static void main(String[] args) throws ErroreStringaVuota  {
		// TODO Auto-generated method stub
		
		String s = null;
		System.out.println(s);
		
		String s1 = "";
		System.out.println(s1);
		
		ErroreStringaVuota e1 = new ErroreStringaVuota();
		
		e1.ciao();
		e1.stampa(s);
		
		
		e1.stampa(s1);
		e1.stampaE(s1);
		
		try {
			e1.stampaE(s);
		} catch (ErroreStringaVuota e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Errore: tentativo di stampa di stringa nulla!");
		}
		

	}

}
