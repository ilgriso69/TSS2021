import java.util.ArrayList;

public class ProveListe {

	static void aggiungi2Elementi(ArrayList lista, int i, int j) {
		lista.add(i);
		lista.add(j);
	}
	
	
	static void aggiungiNElementi(ArrayList lista, int...elenco) {
		for(int tmp:elenco)
			lista.add(tmp);
	}
	
	
	static int sommaElementi(int...elenco) {
		int somma=0;
		for (int tmp:elenco)
			somma+=tmp;
		return somma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista1 = new ArrayList();
		
		lista1.add(1);
		lista1.add(10);
		lista1.add(50);
		
		System.out.println(lista1);
		System.out.println(lista1.get(0));
		System.out.println(lista1.size());
		System.out.println(lista1.get(lista1.size()-1));
		
		lista1.add(35);
		
		
		
		System.out.println(lista1);
		System.out.println(lista1.get(0));
		System.out.println(lista1.size());
		System.out.println(lista1.get(lista1.size()-1));
		
		aggiungi2Elementi(lista1, 80, 90);
		
		System.out.println(lista1);
		
		
		aggiungiNElementi(lista1, 120, -2, 93, 0);
		
		System.out.println(lista1);
		
		System.out.println(sommaElementi(1,23,45,-40));
		
		
				
	
		
	}

}
