package lanciodadi;

import java.util.Scanner;

public class DadoRunner2Dadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dado2 d1 = new Dado2();
		Scanner sc = new Scanner(System.in);
		
		String risp="s";
		
		//d1.mostraLancio();
		
		
		while (risp.equalsIgnoreCase("s"))  {
			
			d1.mostraLancio();
			
			System.out.print("\nAltro lancio (S/N)?");
			
			risp=sc.next();
			
			while (!risp.equalsIgnoreCase("s") && !risp.equalsIgnoreCase("n")){
								
				System.out.println("Prego inserire 'S' o 'N'.");
				System.out.print("\nAltro lancio (S/N)?");
				risp=sc.next();
			} 
			
								
		} 
		
		System.out.println("\nLanci terminati.");
	
		System.out.println("Risultati: ");
		System.out.printf("Sono stati effettuati %d lanci.",Dado2.numero_lanci);
		System.out.println("\nE' stato estratto: ");
		
		System.out.printf("\n%d volte il numero due (%.2f%%)", Dado2.due, (double)Dado2.due*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero tre (%.2f%%)", Dado2.tre, (double)Dado2.tre*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero quattro (%.2f%%)", Dado2.quattro, (double)Dado2.quattro*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero cinque (%.2f%%)", Dado2.cinque, (double)Dado2.cinque*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero sei (%.2f%%)", Dado2.sei, (double)Dado2.sei*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero sette (%.2f%%)", Dado2.sette, (double)Dado2.sette*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero otto (%.2f%%)", Dado2.otto, (double)Dado2.otto*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero nove (%.2f%%)", Dado2.nove, (double)Dado2.nove*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero dieci (%.2f%%)", Dado2.dieci, (double)Dado2.dieci*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero undici (%.2f%%)", Dado2.undici, (double)Dado2.undici*100/(double)Dado2.numero_lanci);
		System.out.printf("\n%d volte il numero dodici (%.2f%%)", Dado2.dodici, (double)Dado2.dodici*100/(double)Dado2.numero_lanci);
		
		sc.close();
		
	}

}
