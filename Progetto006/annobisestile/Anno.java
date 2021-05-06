package annobisestile;

public class Anno {
	
	private int anno_b;
	
	Anno(){
		
	}
	
	
	Anno(int a){
		anno_b=a;
	}
	
	
	
	
	
	
	public int getAnno_b() {
		return anno_b;
	}


	public void setAnno_b(int anno_b) {
		this.anno_b = anno_b;
	}


	public boolean annobisestile() {
		
		if((anno_b%4==0 && anno_b%100!=0) || anno_b%400==0)
		return true;
		else return false;
		
	}
	

}
