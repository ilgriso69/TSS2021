import java.util.ArrayList;

public class StudenteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studente stud1 = new Studente();
		
		
		stud1.setCognome("Ferrero");
		stud1.setNome("Marco");
		stud1.setMatricola(456987);
		
		Studente stud2 = new Studente();
		
		stud2.setCognome("Rossi");
		stud2.setNome("Luisa");
		stud2.setMatricola(456982);
		
		System.out.println(stud1);
		
		//stud1.aggiungiVotiItaliano(7.5,5.5,6.75);
		stud1.aggiungiVoti(stud1.getVotiIta(),7.0,6.3);
		
		stud2.aggiungiVoti(stud2.getVotiIta(),8.0,6.8);
		
		//stud1.aggiungiVotiMatematica(6,5.5,5.75);
		stud1.aggiungiVoti(stud1.getVotiMate(),6,5.5,5.75);
		
		System.out.println(stud1);
		
		//stud1.aggiungiVoti(stud1.getVotiIta(),7.0,6.3);
		//stud1.aggiungiVotiMatematica(5.90);
		
		System.out.println(stud1);
		
		ArrayList<Double> voti_italiano=stud1.getVotiIta();
		
		System.out.println("Media voti matematica: "+stud1.media(voti_italiano));
		System.out.println("Media voti italiano: "+stud1.media(stud1.getVotiIta()));
		
		//stud1.aggiungiVotiMatematica(8.90);
		
		System.out.println("Media voti matematica: "+stud1.media(stud1.getVotiMate()));
		double media_complessiva = ((stud1.media(stud1.getVotiMate())+stud1.media(stud1.getVotiIta()))/2);
		media_complessiva=Math.round(media_complessiva*100);
		media_complessiva/=100;
		
		System.out.println("Media complessiva: "+media_complessiva);
	}

}
