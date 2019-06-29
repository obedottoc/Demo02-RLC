package electricalcomponents;
/*****
 * To program effective capacitance
 * @author rosi
 *
 */

public class CalculationC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Capacitor c2,c3,c4;

	    
	    c4=new Capacitor();
	    c4.readValue();
	    
	    c3=new Capacitor();
	    c3.readValue();
	    
	    c2=c3.series(c4);
		System.out.print("\nEffective series Capacitance:");
		c2.printValue();
	}

}
