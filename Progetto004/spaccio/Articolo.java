package spaccio;

import java.time.LocalDate;

public class Articolo {
	
	private static int idarticoli;
	
	private int idarticolo;
	private String descrizione;
	private double prezzo;
	
	public Articolo() {	
	}
	
	public Articolo(String descrizione, double prezzo) {
		super();
		idarticolo=idarticoli;
		idarticoli++;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}


	
	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	
	public LocalDate getDataScadenza() {
			return null;
	}
	

	@Override
	public String toString() {
		return "Articolo [idarticolo=" + idarticolo + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
	}

	

	

}
