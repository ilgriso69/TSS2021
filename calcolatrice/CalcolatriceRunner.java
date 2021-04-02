package calcolatrice;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcolatriceRunner {

		
	public static ArrayList<Numero> listanumeri = new ArrayList<Numero>();
	
	 public static void inserisciNumeri() {
		 String s;
		 System.out.println("***Inserimento valori***");
		 do {
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Inserire valori (# per terminare): ");
			 s=sc.next();
			 
			 if (!s.equals("#")) {
				
				 int n = Integer.parseInt(s);
				 listanumeri.add(new Numero(n));
				
			}
			
		} while (!s.equals("#"));
	 }
	 
	 
	public static void leggiNumeri() {
		System.out.println("***Elenco valori presenti in memoria***");
		for (Numero numero : listanumeri) {
			System.out.println(numero);
			
		}
	}
	
	
	public static void operazioniConNumeri() {
		
		
		
		String n1, n2, op;
		int i1=0; 
		int i2=0;
		
		System.out.println("***Scelta operandi e operatore***");
		Scanner sc = new Scanner(System.in);
		int dimensionelista= listanumeri.size();
		System.out.println("Id compresi tra 0 e "+(dimensionelista-1));
		System.out.print("Prego scegliere primo numero (id): ");
		n1=sc.next();
		System.out.print("Prego scegliere secondo numero (id): ");
		n2=sc.next();
		System.out.print("Prego scegliere operatore matematico: ");
		op=sc.next();
		
		//System.out.println(n1 + "  " + n2 + "  " + op);
		
		for (Numero numero : listanumeri) {
			
			if (numero.getIdnumero() == Integer.parseInt(n1))
				i1=numero.getValore();
			if (numero.getIdnumero() == Integer.parseInt(n2))
				i2=numero.getValore();
		}
		
		//System.out.println(i1 + "  " + i2);
		
		switch (op) {
		case "+":
		System.out.println(i1+i2);
		break;
		
		case "-":
		System.out.println(i1-i2);
		break;
		
		case "*":
		System.out.println(i1*i2);
		break;
		
		case "/":
		if (i2 != 0)
		System.out.println(i1/i2);
		else
		System.out.println("Errore: tentativo di divisione per 0.");
		break;
		
		case "^":
		System.out.println(Math.pow(i1,i2));
		break;

		default:
		System.out.println("Errore: operazione non riconosciuta.");	
		break;
		}
		
	}
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Numero n1 = new Numero (34);
		Numero n2 = new Numero (2);
		Numero n3 = new Numero (-5);
		Numero n4 = new Numero (1024);
		
		
		/*
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		
		listanumeri.add(n1);
		listanumeri.add(n2);
		
		listanumeri.add(new Numero(67));
		*/
		
		String s;
		
		do {
			
			
			System.out.println("***Elenco opzioni disponibili***");
			System.out.println("I: inserimento numeri");
			System.out.println("L: lista numeri memorizzati");
			System.out.println("O: operazioni con i numeri memorizzati");
			System.out.println("#: uscita");
			System.out.println("Prego scegliere un'opzione: ");
			
			Scanner sc= new Scanner(System.in);
			s=sc.next().toUpperCase();
			
			if (!s.equals("#")) {
				
				switch (s) {
				case "I":
				inserisciNumeri();
				break;
				
				case "L":
				leggiNumeri();
				break;
				
				case "O":
				operazioniConNumeri();
				break;

							
				default:
				System.out.println("Scelta non riconosciuta.");
				break;
				}
				
			}
			
			
		} while (!s.equals("#"));
		
		
	System.out.println("Programma terminato.");	
				
	
	
	
		
	

	}





	
		
	

}
