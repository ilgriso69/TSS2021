package figure2;

public class Punto extends Figura  {
	
	private int x;
	private int y;
	
	public Punto(int _x, int _y) {
		x=_x;
		y=_y;
	}
	
	
	public Punto(){
		x=0;
		y=0;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	public String trovaQuadrante() {
		String s = "";
		if (x>0 && y>0)
			s = "1� quadrante";
		else if (x==0 && y>0)
			s = "su asse y tra 1� e 2� quadrante";
		else if (x<0 && y>0)
			s = "2� quadrante";
		else if (x<0 && y==0)
			s = "su asse x tra 2� e 3� quadrante";
		else if (x<0 && y<0)
			s = "3� quadrante";
		else if (x==0 && y<0)
			s = "su asse y tra 3� e 4� quadrante";
		else if (x>0 && y<0)
			s = "4� quadrante";
		else if (x>0 && y==0)
			s = "su asse x tra 4� e 1� quadrante";
		else if (x==0 && y==0)
			s = "nell'origine (0,0)";
		
		//s = "Il Punto si trova "+s;
		return s;
		
		//else return "non trovato";
	}


	@Override
	public String toString() {
		
		String s = "Coordinate del Punto: ("+x+", "+y+")";
		return s;
				
		
		//return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	

}
