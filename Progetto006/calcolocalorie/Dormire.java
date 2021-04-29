package calorie;

public class Dormire extends Attivita {
	
@Override
	public String toString() {
		return "Dormire [ore=" + ore + "]";
	}


private double ore;
	
	public Dormire (double ore) {
		this.ore=ore;
		
	}
	

	@Override
	public double calcoloCalorie() {
		
		double calorie = 0.93*ore*peso;
		calorie = Math.round(calorie*100);
		return calorie /100;
	}

}
