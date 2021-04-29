package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetturaFileRunner {

	public static void main(String[] args) throws FileNotFoundException  {
		
		FileInputStream file = new FileInputStream("./src/files/elenco.txt");
		Scanner sc=new Scanner(file); 
		
		ArrayList<String> righe_del_file = new ArrayList();
		HashMap<String,String> righe_del_file2 = new HashMap<String, String>();
		
		int n_riga=1;
		
		
		
		while(sc.hasNextLine())  
		{  
		
		String riga = sc.nextLine();
		righe_del_file.add(riga);
		righe_del_file2.put("Riga "+n_riga,riga);
		n_riga++;
		System.out.println(riga);      //returns the line that was skipped  
		//righe_del_file.entrySet("Riga "+n_riga,sc.nextLine());
		
		}  
		
		System.out.println(righe_del_file);
		System.out.println(righe_del_file2.entrySet());;
		//sc.close();     //closes the scanner  
		
	
	}  
	
		

}
