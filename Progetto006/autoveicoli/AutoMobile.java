package veicoli2;

import java.text.DecimalFormat;

import veicoli2.Veicolo.alimentazione;

public class AutoMobile extends Veicolo {
		
	public AutoMobile(String marca, String modello, alimentazione al, int percorrenza, double consumo_medio) {
		super(marca,modello,al,percorrenza,consumo_medio);
	}


	@Override
	public String toString() {
		String pattern = "###,###.###";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String s = "Automobile [marca=" + super.marca + ", modello=" + super.modello + ", al=" + super.al + ", percorrenza=" + decimalFormat.format(super.percorrenza) 
				+ ", consumo_medio=" + super.consumo_medio + "]";
	 return s;
	}
		


		
	

}
