package veicoli2;

import java.text.DecimalFormat;
import java.util.ArrayList;

import veicoli2.Veicolo.alimentazione;


public class VeicoliRunner {

	
	public static void aggiungi(ArrayList<Veicolo> al,Veicolo...v) {
		for (Veicolo veicolo : v) {
			al.add(veicolo);
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		
		String pattern = "###,###.###";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		//String format = decimalFormat.format(123456789.123);
		//System.out.println(format);
		
		// TODO Auto-generated method stub
AutoCarro ac1 = new AutoCarro("VOLVO", "FH",alimentazione.D, 150000, 4.0);
AutoCarro ac2 = new AutoCarro("SCANIA", "R",alimentazione.D, 180000, 4.5);
AutoCarro ac3 = new AutoCarro("IVECO", "Stralis",alimentazione.D, 165000, 4.8);

//System.out.println(decimalFormat.format(ac1.spesa_carburante()));
//System.out.println(decimalFormat.format(ac2.spesa_carburante()));
//System.out.println(decimalFormat.format(ac3.spesa_carburante()));

Furgone fu1=new Furgone("IVECO", "Daily",alimentazione.D, 120000, 7.8);
Furgone fu2=new Furgone("FORD", "Transit",alimentazione.D, 135000, 7.6);
Furgone fu3=new Furgone("CITROEN", "Jumper",alimentazione.D, 142000, 8.3);

AutoMobile am1 = new AutoMobile("FIAT", "Panda",alimentazione.B, 15000, 14);
AutoMobile am2 = new AutoMobile("RENAULT", "Clio",alimentazione.B, 18000, 14.8);
AutoMobile am3 = new AutoMobile("DACIA", "Duster",alimentazione.G, 22000, 11.5);
AutoMobile am4 = new AutoMobile("TOYOTA", "Yaris",alimentazione.B, 23456, 16.7);
	
	ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();
	
	aggiungi(veicoli,ac1,ac2,ac3,fu1,fu2,fu3,am1,am2,am3,am4);
	
	int numero_veicolo=1;
	double spesa_carburante_complessiva=0;
	double km_complessivi=0;
	System.out.println("*******************************");
	System.out.println("**********Riepilogo************");
	System.out.println("*******************************");
	System.out.println();
	for (Veicolo veicolo : veicoli) {
		System.out.printf("Veicolo: %d \n",numero_veicolo);
		System.out.println(veicolo);
		System.out.print("Spesa carburante di questo veicolo: € ");
		System.out.print(decimalFormat.format(veicolo.spesa_carburante()));
		System.out.println("\n");
		numero_veicolo++;
		spesa_carburante_complessiva+=veicolo.spesa_carburante();
		km_complessivi+=veicolo.getKm();
	}
	
	System.out.print("\nSpesa carburante complessiva del parco autoveicoli: € ");
	System.out.print(decimalFormat.format(spesa_carburante_complessiva));
	System.out.print("\nKm complessivi percorsi dal parco autoveicoli: ");
	System.out.print(decimalFormat.format(km_complessivi));
	System.out.print("\nCosto chilometrico medio: € ");
	System.out.print(decimalFormat.format(spesa_carburante_complessiva/km_complessivi));
	
	}

}
