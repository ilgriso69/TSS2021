import java.util.ArrayList;

public class PiattoPiemontese {
	private String piatto;
	private double prezzo; 
	private ArrayList<String> ingredienti = new ArrayList<String>();
	
	 PiattoPiemontese (String piatto){
		 this.piatto=piatto;
		 }
	 
	 PiattoPiemontese (String piatto, double prezzo){
		 this.piatto=piatto;
		 this.prezzo=prezzo;
		 }
	 
	 void aggiungiIngredienti(String...ingredienti) {
		  for (String temp:ingredienti)
			 this.ingredienti.add(temp);
		 
		 
	 }
	 
	


	 public String parlamiDelPiatto1() {
		 
		 String piatto2;
		 piatto2 = this.piatto.toUpperCase();
		
//		 System.out.println(piatto2);
//		 System.out.println(this.ingredienti);
		 
		 
		 switch(piatto2) {
		 
		 case "BAGNA_CAODA":
			 return "Descrizione: La bagna caoda o bagna cauda è una preparazione tipica del Piemonte preparata con acciughe, olio e aglio ed utilizzata come intingolo per le verdure fresche della stagione autunnale";
		case "VITELLO_TONNATO":
			 return "Descrizione: Il vitello tonnato è una ricetta tipica del Piemonte, un antipasto molto semplice da preparare e che conquista tutti con la sua bontà!";
			 
			 
		 case "BOLLITO_MISTO":
			 return "Descrizione: Il bollito misto è un ottimo piatto unico tipico della gastronomia piemontese, una variante del semplice bollito, una marea di salse!";
			
			 
		 case "AGNOLOTTI":
			 return "Descrizione: Gli agnolotti sono il tipico primo piatto della cucina Piemontese e rappresentano una ricetta conosciuta ed apprezzata non solo in Italia, ma anche all’estero per la sua bontà e semplicità.";
			
			 
		 case "BONET":
			 return "Commento: Il bonèt, tipico dolce al cucchiaio di origine piemontese, ottimo per chiudere in dolcezza il pasto.";
			
			 
		  default:
//			 System.out.println(this.piatto);
//			 System.out.println(this.ingredienti);
			 return "Non lo conosco, è buono?";
					 
		 }
		 
		 //System.out.println();
		 
		 
	 }
	 
	 
	 public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

	 
	 
	public String getPiatto() {
			return piatto;
		}

		public void setPiatto(String piatto) {
			this.piatto = piatto;
		}

		public ArrayList<String> getIngredienti() {
			return ingredienti;
		}

		public void setIngredienti(ArrayList<String> ingredienti) {
			this.ingredienti = ingredienti;
		}
/*
	@Override
	public String toString() {
		//return "PiattoPiemontese [piatto=" + piatto + ", prezzo=" + prezzo + ", ingredienti=" + ingredienti + "]";
	return piatto+", "+prezzo+"";
	}
*/
	
		 
}
