package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class LetturaFileRunner2 {

	public static void main(String[] args) throws IOException {
		//Files.list(Paths.get("\\")).forEach(System.out::println);
		Path fileDaLeggere = Paths.get("./src/files/elenco.txt");
		Files.readAllLines(fileDaLeggere);
		System.out.println(Files.readAllLines(fileDaLeggere));
		
		Files.lines(fileDaLeggere).forEach(System.out::println);
		
	
		}

}
