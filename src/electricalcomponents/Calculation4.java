package electricalcomponents;
/****
 * 
 * @author monica
 *
 */
public class Calculation4 {
/****
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Resistor r1,r2,r3,r4,r5;
     r1=new Resistor();
		r1.readValue();
		
     r2=new Resistor();
		r2.readValue();
		
		r3=new Resistor();
		r3.readValue();
		
		r4=r2.parallel(r3);
		System.out.print("Effective parallel resistance:");
		r4.printValue();
		
		r5=r1.series(r4);
		System.out.print("\nEffective series resistance:");
		r5.printValue();
		
	}

}
