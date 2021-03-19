import java.util.Scanner;



public class Divisori {
	
	
	public static void stampaLinea() {
		
		System.out.println("****************");
		
		}
	
	
	public static void stampaLinea(int x) {
		
		for (int i=1; i<= x; i++)
			System.out.print("*");
		
		System.out.println();
	 }
	
	
	
	public static int quadrato(int x) {
		return x*x;
	}
	
	
	public static int cubo(int x) {
		return x*x*x;
	}
	
	
	public static boolean pari(int x) {
		if (x%2 == 0)
		return true;
		return false;
	}
	
	
	public static boolean primo(int x) {
		boolean p=true;
		for (int i = 2; i < x; i++)
			if (x%i==0)
			{
				p=false;
				i=x;
			}
		return p;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Prego inserire un numero : ");
		
Scanner scann = new Scanner(System.in);  
		
		int x= scann.nextInt();
		
		
	System.out.print("I divisori di "+x+" sono: ");
		//divisori(x);
	int y=1;	
	while (y<=x)
				
			{
				if (x%y == 0)
					{if (x==y) 
						System.out.print(y+".");
					else
						System.out.print(y+", ");
					}
				
				y++;
			}
	
	
		System.out.println();
		
		if (primo(x))
		System.out.println("Quindi "+x+" è un numero primo.");
		
		//2147483647
		
		stampaLinea(500);
		
		
		System.out.print("Prego inserire un numero per ottenerne il quadrato e il cubo: ");
		
		Scanner scann2 = new Scanner(System.in);  
				
		int yy= scann2.nextInt();
		
		//int quadrato=quadrato(yy);
				
		System.out.printf("Il quadrato di %d è %d",yy, quadrato(yy));
		System.out.println();
		System.out.printf("Il cubo di %d è %d",yy, cubo(yy));
		System.out.println();
		
		if (pari(yy))
		System.out.printf("Inoltre il numero inserito è PARI");
		else
		System.out.printf("Inoltre il numero inserito è DISPARI");
		
		
				
				
		
	}

}
