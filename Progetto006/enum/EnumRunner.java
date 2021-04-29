
public class EnumRunner {
	
	
	enum stagioni {
		primavera,
		estate,
		autunno,
		inverno;
		
	}
	
		

	public static void main(String[] args) {
		
		stagioni oggi = stagioni.inverno;
		
		
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
