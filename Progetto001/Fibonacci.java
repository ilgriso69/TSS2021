import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		

		
		System.out.print("Prego inserire un numero limite: ");
		
		Scanner scann = new Scanner(System.in);  
				
		int x= scann.nextInt();
		
		System.out.print("La sequenza di Fibonacci richiesta è : ");
		
		int valore1=0;
		int valore2=1;
		int valore3=valore1+valore2;
		
		
		System.out.print(valore1+" "+valore2);
		
		while (valore3<=x)
			
		{ 
			
			
			System.out.print(" "+valore3);
			
			valore1=valore2;
			
			valore2=valore3;
			
			valore3=valore1+valore2;
			
			
		}
		
		System.out.println();
		
		
	}

}
