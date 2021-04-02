package spaccio;

import java.time.LocalDate;


public class SpaccioRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articolo art1 = new Articolo ("Sole piatti",2.49);
		Articolo art2 = new Articolo ("Promozione - Rotolone Reg.", 3.45);
		ArticoloAlimentare artal1 = new ArticoloAlimentare ("Prosciutto",4.30);
		ArticoloAlimentare artal2 = new ArticoloAlimentare ("Pasta fresca",4.10);
		ArticoloAlimentare artal3 = new ArticoloAlimentare ("Mozzarella",2.75);
		Articolo art3 = new Articolo ("Sacchi immondizia", 1.99);
		
		
		artal1.setDataScadenza(LocalDate.of(2021, 5, 5));
		artal3.setDataScadenza(LocalDate.of(2021, 4, 5));
		
		System.out.println(art1);
		System.out.println(art2);
		System.out.println(artal1);
		System.out.println(artal3);
		
		
		
		
		Cassa cassa1 = new Cassa();
		/*
		cassa1.aggiungiArticoli(art1);
		cassa1.aggiungiArticoli(art2);
		cassa1.aggiungiArticoli(artal1);
		cassa1.aggiungiArticoli(artal3);*/
		
		cassa1.aggiungiNarticoli(art1,art2,art3,artal1,artal2,artal3);
		
		System.out.println(cassa1);
		System.out.println("Importo totale: "+cassa1.conto());
		System.out.println("Importo totale con sconti: "+cassa1.conto2());
		
		
		
		
		
		
		
		
		

	}

}
