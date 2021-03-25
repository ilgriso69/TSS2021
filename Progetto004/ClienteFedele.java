
public class ClienteFedele extends Cliente {

	private int codicefedelta;
	private int sconto;
	
	public ClienteFedele(String nome) {
		super(nome+" FF");
		}

	public int getCodicefedelta() {
		return codicefedelta;
	}

	public void setCodicefedelta(int codicefedelta) {
		this.codicefedelta = codicefedelta;
	}
	
		
	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto*2;
	}
	
		
}
