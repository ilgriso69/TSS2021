package ordinamenti;

import java.util.ArrayList;
import java.util.Arrays;


public class OrdinamentiRunner {
	
	
	public static void aggiungiI(ArrayList al,int...elementi) {
		for(int i : elementi)
			al.add(i);
	}
	
	
	public static void aggiungiS(ArrayList al,String...elementi) {
		for(String i : elementi)
			al.add(i);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v1 = {1,3,56,23,90,2,10};
		String[] v2 = {"antonio","luisa","paola","davide"};
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		
		Arrays.sort(v1);
		Arrays.sort(v2);
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		
		
		ArrayList al1 = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		
		aggiungiI(al1,1,45,79,23,45,71);
		
		System.out.println(al1);
		
		al1.add(151);
		
		System.out.println(al1);
		
		al1.sort(null);
		
		System.out.println(al1);
		
		aggiungiS(al2,"pera", "banana","mela");
		
		System.out.println(al2);
		
		al2.sort(null);
		
		System.out.println(al2);
		
		Studente s1 = new Studente(110,"Amilcare");
		Studente s2 = new Studente(101,"Eusebia");
		Studente s3 = new Studente(100,"Patroclo");
		
		ArrayList<Studente> als1 = new ArrayList<Studente>();
		
		als1.add(s1);
		als1.add(s2);
		als1.add(s3);
		
		
		System.out.println(als1);
		
		StudentePerId comp1 = new StudentePerId();
		StudentePerId2 comp2 = new StudentePerId2();
		
		
		als1.sort(comp1);
		
		System.out.println(als1);
		
		als1.sort(comp2);
		
		System.out.println(als1);
		
		StudentePerNome comp3 = new StudentePerNome();
		StudentePerNome2 comp4 = new StudentePerNome2();
		
		als1.sort(comp3);
		
		System.out.println(als1);
		
		
		als1.sort(comp4);
		
		System.out.println(als1);
		
		StudentePerNomeG compg = new StudentePerNomeG();
		
		compg.setModo("DESC");
		
		als1.sort(compg);
		
		System.out.println(als1);
		
		
		compg.setModo("ASC_ID");
		
		als1.sort(compg);
		
		System.out.println(als1);
		
		
		
		
		
		
		
	
		
		
		

	}

}
