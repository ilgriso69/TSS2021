
public class Rettangolo {
	
	protected int altezza;
	protected int larghezza;
	private String nome;
	
	Rettangolo(){
	}
	

	
	Rettangolo (String nome, int lar, int alt){

		this.nome=nome;
		altezza=alt;
		larghezza=lar;
		
	}



	
	
	

 void disegnaArea() {
 for (int alt=1; alt<=altezza;alt++)
	 	{ for (int lar=1;lar<=larghezza;lar++)
	 		System.out.print("*");
	 	System.out.println();
	 	}
 
 	
 	}
 


 int perimetro() {
	 
	 /*if (altezza == 0)
		 return larghezza;
	 else if (larghezza == 0)
		 return altezza;
	 else*/ 
	 return altezza*2+larghezza*2;
 }
 
 
 int area() {
	 return altezza*larghezza;
 }
 
  
 
 String getName() {
	 return this.nome;
	 
 }
 
 
 
 }