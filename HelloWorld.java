import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=21;
		String s="Ciao";
		
		int ang1=60, ang2=70, ang3=60;
		int somma=ang1+ang2+ang3;
		
		//System.out.println("Ciao Mondo!");
		//System.out.println(s+" "+a);
		
		
		if (a%2 == 0)
			System.out.println("PARI");
		else
			System.out.println("DISPARI");
			
		//TRIANGOLO OK
		//NO TRIANGOLO
		
		if (somma == 180)
			System.out.println("TRIANGOLO OK");
			else
				if (somma > 180)
					System.out.println("Avanzano "+(somma-180)+" gradi.");
				else
					System.out.println("Mancano "+(180-somma)+" gradi.");
					//
			//System.out.println("NO TRIANGOLO");
		
				
		for (int i=1;i<=3;i++)
			{for (int j=1;j<=3;j++)
				System.out.print(i+"."+j+" ");
				System.out.println();
			}
		
			//System.out.println(i);
			//1.1 1.2 1.3
			//2.1 2.2 2.3
			//3.1 3.2 3.3
			
		for (int i=1; i<=10; i++)
		{ for (int b=1; b<=10; b++) 
			{System.out.print(b*i+" ");
			 }
		System.out.println();
		}
	
		
	System.out.print("Prego inserire un numero: ");	
		
	Scanner scann = new Scanner(System.in);	
	
	int x=scann.nextInt();
	
	System.out.println("Hai inserito il numero : "+x);
	

	System.out.print("Tabellina del: ");	
	
	Scanner scann2 = new Scanner(System.in);	
	
	int y=scann2.nextInt();
	
	System.out.println("Stampo la Tabellina del :"+y);
	
	for (int ii=1;ii<=10;ii++)
	
	System.out.println(ii*y);
	
	System.out.print("Potenze del: ");
	
	Scanner scann3 = new Scanner(System.in);
	
	int z=scann3.nextInt();
	
	System.out.println("Stampo le potenze del :"+z);
	
	int potenza=1;
	
	while (potenza < 10000)
		
	{
		potenza*=z;
		System.out.println(potenza);
	}
	
	
	
	
	
		
		

	}

}
