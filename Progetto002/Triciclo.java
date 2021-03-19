
public class Triciclo extends MotoCicletta {
	
	private String modello;

	 String getModello() {
		return modello;
	}

	 void setModello(String modello) {
		this.modello = modello;
	}
	 
	 
	 int leggiVelocita() { //override
			return super.leggiVelocita()/2;
		}
	 
	 
	
	 float leggiVelocita(int a) { //overload
			return (float)super.leggiVelocita()/2;
		}
	 
	 
	 	float leggiVelocitaf() { 
		 return (float)super.leggiVelocita()/2;
	 	}
	 
	

}
