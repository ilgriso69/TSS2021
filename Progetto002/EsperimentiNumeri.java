import java.math.BigDecimal;

public class EsperimentiNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BigDecimal b1 = new BigDecimal("1000");
		BigDecimal b2 = new BigDecimal("35.789");
		BigDecimal b3 = b1.add(b2);
		
		System.out.println("b1= "+b1);
		System.out.println("b2= "+b2);
		System.out.println("Somma dei 2 = "+b1+b2);
		System.out.println("Somma dei 2 = "+b1.add(b2));
		System.out.println("Prodotto dei 2 = "+b1.multiply(b2));
		
//		Classe Mutuo
//			Proprietà: capitale, interesse e anni
//			Metodo: importoTotale = capitale+capitale*interesse*anni
//	
		
		Mutuo m1 = new Mutuo("100000","3.5",20);
		Mutuo m2 = new Mutuo("150000","3.1",15);
		
		System.out.println("Importo Totale M1: "+m1.importoTotale());
		System.out.println("Importo Totale M2: "+m2.importoTotale());
		
			
	}

}
