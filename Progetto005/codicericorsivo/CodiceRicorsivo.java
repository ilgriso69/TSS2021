package codicericorsivo;

public class CodiceRicorsivo {
	
	 static long fattoriale(int a) {
		 long fatt=1;
		 for (int i=1; i<=a; i++)
			 fatt*=i;
		 return fatt;
	 }
	 
	
	 static long fattorialeR(int a) {
		 if (a==1)
		 return 1;
		 return a * fattorialeR(a-1);
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
	 
	 
	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fib="0 1 1 2 3 5 8 13 21 34 55 89 144 233 377";
		
		System.out.println(fattoriale(5));
		System.out.println(fattorialeR(10));
		
		System.out.println("Sequenza Fibonacci: "+fib);
		
		System.out.println(fibonacciR(5));
	}

}
