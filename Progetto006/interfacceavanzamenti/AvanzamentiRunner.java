package interfacciaavanzamenti;
import java.math.MathContext;
import java.util.ArrayList;

public class AvanzamentiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AvanzamentoInteri av = new AvanzamentoInteri();
		AvanzamentoGiorni ag = new AvanzamentoGiorni();
		
		av.prossimiN(14);
		ag.prossimiN("20/04/2021");
		
		OggettoString os = new OggettoString();
		
		
		
		ArrayList<String> al1 = new ArrayList();
		
		for (int i=1; i<=100; i++)
		{
			
		int s1 = (int)Math.round(Math.random()*77+48);
		int s2 = (int)Math.round(Math.random()*77+48);
		int s3 = (int)Math.round(Math.random()*77+48);
		int s4 = (int)Math.round(Math.random()*77+48);
		int s5 = (int)Math.round(Math.random()*77+48);
			
		String ss = Character.toString((char)s1)+Character.toString((char)s2)+
					Character.toString((char)s3)+Character.toString((char)s4)+
					Character.toString((char)s5);
			
			al1.add(ss);
			
		}
		
		
		os.inizio=15;
		
		os.elementi = al1;
		
		AvanzamentoStringhe as = new AvanzamentoStringhe();
		
		as.prossimiN(os);
		
		System.out.println(os.elementi.get(os.inizio+1)); // dovrei vedere il primo
		
		
		
	}

}
