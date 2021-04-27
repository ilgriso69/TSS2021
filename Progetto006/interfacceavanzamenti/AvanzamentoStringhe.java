package interfacciaavanzamenti;
import java.time.LocalDate;
import java.util.ArrayList;

public class AvanzamentoStringhe implements Avanzamento {

	
	
	
	@Override
	public void prossimiN(Object o) {
		// TODO Auto-generated method stub
		
		OggettoString os = (OggettoString)o;
		
		int iniziale = os.inizio;
		ArrayList<String> elementi = os.elementi;
		
		
		for (int i=1; i<=step; i++) {
			
			if 	(elementi.size() > (iniziale+i))		
			System.out.println(elementi.get(iniziale+i));
		
		
		}
	
	
	}

	
	 
		
	

}
