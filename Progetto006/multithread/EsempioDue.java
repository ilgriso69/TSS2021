package multithread;

/*
--> classi che 
estendono Thread
o
implementano Runnable
*/


class Task1 extends Thread{
	public void run() { //dichiarazione (signature) SEMPRE così
		
		System.out.println("Processo 1 iniziato");
		for (int i=100; i<=199; i++)
			System.out.print(i+" ");
		System.out.println("\nProcesso 1 terminato");
		
		
	}
	
}





public class EsempioDue {

	public static void main(String[] args) {
		
		//Task (processo) 1
		
		Task1 t1 = new Task1();
		//t1.run(); // No, ricordarsi che così non è multithread
		t1.start();
		
		
		//Task (processo) 2
			
		System.out.println("Processo 2 iniziato");
		for (int i=200; i<=299; i++)
			System.out.print(i+" ");
		System.out.println("\nProcesso 2 terminato");
		
		
		
		
		//Task (processo) 3
		
		System.out.println("Processo 3 iniziato");
		for (int i=300; i<=399; i++)
			System.out.print(i+" ");
		System.out.println("\nProcesso 3 terminato");
		
		
		
		System.out.println("\n\n\nProcesso principale terminato");
		
		

	}

}
