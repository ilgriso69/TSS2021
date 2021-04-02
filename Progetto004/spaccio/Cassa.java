package spaccio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Cassa {
	
	private ArrayList<Articolo> elencoArticoli=new ArrayList<Articolo>();

	
 
	
	public void aggiungiArticoli(Articolo art) {
		elencoArticoli.add(art);
	}
	
	
	public void aggiungiNarticoli(Articolo...art) {
		
		for (Articolo tmp : art) {
			
			elencoArticoli.add(tmp);
		}
		
	}
 
 
	public double conto() {
		double d=0;
		for (Articolo articolo : elencoArticoli) {
			d+=articolo.getPrezzo();
		}
		return d;
	}
	
	
	public double conto2() {
		double d=0;
		String s;
		for (Articolo articolo : elencoArticoli) {
			s=articolo.getDescrizione().toUpperCase();
			if (s.startsWith("PROMO"))
				d+=articolo.getPrezzo()*.85;
			else if (articolo.getDataScadenza() != null) {
				LocalDate oggi=LocalDate.now();
				if(ChronoUnit.DAYS.between(oggi,articolo.getDataScadenza())<15)
					d+=articolo.getPrezzo()*.85;
				else d+=articolo.getPrezzo();
				}
			else d+=articolo.getPrezzo();
		}
		
		d=Math.floor(d*100);
		d/=100;
		
		return d;
	}
	
	
	
	
	@Override
	public String toString() {
		String s ="***Elementi in cassa***\n";
			
		for (Articolo art: elencoArticoli) {
			s+=art+"\n";}
		return s;
		//return "Cassa [elencoArticoli=" + elencoArticoli + "]";
	}
	

	
	
}
