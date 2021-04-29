package calorie;

public class Riposo extends Attivita {

private double ore;
	
	public Riposo (double ore) {
		this.ore=ore;
		
	}
	
	
	
	@Override
	public double calcoloCalorie() {
		
		double calorie = 1.43*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}



	@Override
	public String toString() {
		return "Riposo [ore=" + ore + "]";
	}

}
