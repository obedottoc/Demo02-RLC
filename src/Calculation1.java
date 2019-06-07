
public class Calculation1 {

	public static void main(String[] args) {
	Resistor r1;
	Capacitor c1;
	
		r1=new Resistor();
		r1.readValue();
		r1.printValue();
		
		c1=new Capacitor();
		c1.readValue();
		c1.printValue();
	}

}
