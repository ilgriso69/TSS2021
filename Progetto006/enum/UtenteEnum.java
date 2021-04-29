
public class UtenteEnum {
	
	private String nomeutente;
	private tipoUtente attivazioneUtente;
	
	enum tipoUtente{
		in_attesa,
		attivo,
		inattivo,
		cancellato;
	}
	
	
	public UtenteEnum(String s) {
		this.nomeutente=s;
		this.attivazioneUtente=tipoUtente.in_attesa;
	}
	

	public String getNome() {
		return nomeutente;
	}

	public void setNome(String nome) {
		this.nomeutente = nome;
		
	}
	
	
public void utenteInAttesa() {
		
		this.attivazioneUtente=tipoUtente.in_attesa;
				
	}
	
	
	public void utenteAttivo() {
		
		this.attivazioneUtente=tipoUtente.attivo;
				
	}
	
	
public void utenteInattivo() {
		
		this.attivazioneUtente=tipoUtente.inattivo;
				
	}



public void utenteCancellato() {
	
	this.attivazioneUtente=tipoUtente.cancellato;
			
}


public void verificaAccount() {
	
	switch (this.attivazioneUtente) {
	case in_attesa:
	System.out.println("account da attivare.");
	break;
	
	case attivo:
	System.out.println("account attivo.");
	break;
	
	case inattivo:
	System.out.println("account inattivo.");
	break;
	
	case cancellato:
	System.out.println("account cancellato.");
	break;

	default:
	System.out.println("BOH!");
	break;
	}
}

@Override
public String toString() {
	return "UtenteEnum [nomeutente=" + nomeutente + ", attivazioneUtente=" + attivazioneUtente + "]";
}
	
	
	
	

}
