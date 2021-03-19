
public class BinumeroRunner {
	
	
	static int raddoppia(int i) {
		return i*2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Binumero binumero2=new Binumero();
		
		Binumero binumero1=new Binumero(2,3);
		Binumero binumero3=new Binumero(20,30);
		
		BinumeroSingolo binumsing1=new BinumeroSingolo();
		BinumeroSingolo binumsing2=new BinumeroSingolo(10);
		
		
	
		
		System.out.println("Il numero1 di binumero1 è: "+binumero1.getNumero1());
		
		binumero1.setNumero1(12);
		
		System.out.println("Ora il numero1 di binumero1 è: "+binumero1.getNumero1());
		
		System.out.println("La somma delle proprietà di binumero1 è: "+binumero1.somma());
		
		System.out.println("Il prodotto delle proprietà di binumero1 è: "+binumero1.prodotto());
		
		
        System.out.println("Il numero1 di binumero3 è: "+binumero3.getNumero1());
		
		binumero1.setNumero1(12);
		
		System.out.println("Ora il numero1 di binumero3 è: "+binumero3.getNumero1());
		
		System.out.println("La somma delle proprietà di binumero3 è: "+binumero3.somma());
		
		System.out.println("Il prodotto delle proprietà di binumero3 è: "+binumero3.prodotto());
		
		System.out.println("Il prodotto delle proprietà di binumero3 è: "+binumero3.toString());
		
		
		
		int a = raddoppia(3);
		
		int b = raddoppia(a);
		
		
		binumero1.moltiplica(b);
		
		binumero1.SetNumeri(5,10);
		
		
		System.out.println("Ora il numero1 di binumero1 è: "+binumero1.getNumero1());
		
		System.out.println("******************************************************");
		
		System.out.println("Il numero1 di binumsing1 è: "+binumsing1.getNumero1());
		
		binumsing1.setNumero1(12);
		
		System.out.println("Ora numero1 di binumsing1 è: "+binumsing1.getNumero1());
				
		

	}

}
