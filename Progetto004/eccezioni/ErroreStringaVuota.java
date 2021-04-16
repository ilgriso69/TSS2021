package eccezioni;

public class ErroreStringaVuota extends Exception {
	
	ErroreStringaVuota(){
		super("Errore: tentativo di stampa su stringa nulla.");
	}
	
	
	public void ciao() {
		System.out.println("Ciao!");
	}
	
	
	public void stampa(String s) {
		System.out.println(s);
	}
	
	
	public void stampaE(String s) throws ErroreStringaVuota{
		if (s != null)
		System.out.println(s);
		else throw new ErroreStringaVuota();
	}
	
	
	
	

}
