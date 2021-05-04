package moltiplica;

public class MoltiplicazioneRunner {

	public static void main(String[] args) {
		
		MoltiplicaInteri mi = new MoltiplicaInteri();
		
		mi.moltiplica(4);
		
		MoltiplicaStringhe ms = new MoltiplicaStringhe();
		
		ms.moltiplica("Ciao");
		
		MoltiplicaMesi mm = new MoltiplicaMesi();
		
		mm.moltiplica("01/05/2021");
		
		Studente s1 = new Studente(100, "Mario");
		Studente s2 = new Studente(101, "Luisa");
		Studente s3 = new Studente(200, "Paola");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1.moltiplica(s1);
		
		System.out.println(s1);
		
		s1.moltiplica(s2);
		
		s2.moltiplica(s2);
		s3.moltiplica(s3);
		
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
