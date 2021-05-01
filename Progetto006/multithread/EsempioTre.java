package multithread;

/*
--> classi che 
estendono Thread
o
implementano Runnable
*/


class Task1b extends Thread{
	public void run() { //dichiarazione (signature) SEMPRE così
		
		System.out.println("Processo 1 iniziato");
		for (int i=100; i<=199; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}
		System.out.println("\nProcesso 1 terminato");
		
		
	}
	
}


class Task2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Processo 2 iniziato");
		for (int i=200; i<=299; i++)
			System.out.print(i+" ");
		System.out.println("\nProcesso 2 terminato");
		
		
	}
	
}





public class EsempioTre {

	public static void main(String[] args) throws InterruptedException {
		
		//Task (processo) 1
		
		Task1b t1 = new Task1b();
		//t1.run(); // No, ricordarsi che così non è multithread
		
		t1.setPriority(10); //default 5, min 1, max 10 Nb: è solo una richiesta
		t1.start();
		//t1.sleep(3000);
		
		
		
		//Task (processo) 2
			
		
		Task2 t2 = new Task2();
		Thread t2thr = new Thread(t2);
		
		t2thr.start();
		
		
		
		//Task (processo) 3
		
		System.out.println("Processo 3 iniziato");
		for (int i=300; i<=399; i++)
			System.out.print(i+" ");
		System.out.println("\nProcesso 3 terminato");
		
		
		
		t2thr.join();
		t1.join();
		
		System.out.println("\n\n\nProcesso principale terminato");
		
		

	}

}
