package bmi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BmiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1= new Persona();
		
		System.out.println("*******************");
		System.out.println("****CALCOLO BMI****");
		System.out.println("*******************");
		
		System.out.print("Prego inserire altezza in centimetri: ");
		Scanner sc = new Scanner (System.in);
		String altezzas= sc.next();
		
		try { 
			
			double altezza=Double.parseDouble(altezzas);
			p1.setAltezza(altezza/100);
			
		} 
		catch (Exception e) {
				System.out.println("Errore. Rilevati dati numerici inseriti non validi: "
						+ "i risultati non sono attendibili");
			
		}
		
		
		System.out.print("Prego inserire peso in chilogrammi: ");
		double peso = sc.nextDouble();
		System.out.print("Prego inserire sesso (M/F) : ");
		String sesso = sc.next();
		
		if (sesso.equalsIgnoreCase("M"))
			p1.setSesso('M');
		else p1.setSesso('F');
		
		
		p1.setPeso(peso);
		
		//p1.setSesso('M');
		
		System.out.println("Peso: "+p1.getPeso());
		System.out.println("Altezza: "+p1.getAltezza());
		double d= p1.bmi();
		System.out.println("BMI: "+d);
		System.out.println(p1.commento());
		
		System.out.print("Prego inserire la tua data di nascita (gg/mm/aaaa): ");
		String data = sc.next();
		String[] data2=data.split("/");
		LocalDate dataNascita = LocalDate.of(Integer.parseInt(data2[2]),Integer.parseInt(data2[1]) , Integer.parseInt(data2[0]));
		LocalDate oggi = LocalDate.now();
		int anni = (int)ChronoUnit.YEARS.between(dataNascita,oggi);
		p1.setAnni(anni);
		System.out.printf("Quindi hai %d anni compiuti.\n",anni);
		
		
		System.out.println("Secondo la formula Deuremberg (2) la percentuale "
				+ "del tuo grasso corporeo è : " + p1.percentualeGrassoD());
		

		System.out.println("Secondo la formula Gallagher la percentuale "
				+ "del tuo grasso corporeo è : " + p1.percentualeGrassoG());
		
		
	}

}
