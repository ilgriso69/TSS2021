package frazioni;

import java.util.ArrayList;

public class Frazione {
	private int num;  /*numeratore*/
	private int den; /*denominatore*/

	
	Frazione(){
		this(0,1);
	}
	
	Frazione(int _n, int _d){
		num=_n;
		den=_d;
		this.semplifica2();
	}
	
	Frazione (int _n){
		/*num=_n;
		den=1;*/
		this (_n,1); //-> diventa Frazione(_n,1)
						// Frazione (5) --> diventa --> Frazione (5,1)
		
		this.semplifica2();
	}
	
	Frazione (String s){
		
		/*if (s.contains("\\")) {
			String[] v1=s.split("\\\\");
			num=Integer.parseInt(v1[0]);
			den=Integer.parseInt(v1[1]);
			}
		*/
		
		if (s.contains("-")) {
			String[] v1=s.split("-");
			num=Integer.parseInt(v1[0]);
			den=Integer.parseInt(v1[1]);
			}
		
		
		if (s.contains("/")) {
			String[] v1=s.split("/");
			num=Integer.parseInt(v1[0]);
			den=Integer.parseInt(v1[1]);
			}
				
		this.semplifica2();
	}
	
	
	public void somma(Frazione f) {
		
		this.num = (this.num*f.den)+(this.den*f.num);
		this.den=this.den*f.den;
	
		this.semplifica2(); //dopo!
		 
		//return this.toString();
			
	}
	
	
	public void semplifica() {
		int mcd=1;
		ArrayList<Integer> divisoriNum = new ArrayList();
		ArrayList<Integer> divisoriDen = new ArrayList();
		
		for (int i =1; i<=this.num; i++) {
			if (this.num % i == 0)
				divisoriNum.add(i);
		}
				
		for (int i =1; i<=this.den; i++) {
			if (this.den % i ==0)
				divisoriDen.add(i);
		}
		
		
		if (this.num <= this.den) {
			for (int temp : divisoriNum) {
				if (divisoriDen.contains(temp))
					mcd=temp;			
			}
		}
		
		else
			for (int temp : divisoriDen) {
				if (divisoriNum.contains(temp))
					mcd=temp;			
			}
			
		
		this.num/=mcd;
		this.den/=mcd;
		
		//System.out.println(mcd);
		
		//return this.toString();
		
	}
	
	
	
	public void semplifica2() {
		int mcd=1;
		if (this.num <= this.den) {
			for (int i=1; i<= this.num; i++) {
				if ((this.num % i == 0) && (this.den % i == 0))
					mcd=i;			
			}
		}
		
		else
			for (int i=1; i<= this.den; i++) {
				if ((this.num % i == 0) && (this.den % i == 0))
					mcd=i;			
			}
			
		
		this.num/=mcd;
		this.den/=mcd;
		
		//System.out.println(mcd);
		
		//return this.toString();
		
	}
	
	

	 public static int mcdR(int p, int q) {
	        if (q == 0) return p;
	        else return mcdR(q, p % q);
	    }
	

	@Override
	public String toString() {
		
		String s = this.num +"/"+ this.den; 
		return s;
	
	}
	
	
	

}
