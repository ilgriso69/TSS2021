import java.util.Scanner;

public class RipassoFunzioni {

	static void quadrato(int a) {
		
		System.out.printf("Il quadrato di %d è %d", a, a*a); 
		
	}
	
	
static void cubo(int a) {
		
		System.out.printf("\nIl cubo di %d è %d", a, a*a*a); 
		
	}


static long fattorialeR(int a) {
	 if (a==1)
	 return 1;
	 return a * fattorialeR(a-1);
}


static void stampafattoriale(int a) {
	
//	float f=(float)fattorialeR(a);
//	f=Math.round(a);
	
	System.out.printf("\nIl fattoriale di %d è %d", a, fattorialeR(a));
}


static long fibonacciR (int a) {
	 //Fn=Fn−1+Fn−2 for n≥2, with F0=0 and F1=1
	 if (a==0)
	 return 0;
	 if (a==1)
	return 1;
	 else
	return fibonacciR(a-1)+fibonacciR(a-2);
	 
}

	
	

static void stampafibonacci(int a) {
	
//	float f=(float)fattorialeR(a);
//	f=Math.round(a);
	
	System.out.printf("\nIl numero di Fibonacci di %d è %d", a, fibonacciR(a));
}
	

static void inverso(int a) {
	
	double f=1/(double)a;
	f=Math.round(f*100);
	f/=100;
	
	System.out.printf("\nL'inverso di "+ a +" è " + f); 
	
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.print("Prego inserire un numero intero: ");
		
		
		
		
		
		try {
			
			a = sc.nextInt();
			quadrato(a);
			cubo(a);
			stampafattoriale(a);
			stampafibonacci(a);
			inverso(a);
			
			
			
			
		} catch (Exception e) {
			System.out.println("Inserito valore non corretto.");
		}
		
		
		System.out.println("\n\n************************************");
		System.out.println("Programma terminato");
		System.out.println("************************************");
		
	}

}
