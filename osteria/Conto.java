import java.util.ArrayList;

public class Conto {
	
	static private int numeroconti = 1;
	private int numeroconto;
	private ArrayList<PiattoPiemontese> portate = new ArrayList<PiattoPiemontese>();
	
	public Conto() {
		
		this.numeroconto=numeroconti;
		numeroconti++;
		
	}
	
	
	public void aggiungiAlConto(PiattoPiemontese piatto) {
		this.portate.add(piatto);
	}
	
	
	public double totaleConto() {
		double d=0;
		for (PiattoPiemontese tmp:portate)
			d+=tmp.getPrezzo();
		return d;
	}
	
	

	public int getNumeroconto() {
		return numeroconto;
	}


	public void setNumeroconto(int numeroconto) {
		this.numeroconto = numeroconto;
	}


	@Override
	public String toString() {
		String str="********************";
		str+="\nElementi del conto:";
		str+="\nNumero conto: "+this.numeroconto+"\n";
		for (PiattoPiemontese tmp:portate)
		str+="\n"+tmp.getPiatto()+": "+tmp.getPrezzo();
		str+="\n\nTotale: "+this.totaleConto();
		str+="\n********************";
		return str;
	}
	
	
	
	
	

}
