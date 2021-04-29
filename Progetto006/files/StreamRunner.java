package files;

import java.util.ArrayList;

public class StreamRunner {
	
	
	public static void main(String[] args)  {
		
		ArrayList<String> al1 = new ArrayList ();
		
		al1.add("uno");
		al1.add("due");
		al1.add("tre");
		al1.add("quattro");
		al1.add("cinque");
		
		al1.stream()//.filter(s -> !s.contains("no")).filter(p -> p.length()<=3)
		.map(i -> i+"01")
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
		

	}

}
