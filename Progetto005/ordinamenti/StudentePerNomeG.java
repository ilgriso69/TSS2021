package ordinamenti;

import java.util.Comparator;

public class StudentePerNomeG implements Comparator<Studente> {


	private String modo;
	
	// ASC_ID, DESC_ID, ASC_NOME, DESC_NOME
	// ASC = A -> Z
	// DESC = Z -> A
	
	public String getModo() {
		return modo;
	}


	public void setModo(String modo) {
		this.modo = modo;
	}
	
	
	
	
	@Override
	public int compare(Studente s1, Studente s2) {
		// TODO Auto-generated method stub
		if (modo == "ASC")
		return s1.getNome().compareTo(s2.getNome());
		else
		return s2.getNome().compareTo(s1.getNome());
			
	}

}
