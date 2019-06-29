package electricalcomponents;
/*****
 * perform series, parallel RLC calculation
 * @author user2 Rajamanickam
 *
 */
public class Calculation4 {
	/********
	 * Program Entry Point
	 * @param args command line parameters
	 */

	public static void main(String[] args) {
	Inductor l1,l2,l3;
		
	 l1=new Inductor();
	 l1.readValue();

		l2=new Inductor();
		l2.readValue();
		
		
		l3=l1.parallel(l2);
		System.out.print("Effective parallel Inductance:");
		l3.printValue();
		// TODO Auto-generated method stub

	}

}
