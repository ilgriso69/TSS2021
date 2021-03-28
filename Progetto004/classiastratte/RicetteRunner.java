package classiastratte;

public class RicetteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Risotto riso1 = new Risotto ("Risotto alla milanese.");
		Pasta pasta1 = new Pasta ("Pasta sugo e pecorino.");
		Minestra pastaefagioli = new  Minestra ("pastaefagioli");
		Ricetta minestrone = new Minestra ("Minestrone");
		
		pastaefagioli.setCottura("30 minuti");
		//minestrone.setCottura("15 minuti");
		
		Ricetta[] ricette = {riso1, pasta1, minestrone};
		
//		for (Ricetta tmp:ricette)
//			
//			tmp.esecuzioneRicetta();
		
		ricette[0].esecuzioneRicetta();
		ricette[1].esecuzioneRicetta();
		ricette[2].esecuzioneRicetta();
			

	}

}
