package moltiplica;

import java.time.LocalDate;


  


public class MoltiplicaMesi implements Moltiplicazione {

	@Override
	public void moltiplica(Object o) {
		String s=(String)o;
		String[] s1 = s.split("/");
		LocalDate data = LocalDate.of(Integer.parseInt(s1[2]),
				Integer.parseInt(s1[1]),Integer.parseInt(s1[0]));
		
		for (int i=1; i<= volte; i++) {
		data = data.plusMonths(1);
		System.out.println(dataItaliana(data));
		}
		
		System.out.println();
		
		
	}

	
	public String dataItaliana (LocalDate data) {
		 String[]dataita=data.toString().split("-");
		return (dataita[2]+"/"+dataita[1]+"/"+dataita[0]);
		  
	  }
	

}
