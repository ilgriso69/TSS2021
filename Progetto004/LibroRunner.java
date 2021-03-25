
public class LibroRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("I Promessi Sposi","A. Manzoni");
		Libro libro2 = new Libro("Il nome della rosa","U. Eco");
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		Recensione rec1 = new Recensione ("Il libro italiano più stampato di sempre",7);
		
		
		
		libro1.setRecensioni(rec1);
		libro1.setRecensioni(new Recensione("Bello ma troppo difficile",6.5));
		libro2.setRecensioni(new Recensione ("Il libro italiano moderno più venduto",8));
		libro1.setRecensioni(new Recensione("Noioso",5));
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		String valore="unO";
		 
		valore=valore.toLowerCase();
		
			switch (valore) {
		
			case "uno":
			System.out.println("OK, il valore è 1.");
			break;
			
			case "due":
			System.out.println("OK, il valore è 2.");
			break;
				

			default:
			System.out.println("Il valore non è nè 1 nè 2.");
			break;
		}
		
		
		
		
		
		
	}

}
