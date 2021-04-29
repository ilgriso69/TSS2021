package calorie;

public class Guidare extends Attivita {

	private double ore;
	
	public Guidare (double ore) {
		this.ore=ore;
		
	}
	
	@Override
	public double calcoloCalorie() {
		
		double calorie = 1.9*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}

	@Override
	public String toString() {
		return "Guidare [ore=" + ore + "]";
	}

	
	
	
}
