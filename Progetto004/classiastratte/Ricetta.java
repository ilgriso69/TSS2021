package classiastratte;

abstract public class Ricetta {
	
	private String nome;
	
	public Ricetta(String nome) {
		this.nome=nome;
	}
	
	
	abstract public void recuperaIngredienti();
	
	abstract public void preparaIngredienti();
		
	abstract public void cucina();
	
	abstract public void impiatta();

	public void inizioRicetta(){
		System.out.println("Inizio ricetta: "+this.nome);
		
	}
	
	
	public void fineRicetta(){
		System.out.println("Fine ricetta.\n");
		
	}
	
	
	public void esecuzioneRicetta() {
		
		inizioRicetta();
		recuperaIngredienti();
		preparaIngredienti();
		cucina();
		impiatta();
		fineRicetta();
		
	}
	
	
	
}
