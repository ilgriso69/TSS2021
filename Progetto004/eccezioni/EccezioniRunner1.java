package eccezioni;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EccezioniRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]a = {1,2,3};
		
		
		int b=0;
		
		

		
		do {
		
		
		try {
//			System.out.println(a[1]);
//			System.out.println(a[3]);
			
			System.out.print("Prego inserire un numero: ");
			Scanner sc = new Scanner(System.in);
			b=sc.nextInt();
			System.out.println("Hai inserito il numero: "+b);
			sc = null;
			} 
		
		
		catch (InputMismatchException e) 
		{
			
			System.out.println("Errore: inserimento valore non valido.");
		
		}
		
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
		System.out.println("Errore: riferimento array erroneo.");
		
		}
		
		
		catch (Exception e) 
		{
		System.out.println("Errore generico.");
		}
		
		
//		finally 
//		{
//		sc.close();
//		System.out.println("Questa istruzione è da eseguire obbligatoriamente.");	
///		}

		} while(b != -1);		
		
		System.out.println("Termine regolare del programma");
		//sc.close();
		
		}

}
