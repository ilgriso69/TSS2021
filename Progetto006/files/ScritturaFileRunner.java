package files;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class ScritturaFileRunner {

	public static void main(String[] args) throws IOException  {
		
	
		FileWriter fw = new FileWriter("output.txt");
		fw.write("uno");
		fw.write("\ndue");
		fw.write("\ntre");
		
		
		fw.close();
		System.out.println("Ok...");
		
		
//ArrayList<String> al1 = new ArrayList();
		
		LocalDateTime ora = LocalDateTime.now();
		
		
		//System.out.println(ora);
		
		FileWriter fw2 = new FileWriter("output2.txt");
		
		fw2.write("File creato il "+ora.getDayOfMonth()+"/"+ora.getMonthValue()+"/"+ora.getYear());
		fw2.write(" alle ore "+ora.getHour()+":"+ora.getMinute());
		fw2.write("\n");
		
		
		for (int i=1; i<=50; i++)
		{
			
		String ss="";
		
		for (int j=1 ; j<=80; j++) {
		int s1 = (int)Math.round(Math.random()*77+48);
		ss = ss+Character.toString((char)s1);
		}
			
		fw2.write(ss);
		fw2.write("\n");
			
		}
		
		
		System.out.println("Ok...");

		
		fw2.close();
		
		
	}

}
