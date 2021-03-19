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
		
		
		
		System.out.println("17/03/21: La cilindrata della moto honda è: "+honda.leggiCilindrata());
		
		
		Triciclo trix = new Triciclo();
		//Triciclo trix2 = new Triciclo(20);
		
		trix.impostaVelocita(15);
		trix.setModello("MP3");
		
		//yamaha.setModello=("xyz");
		
		System.out.println("La velocità del triciclo trix è: "+trix.leggiVelocita(1));
		System.out.println("Il modello del triciclo trix è: "+trix.getModello());
		
		System.out.println("***********************************************************");
		
		
		System.out.println("La velocità della moto honda è: "+honda.leggiVelocita());
		System.out.println("La velocità della moto ducati è: "+ducati.leggiVelocita());
		
		//System.out.println(honda);
		
		honda.avvia();
		
		//honda.velocita=120;
		//NO! Perchè VIOLA incapsulamento!!!!
		
		honda.impostaVelocita(150);
		
		honda.modificaVelocita(20);
		
		honda.impostaCilindrata(600);
		
		int velocitahonda=honda.leggiVelocita();
		
		System.out.println("La velocità della moto honda è: "+velocitahonda);
		System.out.println("La velocità della moto ducati è: "+ducati.leggiVelocita());
		
		ducati.ferma();
		
		System.out.println("La velocità della moto ducati è: "+ducati.leggiVelocita());
		
		System.out.println("La cilindrata della moto honda è: "+honda.leggiCilindrata());

		System.out.println("La velocità della moto gilera è: "+gilera.leggiVelocita());
		
		System.out.println("La cilindrata della moto honda è: "+gilera.leggiCilindrata());
		
		
		System.out.print("Fermo la honda? (S/N) ");
		
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    
	    //sc.close();
	   	      
	     honda.ferma(input);
	     
	     sc.close();
	     
	    

	}

}
