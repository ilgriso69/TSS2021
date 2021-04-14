package ordinamenti;

import java.util.ArrayList;
import java.util.Arrays;


public class OrdinamentiRunner3 {
	
	
	public static void aggiungiI(ArrayList al,int...elementi) {
		for(int i : elementi)
			al.add(i);
	}
	
	
	public static void aggiungiS(ArrayList al,String...elementi) {
		for(String i : elementi)
			al.add(i);
	}
	
	
	static void insertSort (int[] vettore) {
		int i, j, valore;
		for (i=1; i<vettore.length;i++) {
			valore=vettore[i];
			j=i-1;
			while (j>=0 && vettore[j]>valore) {
				vettore[j+1]=vettore[j];
				j--;
			}
			vettore[j+1]=valore;
		}
	}
	
	
	static void insertSort (ArrayList<Integer> vettore) {
		int i, j, valore;
		for (i=1; i<vettore.size();i++) {
			valore=vettore.get(i);
			j=i-1;
			while (j>=0 && vettore.get(j)>valore) {
				//vettore[j+1]=vettore[j];
				vettore.set(j+1,vettore.get(j));
				j--;
			}
			//vettore[j+1]=valore;
			vettore.set(j+1, valore);
		}
	}
	
	
	
	
	static void insertSortS (ArrayList<String> vettore) {
		int i, j; 
		String valore;
		for (i=1; i<vettore.size();i++) {
			valore=vettore.get(i);
			j=i-1;
			while (j>=0 && (vettore.get(j).compareTo(valore)>0)) {
				vettore.set(j+1,vettore.get(j));
				j--;
			}
			vettore.set(j+1,valore);
		}
	}
	
	static void insertSort (String[] vettore) {
		int i, j; 
		String valore;
		for (i=1; i<vettore.length;i++) {
			valore=vettore[i];
			j=i-1;
			while (j>=0 && (vettore[j].compareTo(valore)>0)) {
				vettore[j+1]=vettore[j];
				j--;
			}
			vettore[j+1]=valore;
		}
	}
	
	
/*	function insertionSortIterativo(array A)
    for i ← 1 to length[A] 
      do value ← A[i]
           j ← i-1
       while j >= 0 and A[j] > value 
         do A[j + 1] ← A[j]
            j ← j-1
       A[j+1] ← value;
*/
	
	
	static void insertSortSt (ArrayList<Studente> al) {
		int i, j, valore;
		Studente s1;
		for (i=1; i<al.size();i++) {
			valore=al.get(i).getId();
			s1=al.get(i);
			j=i-1;
			while (j>=0 && al.get(j).getId()>valore) {
				//vettore[j+1]=vettore[j];
				al.set(j+1,al.get(j));
				j--;
			}
			//vettore[j+1]=valore;
			al.set(j+1,s1);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v1 = {1,3,56,23,90,2,10};
		String[] v2 = {"antonio","luisa","paola","davide"};
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		
		insertSort(v1);
		insertSort(v2);
		
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		
		
		ArrayList al1 = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		
		aggiungiI(al1,1,45,79,23,45,71);
		
		System.out.println(al1);
		
		al1.add(151);
		
		insertSort(al1);
		
		System.out.println(al1);
		
				
		aggiungiS(al2,"pera", "banana","mela");
				
		
		System.out.println(al2);
		
		insertSortS(al2);
		
		
		
		System.out.println(al2);
		
		Studente s1 = new Studente(110,"Amilcare");
		Studente s2 = new Studente(101,"Eusebia");
		Studente s3 = new Studente(100,"Patroclo");
		
		ArrayList<Studente> als1 = new ArrayList<Studente>();
		
		als1.add(s1);
		als1.add(s2);
		als1.add(s3);
		
		
		System.out.println(als1);
	
		
		insertSortSt(als1);
		
		System.out.println(als1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
