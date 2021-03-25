
public class Cliente {
	
	private static int idcliente;
	private static int ultima_lavorazione;
	
	private int id;
	private String nome;
	private Indirizzo indirizzo_principale;
	private Indirizzo indirizzo_secondario;
	private int sconto;
	
	public Cliente(String nome) {
		//super();
		this.id=idcliente;
		idcliente++;
		this.nome = nome;
	}

	public Cliente(String nome, Indirizzo indirizzo_principale) {
		super();
		this.nome = nome;
		this.id=idcliente;
		idcliente++;
		this.setIndirizzo_principale(indirizzo_principale);
	}

	public Indirizzo getIndirizzo_principale() {
		return indirizzo_principale;
	}

	public void setIndirizzo_principale(Indirizzo indirizzo_principale) {
		this.indirizzo_principale = indirizzo_principale;
	}

	public Indirizzo getIndirizzo_secondario() {
		return indirizzo_secondario;
	}

	public void setIndirizzo_secondario(Indirizzo indirizzo_secondario) {
		this.indirizzo_secondario = indirizzo_secondario;
	}

	
	public static int getUltima_lavorazione() {
		return ultima_lavorazione;
	}

	public static void setUltima_lavorazione(int ultima_lavorazione) {
		Cliente.ultima_lavorazione = ultima_lavorazione;
	}

	public int getSconto() {
		return sconto;
	}
	
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}

	
	@Override
	public String toString() {
//		return "Cliente [id=" + id + ", nome=" + nome + ", indirizzo_principale=" + indirizzo_principale
//				+ ", indirizzo_secondario=" + indirizzo_secondario + "]";
		
		String stringa="Cliente: id= " + id + ", nome = " + nome;
		if (indirizzo_principale != null)
			stringa+="\nIndirizzo principale= " + indirizzo_principale;
		if (indirizzo_secondario != null)
			stringa+="\nIndirizzo principale= " + indirizzo_secondario;
		stringa+="\n";
		return stringa;
		
	}

	
	
	

	
	

}
