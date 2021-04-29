package calorie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CalorieRunner {

	
	static void aggiungi (ArrayList<Attivita> al, Attivita...at) {
		for (Attivita attivita : at) {
			al.add(attivita);
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Dormire notte = new Dormire(8);
		Mangiare colazione = new Mangiare(0.5);
		Camminare camminata_mattino = new Camminare(0.5);
		Guidare andata = new Guidare(0.6);
		Computer lezione_mattino = new Computer(4);
		Mangiare pranzo = new Mangiare(1);
		Computer lezione_pomeriggio = new Computer(4);
		Guidare ritorno = new Guidare(0.5);
		Camminare camminata_sera = new Camminare(1);
		Mangiare cena = new Mangiare(1);
		Riposo dopo_cena = new Riposo(2.5);
		
		ArrayList<Attivita> attivita = new ArrayList();
		
		aggiungi(attivita, notte, colazione, camminata_mattino,
				andata,lezione_mattino,pranzo,lezione_pomeriggio,
				ritorno,camminata_sera,cena,dopo_cena);
		
		double riepilogo_calorie = 0;
		
		System.out.println("***************************************");
		System.out.println("***Riepilogo attività della giornata***");
		System.out.println("***************************************");
		System.out.println();
		
		for (Attivita attivita2 : attivita) {
			System.out.print(attivita2);
			System.out.print("; Calorie spese: ");
			System.out.print(attivita2.calcoloCalorie());
			System.out.println();
			riepilogo_calorie+=attivita2.calcoloCalorie();
		}
		
		riepilogo_calorie = Math.round(riepilogo_calorie*100);
		riepilogo_calorie /= 100;
		
		System.out.println();
		System.out.println("Per un consumo calorico "
				+ "complessivo pari a: "+riepilogo_calorie);
		
		System.out.println("*************************************");
		
		
		FileWriter fw = new FileWriter("calcolo_calorie.txt");
		
		fw.write("***************************************");
		fw.write(String.format("%n"));
		fw.write("***Riepilogo attività della giornata***");
		fw.write(String.format("%n"));
		fw.write("***************************************");
		fw.write(String.format("%n"));
		
		for (Attivita attivita2 : attivita) {
			fw.write(attivita2.toString());
			fw.write("; Calorie spese: ");
			fw.write(String.valueOf(attivita2.calcoloCalorie()));
			fw.write(String.format("%n"));
			
		}
		
		fw.write(String.format("%n"));
		fw.write("Per un consumo calorico "
				+ "complessivo pari a: "+riepilogo_calorie);
		fw.write(String.format("%n"));
		fw.write("*************************************");
		
		fw.close();
		
		//String comando="notepad.exe C:\\Users\\tss\\Documents\\eclipse-workspace\\eclipse- export-20210419.zip_expanded\\Progetto006\\calcolo_calorie.txt";
		
		//Runtime run = Runtime.getRuntime();
		//Process proc = run.exec(comando);
	}

}
