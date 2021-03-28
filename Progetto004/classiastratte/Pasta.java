package classiastratte;

public class Pasta extends Ricetta {

	public Pasta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recuperaIngredienti() {
		System.out.println("- Pasta, sugo, pecorino.");
		
	}

	@Override
	public void preparaIngredienti() {
		System.out.println("- Cotta pasta, preparato sugo.");
		
	}

	@Override
	public void cucina() {
		System.out.println("- Al dente in 12 minuti.");
		
	}

	@Override
	public void impiatta() {
		System.out.println("- Impiattato con abbondante pecorino.");
		
	}

}
