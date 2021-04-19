package figure2;

public class Segmento extends Figura {
	
	private Punto p1;
	private Punto p2;
	
	public Segmento(Punto q, Punto w) {
		this.p1=q;
		this.p2=w;
		
	}
	
	public Segmento (Punto a) {
		this(a,new Punto());
	
//		p1=a;
//		p2=new Punto();
}
	
	public Segmento() {
		this(new Punto(), new Punto());
	}
	
	
	
	public double lunghezza() {
		
		int cat1=p2.getX()-p1.getX();
		int cat2=p2.getY()-p1.getY();
		double ip = Math.sqrt(cat1*cat1+cat2*cat2);
		ip = Math.round(ip*100);
		return ip/100;
		
		
	}
	
	
	

	@Override
	public String toString() {
		return "Segmento [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	

}
