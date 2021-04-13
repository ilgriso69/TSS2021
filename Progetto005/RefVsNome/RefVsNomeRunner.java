package refVsnome;

public class RefVsNomeRunner {

	public static void main(String[] args) {

		int i=10;
		int j=10;
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println((i == j));
		
		Persona luigi = new Persona(15);
		Persona mario = new Persona(15);
		
		System.out.println(luigi);
		System.out.println(mario);
		
		System.out.println(luigi == mario);
		
		System.out.println(luigi.id == mario.id);
		
		Persona lucia = luigi;
		
		System.out.println(lucia);
		
		System.out.println(luigi == lucia);
		
		System.out.println(luigi.id);
		
		lucia.id=250;
		
		System.out.println(luigi.id);
		
		lucia = mario;
		
		System.out.println(lucia.id);
		
		System.out.println(luigi.id);
		
		System.out.println(luigi == lucia);
		
		System.out.println(mario == lucia);
		
		

	}

}
