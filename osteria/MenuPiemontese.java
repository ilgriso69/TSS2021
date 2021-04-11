import java.util.ArrayList;

public class MenuPiemontese {

	private ArrayList<PiattoPiemontese> piatti = new ArrayList<PiattoPiemontese>();
	
	public void aggiungiPiatto(PiattoPiemontese piatto) {
		this.piatti.add(piatto);
	}

	@Override
	public String toString() {
		String str=" **************************************\n";
		str+=" ******** MENU DELL'OSTERIA: **********\n";
		str+=" **************************************\n";
		
		for (PiattoPiemontese tmp:piatti)
		{
		str+="\n"+tmp.getPiatto().toUpperCase()+": €"+tmp.getPrezzo();
		str+="\n"+tmp.getIngredienti();
		str+="\n"+tmp.parlamiDelPiatto1()+"\n";
		}
		return str;
	}
	
	
	
}
