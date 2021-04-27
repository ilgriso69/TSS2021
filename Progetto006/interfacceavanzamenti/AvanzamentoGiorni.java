 package interfacciaavanzamenti;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AvanzamentoGiorni implements Avanzamento {

	
	
	
	@Override
	public void prossimiN(Object o) {
		// TODO Auto-generated method stub
		
		String s = (String)o;
		String [] s2 = s.split("/");
		LocalDate data = LocalDate.of(Integer.parseInt(s2[2]),Integer.parseInt(s2[1]),
				Integer.parseInt(s2[0]));
		
		for (int i=1; i<=step; i++)
			System.out.println(data.plusDays(i));
		
		
		
	
	
	}

	
	 
		
	

}
