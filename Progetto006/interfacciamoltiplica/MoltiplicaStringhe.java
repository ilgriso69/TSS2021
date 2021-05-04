package moltiplica;

public class MoltiplicaStringhe implements Moltiplicazione {

	@Override
	public void moltiplica(Object o) {
		String s=(String)o;
		for (int i=1; i<= volte; i++)
		System.out.print(s);
		System.out.println("\n");
		
		
	}

	

}
