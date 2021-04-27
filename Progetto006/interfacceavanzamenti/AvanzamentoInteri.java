package interfacciaavanzamenti;

public class AvanzamentoInteri implements Avanzamento {

	
	
	
	@Override
	public void prossimiN(Object o) {
		// TODO Auto-generated method stub
		
	int a = (int)o;
	for (int i=1; i<=step; i++)
		System.out.println(a+i);
		
	
	}

	
	 
		
	

}
