/**
 * Program to calculate the effective resistance, inductance and capacitance values
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
public class Calculation2 {
	

	/********
	 * Program Entry Point
	 * @param args command line parameters
	 */	
	public static void main(String[] args) {
		Resistor r1,r2,r3,r4,r5;
		
		
			r1=new Resistor();
			r1.readValue();
			
			
			r2=new Resistor();
			r2.readValue();
			
			r3=new Resistor();
			r3.readValue();
			
			
			r4=r2.parallel(r3);
			System.out.print("Effective parallel resistance:");
			r3.printValue();
			
			r4=r1.series(r2);
			System.out.print("\nEffective series resistance:");
			r4.printValue();
		}
}
