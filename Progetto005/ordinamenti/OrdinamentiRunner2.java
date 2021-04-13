package ordinamenti;

import java.util.ArrayList;
import java.util.Arrays;


public class OrdinamentiRunner2 {
	
	
	public static void aggiungiI(ArrayList al,int...elementi) {
		for(int i : elementi)
			al.add(i);
	}
	
	
	public static void aggiungiS(ArrayList al,String...elementi) {
		for(String i : elementi)
			al.add(i);
	}
	
	
	
	public static void aggiungiSt(ArrayList<Studente>al,Studente...elementi) {
		for(Studente i : elementi)
			al.add(i);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Studente s1 = new Studente(110,"Amilcare");
		Studente s2 = new Studente(101,"Eusebia");
		Studente s3 = new Studente(100,"Patroclo");
		
		ArrayList<Studente> als1 = new ArrayList<Studente>();
		
		aggiungiSt(als1,s1,s2,s3);
		
//		als1.add(s1);
//		als1.add(s2);
//		als1.add(s3);
		
		System.out.println("ArrayList iniziale:");
		System.out.println(als1);
		
		StudenteOrdGen comp = new StudenteOrdGen();
			
		comp.setModo("DESC_NOME");
		
		als1.sort(comp);
		
		System.out.println("\nOrdinamento decrescente per nome:");
		
		System.out.println(als1);
		
		
		comp.setModo("DESC_ID");
		
		als1.sort(comp);
		System.out.println("\nOrdinamento decrescente per id:");
		System.out.println(als1);
		
		
		comp.setModo("ASC_ID");
		
		als1.sort(comp);
		System.out.println("\nOrdinamento crescente per id:");
		System.out.println(als1);
		
		
	
		
		
		

	}

}
