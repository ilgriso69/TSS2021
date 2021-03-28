package interfacce;

public class MicroCar implements VideoGame {

	@Override
	public void tasto_w() {
		System.out.println("Accelera");
		
	}

	@Override
	public void tasto_s() {
		System.out.println("Frena");
		
	}

	@Override
	public void tasto_a() {
		System.out.println("Sterza a sinistra");
		
	}

	@Override
	public void tasto_d() {
		System.out.println("Sterza a destra");
		
	}

}
