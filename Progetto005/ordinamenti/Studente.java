package ordinamenti;

public class Studente {
	private int id;
	private String nome;
	
	
	Studente(int _id, String _nome){
		this.id=_id;
		this.nome=_nome;
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
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	

}
