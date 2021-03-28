package classiastratte;

public class Minestra extends Ricetta {

	private String cottura;
	
	public Minestra(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recuperaIngredienti() {
		System.out.println("- Verdure, soffritto.");

	}

	@Override
	public void preparaIngredienti() {
		System.out.println("- Pulizia accurata e preparazione minuziosa.");

	}

	@Override
	public void cucina() {
		System.out.println("- Fuoco lento per 50 minuti.");

	}

	@Override
	public void impiatta() {
		System.out.println("- Con un cucchiaio di olio d'oliva.");

	}

	public String getCottura() {
		return cottura;
	}

	public void setCottura(String cottura) {
		this.cottura = cottura;
	}

}
