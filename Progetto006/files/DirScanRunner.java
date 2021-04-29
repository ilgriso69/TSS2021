package files;

import java.io.File;
import java.io.IOException;


public class DirScanRunner {

	public static void main(String[] args) {
		//Files.list(Paths.get(".")).forEach(System.out::println);
		
		File[] files = new File(".").listFiles();
		
		for (File file : files) {
			
			//if (file.getName().endsWith("txt"))
			System.out.println(file);
			
		}
		

	}

}
