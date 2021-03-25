import java.util.ArrayList;

public class Libro {
	
	private String titolo;
	private String autore;
	private ArrayList<Recensione> recensioni = new ArrayList<Recensione>();

public Libro(String titolo, String autore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
	}

public void setRecensioni(Recensione recensione) {
	this.recensioni.add(recensione);
}


@Override
public String toString() {
	//return "Libro [titolo=" + titolo + ", autore=" + autore + ", recensioni=" + recensioni + "]";
 String stringa = "Titolo=" + titolo + ", Autore="+ autore;
  
 if (recensioni.size() != 0)
	  
	 for(Recensione tmp:recensioni)
		  stringa+="\n"+tmp;
	  
//	  for (int i = 0; i<recensioni.size(); i++)
//		   {
//		  stringa+="\n"+(recensioni.get(i));
//		   }
	  
  stringa +="\n";
	 

	  
  return stringa;

}





}
