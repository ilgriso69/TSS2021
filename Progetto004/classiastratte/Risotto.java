package classiastratte;

public class Risotto extends Ricetta {

	public Risotto(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recuperaIngredienti() {
		System.out.println("- Riso, soffritto, brodo.");
	}

	@Override
	public void preparaIngredienti() {
		System.out.println("- Preparato soffritto, messo riso, sfumato con brodo.");
	}

	@Override
	public void cucina() {
		System.out.println("- Cuocere a fuoco medio per 20 minuti.");

	}

	
	public void impiatta() {
		System.out.println("- Impiattare con abbondate parmigiano.");

	}

}
