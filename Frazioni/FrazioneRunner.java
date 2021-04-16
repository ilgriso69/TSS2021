package frazioni;



public class FrazioneRunner {
	
	
	public static void main(String[] args) {
		

		Frazione f1 = new Frazione (3,4);
		Frazione f2 = new Frazione (6);
//		Frazione f3 = new Frazione ("2\\3");
		Frazione f4 = new Frazione ("5-6");
		Frazione f5 = new Frazione ("1/2");
		Frazione f6 = new Frazione ("1/4");
		Frazione f10 = new Frazione();
		
		//System.out.println("\\");
		
		System.out.println("F1: "+f1);
		System.out.println("F2: "+f2);
		
		System.out.println("F4: "+f4);
		System.out.println("F5: "+f5);
		System.out.println("F6: "+f6);
		
		
		f5.somma(f6);
		
		System.out.println("F5=F5+F6: "+f5);
		
		Frazione f7 = new Frazione ("17/34");
		
		System.out.println("F7 :"+f7);
		
		f7.semplifica();
		
		System.out.println("F7 :"+f7);
		
		Frazione f8 = new Frazione ("16/32");
		
		System.out.println("F8 :"+f8);
		
		System.out.println("F10 :"+f10);
		
		
		f8.somma(f7);
		
		System.out.println("F8: F8 + F7: "+f8);
		
		
		f8.somma(f10);
		
		System.out.println("F8: F8 + F10: "+f8);
		
		f5.somma(f10);
		
		System.out.println("F5: F5 + F10: "+f5);
		
		
		//Frazione f9 = new Frazione ("8/16");
		
		//System.out.println((f9.semplifica()));
		
		
		
		
	}
	
	
	
	
	

}
