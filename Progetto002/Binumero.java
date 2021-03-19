
public class Binumero {
	private int numero1, numero2;
	//protected int numero3;
	
	

	public Binumero(int i, int j) {
		numero1=i;
		numero2=j;
	}

	public Binumero() {
		numero1=0;
		numero2=0;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int somma() {
		// TODO Auto-generated method stub
		return numero1+numero2;
	}

	public int prodotto() {
		// TODO Auto-generated method stub
		return numero1*numero2;
	}

	public void moltiplica(int i) {
		// TODO Auto-generated method stub
		numero1*=i;
		numero2*=i;
	}

	 void SetNumeri(int i, int j) {

		 //numero1=i;
		 //numero2=j;
		
	}

	

}
