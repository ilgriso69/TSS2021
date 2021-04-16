package eccezioni;


import java.util.Scanner;

public class EccezioniRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]a = {1,2,3};
		
		
		int b=0;
		
		String s="";

		
		do {
		
			
			System.out.print("Prego inserire un numero (* per terminare): ");
			Scanner sc = new Scanner(System.in);
			s=sc.next();
			
			//b=Integer.parseInt(s);
			
			if (!s.equals("*")) {
		
		try {

			b=Integer.parseInt(s);
			System.out.println("Hai inserito il numero: "+b);
			sc = null;
			} 
		
		
			
		
		catch (NumberFormatException e) 
		{
		System.out.println("Errore: sono ammessi solo numeri e il carattere \"*\".");
		}
		
		
		catch (Exception e) 
		{
		System.out.println("Errore generico.");
		}
		
			}

		} while(!s.equals("*"));		
		
		System.out.println("Termine regolare del programma");
		//sc.close();
		
		}

}
