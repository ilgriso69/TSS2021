package interfacce;

public class Mario implements VideoGame, VideoGame2 {

	@Override
	public void tasto_w() {
		System.out.println("Salto");
		
	}

	@Override
	public void tasto_s() {
		System.out.println("Abbassati");
		
	}

	@Override
	public void tasto_a() {
		System.out.println("Passo a sinistra");
		
	}

	@Override
	public void tasto_d() {
		System.out.println("Passo a destra");
		
	}

	@Override
	public void tastoF5() {
		System.out.println("Autosave");
		
	}

	@Override
	public void tastoF6() {
		System.out.println("Autoload");
		
	}
	


}
