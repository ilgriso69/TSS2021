package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
--> classi che 
estendono Thread
o
implementano Runnable
*/


class Taskn extends Thread{   //Taskn(1), Taskn(2), ....
	
	private int inizio;
	
	Taskn(int inizio){
		this.inizio=inizio;
	}
	
	
	
	
	public void run() { //dichiarazione (signature) SEMPRE così
		
		System.out.println("Processo "+inizio+" iniziato");
		for (int i=100*inizio; i<=100*inizio+100; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}
		System.out.println("\nProcesso "+inizio+" terminato");
		
		
	}
	
}





public class EsempioExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService exserv1 = Executors.newFixedThreadPool(4);
		
			
		Taskn t1 = new Taskn(1);
		Taskn t2 = new Taskn(2);
		Taskn t3 = new Taskn(3);
		Taskn t4 = new Taskn(4);
		
		exserv1.execute(t1);
		exserv1.execute(t2);
		exserv1.execute(t3);
		exserv1.execute(t4);
		exserv1.execute(new Taskn(5));
		exserv1.execute(new Taskn(6));
		exserv1.execute(new Taskn(7));
		
		
	
		
		
		
		
		
			
		
		
		System.out.println("\n\n\nProcesso principale terminato");
		
		exserv1.shutdown();

	}

}
