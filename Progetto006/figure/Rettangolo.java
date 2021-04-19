package figure;

public class Rettangolo {
	
	private Punto AngoloBassoSx;
	private Punto AngoloAltoDx;
	private int base;
	private int altezza;
	
	
	public Rettangolo() {
		this(new Punto(), new Punto());
	}
	
	public Rettangolo(Punto Bs, int base, int altezza) {
		AngoloBassoSx = Bs;
		this.base=base;
		this.altezza=altezza;
	}
	
	
	public Rettangolo(Punto Bs, Punto Ad) {
		this(Bs,Ad.getX()-Bs.getX(),Ad.getY()-Bs.getY());
		/*AngoloBassoSx=Bs;
		this.base=Ad.getX()-Bs.getX();
		this.altezza=Ad.getY()-Bs.getY();*/
		AngoloAltoDx=Ad;
			
	}
	
	
	public int perimetro() {
		return base*2+altezza*2;
	}
	
	
	public int area() {
		return base*altezza;
	}


	@Override
	public String toString() {
		return "Rettangolo [AngoloBassoSx=" + AngoloBassoSx + ", AngoloAltoDx=" + AngoloAltoDx + ", base=" + base
				+ ", altezza=" + altezza + "]";
	}
	
	
	
	

}
