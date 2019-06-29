/**** * Program to calculate the effective resistance, inductance and capacitance values
 * 
 * Developed by
 * C. Obed Otto,
 * Associate Professor, Saveetha Engineering College
 * obedotto@saveetha.ac.in
 */
package electricalcomponents;

/*****
 * To perform series, parallel RLC calculation
 * 
 * @author obedotto@saveetha.ac.in
 *
 */
public class Calculation1 {

	/********
	 * Program Entry Point
	 * @param args command line parameters
	 */
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
