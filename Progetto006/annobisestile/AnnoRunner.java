package annobisestile;

import java.util.Scanner;

public class AnnoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("**********************");
		System.out.println("Calcolo anno bisestile");
		System.out.println("**********************");
		
		Scanner sc = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		
		String s1;
		String s2;
		
		Anno a = new Anno();
		
		
		do {
			
			System.out.printf("\nPrego inserire un anno: ");
			s1=sc.next();
			
			try {
				
				int anno_inserito=Integer.parseInt(s1);
				
			    a.setAnno_b(anno_inserito);
			    
			    if (a.annobisestile())
			    	System.out.println("\nL'anno inserito è bisestile.");
			    else
			    	System.out.println("\nL'anno inserito NON è bisestile.");
			    
			    if (a.getAnno_b() <=0)
			    	System.out.println("N.B. Però hai inserito un anno "
			    			+ " minore o ugale a 0: non ha molto senso!");
			   
			   
				
			} catch (Exception e) {
				System.out.println("Errore, inserire un numero");
			}
			
do {
				
				System.out.print("\nVuoi continuare (S/N)?");
				s2=sc2.next();
				if (!s2.equalsIgnoreCase("s") && !s2.equalsIgnoreCase("n"))
					System.out.println("Prego inserire 'S' o 'N'.");
			} while (!s2.equalsIgnoreCase("s") && !s2.equalsIgnoreCase("n"));
			
			
		} while (s2.equalsIgnoreCase("s"));
		
		
		
		System.out.println("\n\n**********************");
		System.out.println("Programma    terminato");
		System.out.println("**********************");
		
		
		
	}

}
