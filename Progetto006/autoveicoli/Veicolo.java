package veicoli2;

import veicoli2.Veicolo.alimentazione;

public class Veicolo {
	
	protected static final double prezzo_benzina = 1.57;
	protected static final double prezzo_gasolio = 1.42;
	protected static final double prezzo_gas = 0.67;
	
	
	protected enum alimentazione { 
		B, D, G;
	}
	
	
	protected String marca;
	protected String modello;
	protected alimentazione al;
	protected int percorrenza;
	protected double consumo_medio;
	
	public Veicolo() {
		
	}
	
	public Veicolo(String marca, String modello, alimentazione al, int percorrenza, double consumo_medio) {
		this.marca = marca;
		this.modello = modello;
		this.al = al;
		this.percorrenza = percorrenza;
		this.consumo_medio = consumo_medio;
	}
	
		
public double spesa_carburante() {
		
		double prezzo_carburante =1;
		
		switch (al) {
		case D:
		prezzo_carburante = prezzo_gasolio;
		break;
		case B:
		prezzo_carburante = prezzo_benzina;
		break;
		case G:
		prezzo_carburante = prezzo_gas;
		break;
		default:
		break;
		}
		
		double spesa=this.percorrenza/this.consumo_medio*prezzo_carburante;
		spesa = Math.round(spesa*100);
		return spesa/100;
	}


	public int getKm() {
		// TODO Auto-generated method stub
		return this.percorrenza;
	}
	

	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + ", al=" + al + ", percorrenza=" + percorrenza
				+ ", consumo_medio (km/litro)=" + consumo_medio + "]";
	}



	
	

}
