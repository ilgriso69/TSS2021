package calorie;

public class Mangiare extends Attivita {

private double ore;
	
	public Mangiare (double ore) {
		this.ore=ore;
		
	}
	
	
	@Override
	public double calcoloCalorie() {
		
		double calorie = 1.8*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}


	@Override
	public String toString() {
		return "Mangiare [ore=" + ore + "]";
	}

}
