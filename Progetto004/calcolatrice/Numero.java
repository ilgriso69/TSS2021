package calcolatrice;

public class Numero {
	 
	private static int idnumeri;
	 
	 private int idnumero;
	 private int valore;
	
	  
	 
	 public Numero(int valore) {
		super();
		idnumero=idnumeri;
		idnumeri++;
		this.valore = valore;
	}
	 
	 
	 
	 
	public int getIdnumero() {
		return idnumero;
	}
	public void setIdnumero(int idnumero) {
		this.idnumero = idnumero;
	}
	public int getValore() {
		return valore;
	}
	public void setValore(int valore) {
		this.valore = valore;
	}




	@Override
	public String toString() {
		return "Numero [idnumero=" + idnumero + ", valore=" + valore + "]";
	}




	 
	 
	 
	

}
