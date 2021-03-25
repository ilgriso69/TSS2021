
public class Recensione {

	private String testo;
	private double votazione;
	
	public Recensione(String testo, double votazione) {
		//super();
		this.testo = testo;
		this.votazione = votazione;
	}

	@Override
	public String toString() {
		return "Recensione [testo=" + testo + ", votazione=" + votazione + "]";
	}
	
	
	
	
	
}
