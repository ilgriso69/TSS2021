
public class RipassoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		capitaleS("FRancia");
		capitaleS("SpaGNA");
		capitaleS("Belgio");
		capitaleS("Svizzera");
		
		System.out.println(capitaleS("GERMANIA"));
		
		if(capitaleS("francia").equals("Parigi"))
			System.out.println("Hai chiesto la capitale della Francia");
		
		for (int i=0;i<=7;i++)
			System.out.println(riconosciIntero(i));
		
		System.out.println(riconosciStringa("uno")+" "+riconosciStringa("due"));
		
	}

	private static void capitale(String string) {
		string=string.toLowerCase();
		switch (string) {
		case "francia":
		System.out.println("Parigi");
		break;
		
		case "germania":
		System.out.println("Berlino");
		break;

		case "spagna":
		System.out.println("Madrid");
		break;
		
		
		case "belgio":
		System.out.println("Bruxelles");
		break;
		
		default:
		System.out.println("Spiacente, nazione non riconosciuta");
		break;
		}
		
	}
	
	
	
	private static String capitaleS(String string) {
		string=string.toLowerCase();
		switch (string) {
		case "francia":
		return "Parigi";
			
		case "germania":
		return "Berlino";
		
		case "spagna":
		return "Madrid";
				
		case "belgio":
		return "Bruxelles";
		
		default:
		return "Spiacente, nazione non riconosciuta";
		
		}
		
	}
	
	
	static String riconosciIntero(int i) {
		switch (i) {
		
		case 1:
		return "uno";
		
		case 2:
		return "due";
		
		case 3:
		return "tre";
		
		case 4:
		return "quattro";
		
		case 5:
		return "cinque";

		default:
		return "Sorry, cifra non riconosciuta";
		}
	}
	
	
	static int riconosciStringa(String s) {
		switch (s) {
		
		case "uno":
		return 1;
		
		case "due":
		return 2;
		
		case "tre":
		return 3;
		
		case "quattro":
		return 4;
		
		case "cinque":
		return 5;

		default:
		return 0;
		}
	}
	
	
	

}
