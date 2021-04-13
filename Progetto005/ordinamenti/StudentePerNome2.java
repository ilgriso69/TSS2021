package ordinamenti;

import java.util.Comparator;

public class StudentePerNome2 implements Comparator<Studente> {

	
	
	@Override
	public int compare(Studente s1, Studente s2) {
		// TODO Auto-generated method stub
		return s2.getNome().compareTo(s1.getNome());
	}


	

}
