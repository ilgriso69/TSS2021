package bmi;

public class Persona {
	
	private double peso;
	private double altezza;
	private int anni;
	private char sesso;
	
	
	
	public double bmi() {
		
		double d=peso/(altezza*altezza);
		d=Math.round(d*100);
		return d/100; 
		}
	
	
	
	public String commento() {
		
		double bmi=this.bmi();
		
	switch (this.sesso) {
		case 'M':
		if (bmi < 20.1)
			return "Secondo le tabelle sei sottopeso";
		if ((bmi >= 20.1 && bmi <= 25.0))
			return "Secondo le tabelle sei nel tuo peso ottimale";
		if ((bmi >= 25.1 && bmi <= 29.9))
			return "Secondo le tabelle sei sovrappeso";
		if ((bmi >= 30 && bmi <= 35))
			return "Secondo le tabelle sei obeso di 1° livello";
		if ((bmi >= 35.1 && bmi <= 40))
			return "Secondo le tabelle sei obeso di 2° livello";
		if ((bmi > 40.0))
			return "Secondo le tabelle sei obeso grave";
		case 'F':
			if (bmi < 18.7)
				return "Secondo le tabelle sei sottopeso";
			if ((bmi >= 18.7 && bmi <= 23.8))
				return "Secondo le tabelle sei nel tuo peso ottimale";
			if ((bmi >= 23.9 && bmi <= 28.6))
				return "Secondo le tabelle sei sovrappeso";
			if ((bmi >= 28.7 && bmi <= 35))
				return "Secondo le tabelle sei obesa di 1° livello";
			if ((bmi >= 35.1 && bmi <= 40))
				return "Secondo le tabelle sei obesa di 2° livello";
			if ((this.bmi() > 40.0))
				return "Secondo le tabelle sei obesa grave";
			
			default:
				return "";
	}
		
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}



	public char getSesso() {
		return sesso;
	}



	public void setSesso(char sesso) {
		this.sesso = sesso;
	}


	public int getAnni() {
		return anni;
	}



	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	
	public double percentualeGrassoD() {
				
		int sesso1;
		if (this.sesso == 'M')
			 sesso1 = 1;
			else  sesso1 = 0;
			double d= (1.29*this.bmi())+(0.20*this.anni)-(11.4*sesso1)-8.0;
			d=Math.round(d*100);
			return d/100;
			//return d;
			}
	
	
	public double percentualeGrassoG() {
		
		int sesso1;
		
		if (this.sesso == 'M')
			 sesso1 = 1;
			else  sesso1 = 0;
			double d= (1.46*this.bmi())+(0.14*this.anni)-(11.6*sesso1)-10.0;
			//d=2.78989;
			d=Math.round(d*100);
			return d/100;
			//return d;
			}



	
	

	
}
