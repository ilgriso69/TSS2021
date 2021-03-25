
public class ClienteRunner {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente("Mario D.");
		Indirizzo ind1 = new Indirizzo ("Via Roma, 10","Torino",10123,"TO");
		
		cli1.setIndirizzo_principale(ind1);
		cli1.setIndirizzo_secondario(new Indirizzo("Corso Susa 50","Bardonecchia",10098,"TO"));
		
		System.out.println(cli1);
		
		Cliente cli2 = new Cliente("Giuseppe C.");
		Cliente cli3 = new Cliente("Luigi D.");
		
		System.out.println(cli2);
		System.out.println(cli3);
		
		//Cliente.setUltima_lavorazione(150);
		
//		cli1.setUltima_lavorazione(45);
//		cli2.setUltima_lavorazione(49);
//		
//		System.out.println(Cliente.getUltima_lavorazione());
		
		ClienteFedele clif1= new ClienteFedele("Mauro B.");
				
		System.out.println(clif1);
				
		
		clif1.setIndirizzo_principale(ind1);
		
		clif1.setCodicefedelta(456789);
		
		Cliente cli5 = new ClienteFedele("Roberta R.");
		
		System.out.println(cli5);
		
		System.out.println(cli1 instanceof Cliente);
		System.out.println(cli1 instanceof ClienteFedele);
		System.out.println(clif1 instanceof Cliente);
		System.out.println(clif1 instanceof ClienteFedele);
		System.out.println(cli5 instanceof Cliente);
		System.out.println(cli5 instanceof ClienteFedele);
		
	
		cli1.setSconto(20);
		cli5.setSconto(20);
		
		System.out.println(cli1.getSconto());
		System.out.println(cli5.getSconto());
		
		
		
		

	}

}
