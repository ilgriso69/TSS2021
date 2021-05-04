package moltiplica;




public class Studente implements Moltiplicazione{
	
	private int id;
	private String nome;
	
	
	public Studente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



		@Override
	public void moltiplica(Object o) {
		Studente st = (Studente)o;
		if (o.equals(this)) {
		int new_id=this.getId()*Moltiplicazione.volte;
		this.setId(new_id);
		}
		else {
			System.out.println("Errore: oggetto e parametro devono coincidere!");
		}
			
		}
	
		
		
		@Override
		public String toString() {
			return "Studente [id=" + id + ", nome=" + nome + "]";
		}


}
