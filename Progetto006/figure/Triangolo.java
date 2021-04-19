package figure;

public class Triangolo {
	
	private Punto v1;
	private Punto v2;
	private Punto v3;
	
	
	public Triangolo(Punto p1, Punto p2, Punto p3) {
		v1=p1;
		v2=p2;
		v3=p3;
			
	}

	
	public double perimetro() {
		
		Segmento lato1 = new Segmento (v1,v2);
		Segmento lato2 = new Segmento (v2,v3);
		Segmento lato3 = new Segmento (v3,v1);
		
		return lato1.lunghezza()+lato2.lunghezza()+lato3.lunghezza();
		
		
	}
	
	
	
	
	public double area() {
		
		Segmento lato1 = new Segmento (v1,v2);
		Segmento lato2 = new Segmento (v2,v3);
		Segmento lato3 = new Segmento (v3,v1);
		
		double p = this.perimetro()/2;
		
		//Radice di [ p(p-a)(p-b)(p-c) ]
		
		double area = Math.sqrt(p*(p-lato1.lunghezza())
				*(p-lato2.lunghezza())*(p-lato3.lunghezza()));
		area = Math.round(area*100);
		return area/100;
		
	}
	
	

	@Override
	public String toString() {
		return "Triangolo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	
	
	
	

}
