package interfacce;

public interface VideoGame {
	
	public static final String nome = "Ciao";
	
	
	public void tasto_w();
	public void tasto_s();
	public void tasto_a();
	public void tasto_d();
	
	default void tasto_esc() {
		System.out.println("Programma terminato");
	}
}
