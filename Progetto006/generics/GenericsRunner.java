import java.util.ArrayList;

public class GenericsRunner {

	

public static void aggiungiStringa(ArrayList<String> al, String...t) {
		
		for (String t2 : t) {
			
			al.add(t2);
			
		}
		
	}
	

	
public static void aggiungiIntero(ArrayList<Integer> al, int...t) {
		
		for (int t2 : t) {
			
			al.add(t2);
			
		}
		
	}
	
	
	
	
	public static <T> void aggiungi(ArrayList<T> al, T...t) {
		
		for (T t2 : t) {
			
			al.add(t2);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> s1 = new ArrayList<String>();
		
		aggiungiStringa(s1,"aaa","bbb");
		
		aggiungi(s1,"uno","due","tre");
		
		System.out.println(s1);
		
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		
		aggiungiIntero(i1,0,100,1000);
		
		aggiungi(i1,1,2,3,4,5,6,7);
		
		System.out.println(i1);
		
		ArrayListGeneric<String> alg1 = new ArrayListGeneric<String>();
		ArrayListGeneric<Integer> ali1 = new ArrayListGeneric<Integer>();
		
		
		alg1.aggiungi("ciao");
		alg1.aggiungi("hello");
		alg1.aggiungiN("salut","cerea","ola");
		System.out.println(alg1);
		
	}

}
