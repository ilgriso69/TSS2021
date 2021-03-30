import java.util.Scanner;

public class RettangoliQuadratiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo r3 = new Rettangolo ("r1",3,4);
		r3.disegnaArea();
		r3.perimetro();
		r3.area();
		
		
		Quadrato quad2 = new Quadrato ("q1",4);
		quad2.disegnaArea();
		quad2.perimetro();
		quad2.area();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Rettangolo o quadrato? (R/Q) ");
		String input=sc.next();
		
		if (input.toUpperCase().equals("Q")) {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Prego inserire il nome del quadrato : ");
		String n=sc2.next();
		System.out.print("Prego inserire lato : ");
		int lun=sc2.nextInt();
		Quadrato quad = new Quadrato (n,lun);
		sc2 = null;
		quad.disegnaArea();
		
		System.out.println("Il quadrato si chiama: "+quad.getName());
		System.out.println("La sua area è pari a: "+quad.area());
		System.out.println("Il suo perimetro è pari a: "+quad.perimetro());
		}
		
		else if (input.toUpperCase().equals("R")) {
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Prego inserire il nome del rettangolo : ");
			String n=sc2.next();
			System.out.print("Prego inserire base : ");
			int lun=sc2.nextInt();
			System.out.print("Prego inserire altezza : ");
			int lar=sc2.nextInt();
			
			Rettangolo rett = new Rettangolo (n,lun,lar);
			
			rett.disegnaArea();
			
			System.out.println("Il rettangolo si chiama: "+rett.getName());
			System.out.println("La sua area è pari a: "+rett.area());
			System.out.println("Il suo perimetro è pari a: "+rett.perimetro());
		}
		
		else System.out.println("Prego inserire R o Q quando richiesto."); 
		sc.close();
		
		

	}

}
