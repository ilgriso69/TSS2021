
public class MotoCicletta {
 
	private int velocita;
	private int cilindrata;
	private String modellomoto;
	
	
	MotoCicletta(){
				
		 this(0);
		 //Motocicletta(0);
		 
	 }
	
	
	 MotoCicletta(int _velocita){
		 
		//op1
		//op2
		
		 this.velocita=_velocita;
		 
	 }
	 
	 
	 
	 MotoCicletta(String stringa){
		 
			System.out.println(stringa);
			 
		 }
	 
	 
	 MotoCicletta(int _velocita, int _cilindrata){
		 	
			 this.velocita=_velocita;
			 this.cilindrata=_cilindrata;
			 
		 }
	
	
	
	 MotoCicletta(int i, int j, String string) {
		velocita=i;
		cilindrata=j;
		modellomoto=string;
	}


	int leggiVelocita() {
		return velocita;
	}
	
	
	void impostaVelocita(int x){
			velocita=x;
			}
	
	
	void modificaVelocita(int velocita){
		int verifica=this.velocita+velocita;
		if (verifica >= 0)
			this.velocita+=velocita;
		else
			this.velocita=0;
		}
	
	
	
	void ferma() {
		this.velocita=0;
	}
	
	
	
	void ferma(String conferma) {
		
		// conferma=="s" || conferma == "S"
		
		if (conferma.compareToIgnoreCase("s")==0)
		{
			this.velocita=0;
			System.out.println("Ok, moto fermata.");
		}
		else
			System.out.println("Moto non fermata.");
			
	}
	
	

	void avvia() {
		System.out.println("Motocicletta avviata!");
	}


	 int leggiCilindrata() {
		return cilindrata;
	}


	 void impostaCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}


	
	
}
