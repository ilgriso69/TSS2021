package ordinamenti;

import java.util.Comparator;

public class StudentePerNome implements Comparator<Studente> {

	@Override
	public int compare(Studente s1, Studente s2) {
		// TODO Auto-generated method stub
		return s1.getNome().compareTo(s2.getNome());
	}

}
