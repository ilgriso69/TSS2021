package interfacce;

import java.util.ArrayList;

public class VideoGameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mario mario1 = new Mario();
		MicroCar gioco1 = new MicroCar();
		
		mario1.tasto_a();
		gioco1.tasto_a();
		
		mario1.tasto_esc();
		gioco1.tasto_esc();
		
		
		mario1.tastoF5();
		//gioco1.tastoF5();
		
		ArrayList<VideoGame> raccolta2 = new ArrayList<VideoGame>();
		
		ArrayList<VideoGame> raccolta3 = new ArrayList<VideoGame>();
		
		
		raccolta2.add(gioco1);
		raccolta2.add(mario1);
		
		 for (VideoGame tmp:raccolta2)
		 {
			 System.out.println("************");
			 tmp.tasto_a();
			 tmp.tasto_d();
			 tmp.tasto_s();
			 tmp.tasto_w();
			 System.out.println();
			 tmp.tasto_esc();
		 }
		
		
		
		VideoGame[] raccolta = {mario1, gioco1};
		 for (VideoGame tmp:raccolta)
		 {
			 System.out.println("************");
			 tmp.tasto_a();
			 tmp.tasto_d();
			 tmp.tasto_s();
			 tmp.tasto_w();
			 System.out.println();
			 tmp.tasto_esc();
		 }

	}

}
