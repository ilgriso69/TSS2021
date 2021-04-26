package figure4;

import java.util.HashMap;

public class FigureRunner {

	public static void main(String[] args) {
		Punto p1 = new Punto (2,5);
		Punto p2 = new Punto (-2,4);
		Punto p3 = new Punto();
		Punto p4 = new Punto (1,10);
		
		Segmento s1 = new Segmento (p1,p2);
		Segmento s2 = new Segmento (p4);
		Segmento s3 = new Segmento (new Punto(1,2),new Punto(3,4));
		Segmento s4 = new Segmento();
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		System.out.println(p1.trovaQuadrante());
		System.out.println(p2.trovaQuadrante());
		System.out.println(p3.trovaQuadrante());
		
		
		System.out.println(s1+"; Lunghezza= "+s1.lunghezza());
		System.out.println(s2+"; Lunghezza= "+s2.lunghezza());
		System.out.println(s3+"; Lunghezza= "+s3.lunghezza());
		System.out.println(s4+"; Lunghezza= "+s4.lunghezza());
		
		
		Figura t1 = new Triangolo (p1,p2,p3);
		
			
		System.out.println(t1);
		System.out.println("Perimetro = "+t1.perimetro());
		System.out.println("Area = "+t1.area());

		Figura t2 = new Triangolo(new Punto(0,4),new Punto(5,2),new Punto(3,-1));
		
		System.out.println(t2);
		System.out.println("Perimetro = "+t2.perimetro());
		System.out.println("Area = "+t2.area());
		
		Figura r1 = new Rettangolo(new Punto(), 4, 3);
		Figura r2 = new Rettangolo(new Punto (1,1), new Punto (3,2));
		
		System.out.println("Dati rettangolo r1: "+r1);
		System.out.println("Perimetro r1: "+r1.perimetro());
		System.out.println("Area r1: "+r1.area());
		
		System.out.println("Dati rettangolo r2: "+r2);
		System.out.println("Perimetro r2: "+r2.perimetro());
		System.out.println("Area r2: "+r2.area());
		
		Figura q1=new Quadrato(new Punto(2,1),5);
		
		System.out.println("Dati quadrato q1: "+q1);
		System.out.println("Perimetro q1: "+q1.perimetro());
		System.out.println("Area q1: "+q1.area());
		
		
        Figura c1=new Cerchio(new Punto(1,2),5);
		
		System.out.println("Dati cerchio c1: "+c1);
		System.out.println("Perimetro c1: "+c1.perimetro());
		System.out.println("Area c1: "+c1.area());
		
		Figura[] figure = {t1,t2,r1,r2,q1,c1};
				
		double areaTotaleFigure=0;
		
		/*
		if figure[0] istanceof Triangolo
			figure[0].area = .....
			else if figure[0] instance of Rettangolo
				figure[0].area=...
		
		late binding  <-- Vs -->  early binding
		*/
		
		
		for (Figura figura : figure) {
			
			areaTotaleFigure+=figura.area();
			
		}
			
		System.out.println("L'area totale di tutte le figure definite è: "+areaTotaleFigure);
		
		
		//Punto.numeropunti=0;
		System.out.println("\n\n\n*****Generazione casuale Punti********");
		
		
		HashMap<String,Punto> map= new HashMap<String,Punto>(); 
		
		for (int i=0; i<=1000; i++) {
			
			int x1 = (int)Math.round(Math.random()*20)-10;
			int y1 = (int)Math.round(Math.random()*20)-10;
			
			//int[] coordinate = {x1,y1};
			
			map.put("Punto"+i, new Punto(x1,y1));

			if (x1>0 && y1>0)
				Punto.numeropunti++;
			}
		
		System.out.printf("Sono stati generati %d punti nel primo quadrante.",Punto.numeropunti);
		
		System.out.println("\n\n");

		
		for (int i=0; i<=10; i++) {
			
			int x1 = (int)Math.round(Math.random()*1000);
			
			System.out.println("Ecco le coordinate del Punto "+x1+": "+map.get("Punto"+x1));
			System.out.println("("+map.get("Punto"+x1).trovaQuadrante()+")");
		}
		
		
		
		
		
System.out.println("\n\n\n*****Generazione casuale Figure********");
		
Punto.numeropunti=0;
		
		HashMap<String,Figura> mappafigure= new HashMap<String,Figura>(); 
		
		for (int i=0; i<=1000; i++) {
			
			int xx1 = (int)(Math.random()*20)-10;
			int yy1 = (int)(Math.random()*20)-10;
			
			int xx2 = (int)(Math.random()*20)-10;
			int yy2 = (int)(Math.random()*20)-10;
			
			int xx3 = (int)(Math.random()*20)-10;
			int yy3 = (int)(Math.random()*20)-10;
			
			int base = (int)(Math.random()*10);
			
			int altezza = (int)(Math.random()*10);
			
			int raggio = (int)(Math.random()*10);
			
			int sceglifigura = (int)(Math.random()*6);
			
	
			switch (sceglifigura) {
			case 0:
			mappafigure.put("Figura"+i, new Punto(xx1,yy1));
			Punto.numeropunti++;
			break;
			case 1:
			mappafigure.put("Figura"+i, new Segmento(new Punto(xx1,yy1),new Punto(xx2,yy2)));
			Segmento.numerosegmenti++;
			break;
			case 2:
			mappafigure.put("Figura"+i, new Rettangolo(new Punto(xx1,yy1),base,altezza));
			Rettangolo.numerorettangoli++;
			break;
			case 3:
			mappafigure.put("Figura"+i, new Quadrato(new Punto(xx1,yy1),base));
			Quadrato.numeroquadrati++;
			break;
			case 4:
			mappafigure.put("Figura"+i, new Triangolo(new Punto(xx1,yy1),new Punto(xx2,yy2),new Punto(xx3,yy3)));
			Triangolo.numerotriangoli++;
			break;
			case 5:
			mappafigure.put("Figura"+i, new Cerchio(new Punto(xx1,yy1),raggio));
			Cerchio.numerocerchi++;
			break;
			
			default:
			break;
			}
			
		
		
		}
		
		
		System.out.println("\n\nSono stati generati:");
		System.out.println(Punto.numeropunti+ " Punti;");
		System.out.println(Segmento.numerosegmenti+ " Segmenti;");
		System.out.println(Triangolo.numerotriangoli+ " Triangoli;");
		System.out.println(Rettangolo.numerorettangoli+ " Rettangoli;");
		System.out.println(Quadrato.numeroquadrati+ " Quadrati;");
		System.out.println(Cerchio.numerocerchi+ " Cerchi.");
		
		
		
		
			for (int i=0; i<=10; i++) {
			
			int x1 = (int)(Math.random()*1000);
			
			System.out.println("Ecco la figura "+x1+": "+mappafigure.get("Figura"+x1));
			
		}
		
		
		
		
	}

}
