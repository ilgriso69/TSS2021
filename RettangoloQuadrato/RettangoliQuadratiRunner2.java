import java.util.Scanner;


public class RettangoliQuadratiRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
		System.out.print("Rettangolo o quadrato? (R/Q - * per terminare) ");
		input=sc.next();
		
		if (input.toUpperCase().equals("Q")) {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Prego inserire il nome del quadrato : ");
		String n=sc2.next();
		
		
		 try { 
			 
			 System.out.print("Prego inserire lato : ");
			 int lun=sc2.nextInt();
			 Rettangolo quad = new Quadrato (n,lun);
			 quad.disegnaArea();
			
			System.out.println("Il quadrato si chiama: "+quad.getName());
			System.out.println("La sua area è pari a: "+quad.area());
			System.out.println("Il suo perimetro è pari a: "+quad.perimetro());
			
			sc2 = null;
			
		} catch (Exception e) {
			System.out.println("Dati inseriti non corretti.");
		}
		
		
		
		
		}
		
		else if (input.toUpperCase().equals("R")) {
			Scanner sc3 = new Scanner(System.in);
			System.out.print("Prego inserire il nome del rettangolo : ");
			String n=sc3.next();
			
			try { 
				
			System.out.print("Prego inserire base : ");
			int lun=sc3.nextInt();
			System.out.print("Prego inserire altezza : ");
			int lar=sc3.nextInt();	
			Rettangolo rett = new Rettangolo (n,lun,lar);
			
			rett.disegnaArea();
			
			System.out.println("Il rettangolo si chiama: "+rett.getName());
			System.out.println("La sua area è pari a: "+rett.area());
			System.out.println("Il suo perimetro è pari a: "+rett.perimetro());
			
			sc3 = null;
				
			} catch (Exception e) {
				System.out.println("Dati inseriti non corretti.");
			}
			
			
			
		}
		
		else if 
		(!input.equals("*")) 
			System.out.println("Prego inserire R o Q quando richiesto."); 
		
		
		} while (!input.equals("*"));
		
		System.out.println("Programma terminato correttamente.");
		
		
		sc.close();
		
		

	}

}
