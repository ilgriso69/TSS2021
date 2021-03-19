import java.util.Scanner;

public class MotoCiclettaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MotoCicletta honda = new MotoCicletta();
//		MotoCicletta yamaha = new MotoCicletta();
		
		MotoCicletta ducati = new MotoCicletta();
		MotoCicletta honda = new MotoCicletta(20);
		MotoCicletta gilera = new MotoCicletta(20,500);
		MotoCicletta piaggio = new MotoCicletta("Ciao, sono una Piaggio!");
		MotoCicletta yamaha = new MotoCicletta(20,500,"MP3");
		
		
		
		System.out.println("17/03/21: La cilindrata della moto honda �: "+honda.leggiCilindrata());
		
		
		Triciclo trix = new Triciclo();
		//Triciclo trix2 = new Triciclo(20);
		
		trix.impostaVelocita(15);
		trix.setModello("MP3");
		
		//yamaha.setModello=("xyz");
		
		System.out.println("La velocit� del triciclo trix �: "+trix.leggiVelocita(1));
		System.out.println("Il modello del triciclo trix �: "+trix.getModello());
		
		System.out.println("***********************************************************");
		
		
		System.out.println("La velocit� della moto honda �: "+honda.leggiVelocita());
		System.out.println("La velocit� della moto ducati �: "+ducati.leggiVelocita());
		
		//System.out.println(honda);
		
		honda.avvia();
		
		//honda.velocita=120;
		//NO! Perch� VIOLA incapsulamento!!!!
		
		honda.impostaVelocita(150);
		
		honda.modificaVelocita(20);
		
		honda.impostaCilindrata(600);
		
		int velocitahonda=honda.leggiVelocita();
		
		System.out.println("La velocit� della moto honda �: "+velocitahonda);
		System.out.println("La velocit� della moto ducati �: "+ducati.leggiVelocita());
		
		ducati.ferma();
		
		System.out.println("La velocit� della moto ducati �: "+ducati.leggiVelocita());
		
		System.out.println("La cilindrata della moto honda �: "+honda.leggiCilindrata());

		System.out.println("La velocit� della moto gilera �: "+gilera.leggiVelocita());
		
		System.out.println("La cilindrata della moto honda �: "+gilera.leggiCilindrata());
		
		
		System.out.print("Fermo la honda? (S/N) ");
		
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    
	    //sc.close();
	   	      
	     honda.ferma(input);
	     
	     sc.close();
	     
	    

	}

}
