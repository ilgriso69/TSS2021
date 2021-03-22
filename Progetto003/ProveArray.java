import java.util.Arrays;

public class ProveArray {
	
	 	static int sommaVettore(int[] vettore) {
		int somma=0;
		for (int tmp: vettore)
			somma+=tmp;
		return somma;
		
	}
	 	
	 	
	 	static int mediaVettore(int[] vettore) {
			int somma=0;
			for (int tmp: vettore)
				somma+=tmp;
			return somma/vettore.length;
			
		}
	 	
	 	
	 	
	 	static int minimoVettore(int[] vettore) {
			int minimo=vettore[0];
			for (int tmp: vettore)
				if (tmp<minimo)
					minimo=tmp;
			return minimo;
			
		}
	 
	 
	 
	 static int massimoVettore(int[] vettore) {
			int massimo=vettore[0];
			for (int tmp: vettore)
				if (tmp>massimo)
					massimo=tmp;
			return massimo;
			
		}

	 
	 static void alContrario(int[] vettore) {
		 System.out.println("*************Al contrario - inizio************");
		 for (int i=vettore.length-1;i>=0;i--)
			 System.out.println(vettore[i]);
		 System.out.println("*************Al contrario - fine ************");
	 }
	 
	 
	 static String sommaVettore(String[] vettore) {
			String somma="";
			for (String tmp: vettore)
				somma+=tmp;
			return somma;
			
		}
	
	 
	 static int mediaVettore(String[] vettore) {
			int somma=0;
			for (String tmp: vettore)
				somma+=tmp.length();
			return somma/vettore.length;
			
		}
	 
	  
	 
	
	 
	 static String minimoVettore(String[] vettore) {
			 int minimo=vettore[0].length();
			 String parolaminima=vettore[0];
			for (String tmp: vettore)
				if (tmp.length()<minimo)
				{
					minimo=tmp.length();
					parolaminima=tmp;
					
				}
			return parolaminima;
			
		}
	 
	 
	 
	 static String massimoVettore(String[] vettore) {
		 int massimo=vettore[0].length();
		 String parolamassima=vettore[0];
		for (String tmp: vettore)
			if (tmp.length()>massimo)
			{
				massimo=tmp.length();
				parolamassima=tmp;
				
			}
		return parolamassima;
		
	}
	 
	 
	 
	 static void alContrario(String[] vettore) {
		 System.out.println("*************Al contrario - inizio************");
		 for (int i=vettore.length-1;i>=0;i--)
			 System.out.println(vettore[i]);
		 System.out.println("*************Al contrario - fine ************");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,5,10};
		int[] c = {1,2,5,10,23};
		int[] b = new int[5];
		String[] str1 = {"mela", "pera", "banana", "ananas"};
		
		//a[0]...a[3];
		
		System.out.println(a);
		
		System.out.println(a.length);
		
		System.out.println(a[0]);
		
		int lunghezza= a.length;
		
		System.out.println(a[lunghezza-1]);
		
		System.out.println("*******INIZIO***********");
		for (int i=0;i<lunghezza;i++)
			System.out.println(a[i]);
		System.out.println("*********FINE*********");
		
		int lunghezza2= str1.length;
		
		System.out.println("*******INIZIO***********");
		for (int i=0;i<lunghezza2;i++)
			System.out.println(str1[i]+" -> "+str1[i].length());
		System.out.println("*********FINE*********");
		
		System.out.println("*******INIZIO***********");
		for (int temp:a)
		 System.out.println(temp);
		System.out.println("*********FINE*********");
		
		System.out.println("*******INIZIO***********");
		for (String frutto:str1)
			System.out.println(frutto+" lung: "+frutto.length());
		System.out.println("*********FINE*********");
		
		System.out.println("Contenuto Array a: "+Arrays.toString(a));
		
		System.out.println("Contenuto Array str1: "+Arrays.toString(str1));
		
		System.out.println("Somma contenuto Array a: "+sommaVettore(a));
		
		System.out.println("Somma contenuto Array c: "+sommaVettore(c));
		
		System.out.println("Somma contenuto Array c: "+sommaVettore(str1));
		
		
		System.out.println("Media contenuto Array c: "+mediaVettore(c));
		
		System.out.println("Lunghezza contenuto Array c: "+mediaVettore(str1));
		
		System.out.println("Minimo contenuto Array c: "+minimoVettore(c));
		
		System.out.println("Massimo contenuto Array c: "+massimoVettore(c));
		
       System.out.println("Minimo contenuto Array str1: "+minimoVettore(str1));
		
       System.out.println("Massimo contenuto Array str1: "+massimoVettore(str1));
       
       alContrario(c);
       alContrario(a);
       
       alContrario(str1);
       
       		
       
		
	}

}
