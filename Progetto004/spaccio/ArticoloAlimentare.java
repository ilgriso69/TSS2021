package spaccio;

import java.time.LocalDate;

public class ArticoloAlimentare extends Articolo {
	
	private LocalDate dataScadenza;
	
	ArticoloAlimentare (String desc, double prezzo)	{
		super(desc,prezzo);
	}

	
	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}


	
	@Override
	public String toString() {
		String s = super.toString();
		s+="[datascadenza="+dataScadenza+"]";
		return s;
		
	}
	

}
