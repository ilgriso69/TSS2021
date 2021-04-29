package calorie;

public class Computer extends Attivita {

private double ore;
	
	public Computer (double ore) {
		this.ore=ore;
		
	}
	
	
	@Override
	public double calcoloCalorie() {
		
		double calorie = 2*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}


	@Override
	public String toString() {
		return "Computer [ore=" + ore + "]";
	}

	
	
}
