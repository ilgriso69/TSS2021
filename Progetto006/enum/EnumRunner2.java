
public class EnumRunner2 {
	
	
	enum stagioni {
		primavera,
		estate,
		autunno,
		inverno;
		
	}
	
	
	
	public enum aliquote_iva { 
		al4(4), al10(10), al22(22), al40(40);
		
		private int value; 
		
		private aliquote_iva(int value) {
		this.value = value; } 
		}

			

	public static void main(String[] args) {
		
		stagioni oggi = stagioni.inverno;
		
		aliquote_iva al_prodotto = aliquote_iva.al4;
		
		//System.out.println(al_prodotto.value);
		
		double prezzo = 10.5;
		
		System.out.println("Prezzo originale: "+prezzo);
		System.out.println("Prezzo con IVA: "+(prezzo+prezzo*al_prodotto.value/100));
		System.out.println("(Aliquota IVA: "+al_prodotto.value+"%)");
		
		System.out.println();
		
		
		switch (oggi) {
		case primavera:
		System.out.println("Data compresa tra 21 marzo e 20 giugno");	
		break;
		case estate:
		System.out.println("Data compresa tra 21 giugno e 20 settembre");	
		break;
		case autunno:
		System.out.println("Data compresa tra 21 settembre e 20 dicembre");	
		break;
		case inverno:
		System.out.println("Data compresa tra 21 dicembre e 20 marzo");	
		break;
	
		}
		
	
	
		UtenteEnum ue1 = new UtenteEnum("mariorossi");
		
		ue1.utenteInAttesa();
		
		System.out.println(ue1.getNome());
		
		ue1.verificaAccount();
		
		

		UtenteEnum ue2 = new UtenteEnum("luigiverdi");
		
		ue2.utenteAttivo();
		
		System.out.println(ue2.getNome());
		
		ue2.verificaAccount();
		
				
	//System.out.println(ue1.verificaAccount());
		
	
	
	
		
	}
	
	

}
