package ordinamenti;

import java.util.Comparator;

public class StudenteOrdGen implements Comparator<Studente> {


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
		
		switch (modo) {
		
		case "ASC_ID":
		return s1.getId()-s2.getId();
		
		
		case "DESC_ID":
		return s2.getId()-s1.getId();
		
		
		case "ASC_NOME":
		return s1.getNome().compareTo(s2.getNome());
		
		
		case "DESC_NOME":
		return s2.getNome().compareTo(s1.getNome());
		

		default:
		return s1.getId()-s2.getId();
		}
		
			
	}

}
