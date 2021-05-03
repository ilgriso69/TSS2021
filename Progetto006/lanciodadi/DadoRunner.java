package lanciodadi;

import java.util.Scanner;

public class DadoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dado d1 = new Dado();
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
		System.out.printf("Sono stati effettuati %d lanci.",Dado.numero_lanci);
		System.out.println("\nE' stato estratto: ");
		System.out.printf("%d volte il numero uno (%.2f%%)", Dado.uno, (double)Dado.uno*100/(double)Dado.numero_lanci);
		System.out.printf("\n%d volte il numero due (%.2f%%)", Dado.due, (double)Dado.due*100/(double)Dado.numero_lanci);
		System.out.printf("\n%d volte il numero tre (%.2f%%)", Dado.tre, (double)Dado.tre*100/(double)Dado.numero_lanci);
		System.out.printf("\n%d volte il numero quattro (%.2f%%)", Dado.quattro, (double)Dado.quattro*100/(double)Dado.numero_lanci);
		System.out.printf("\n%d volte il numero cinque (%.2f%%)", Dado.cinque, (double)Dado.cinque*100/(double)Dado.numero_lanci);
		System.out.printf("\n%d volte il numero sei (%.2f%%)", Dado.sei, (double)Dado.sei*100/(double)Dado.numero_lanci);
	
		sc.close();
		
	}

}
