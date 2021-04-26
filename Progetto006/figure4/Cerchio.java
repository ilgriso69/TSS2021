package figure4;

public class Cerchio extends Figura {
	
	static int numerocerchi=0;
	
	private Punto origine;
	private int raggio;
	final double Pi = 3.1415;
	
	
	public Cerchio (Punto or, int r) {
		origine=or;
		raggio=r;
	}
	
	
	
	
	

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		double per=raggio*Pi*2;
		per = Math.round(per*100);
		return per/100;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double ar=raggio*raggio*Pi;
		ar = Math.round(ar*100);
		return ar/100;
	}






	@Override
	public String toString() {
		return "Cerchio [origine=" + origine + ", raggio=" + raggio + "]";
	}
	
	
	

}
