package ordinamenti;

import java.util.Comparator;

public class StudentePerId2 implements Comparator<Studente> {

	@Override
	public int compare(Studente s1, Studente s2) {
		// TODO Auto-generated method stub
		return s2.getId()-s1.getId();
	}

}
