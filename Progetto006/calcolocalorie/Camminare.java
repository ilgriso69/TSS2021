package calorie;

public class Camminare extends Attivita {

	private double ore;
	
	public Camminare (double ore) {
		this.ore=ore;
		
	}
	
	@Override
	public double calcoloCalorie() {
		
		double calorie = 2.8*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}

	@Override
	public String toString() {
		return "Camminare [ore=" + ore + "]";
	}

	
	
	
}
