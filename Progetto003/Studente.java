import java.util.ArrayList;

public class Studente {
	
	private String nome, cognome;
	private int matricola;
	private ArrayList<Double> voti_italiano = new ArrayList<Double>();
	private ArrayList<Double> voti_matematica = new ArrayList<Double>();
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	
	public ArrayList<Double> getVotiMate() {
		return voti_matematica;
	}
	
	public ArrayList<Double> getVotiIta() {
		return voti_italiano;
	}
	
//	public void aggiungiVotiItaliano(double...voti) {
//		for (double tmp:voti)
//			voti_italiano.add(tmp);
//	}
//	
//	public void aggiungiVotiMatematica(double...voti) {
//		for (double tmp:voti)
//			voti_matematica.add(tmp);
//	}
//	
	
	public void aggiungiVoti(ArrayList<Double> lista, double...voti) {
		for (double tmp:voti)
			lista.add(tmp);
	}
	
	

	//@Override
	public String toString() {
		return "I valori dello studente sono: [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", voti_italiano="
				+ voti_italiano + ", voti_matematica=" + voti_matematica + "]";
	}
	
	
	public double media(ArrayList<Double> listavoti) {
		double totale=0;
		for (double tmp:listavoti)
			totale+=tmp;
		double media= totale/listavoti.size();
		
		media=Math.round(media*100);
		return media/100;
		
		
	}
	
	

}
