package electricalcomponents;
/****
 * To perform the Effective series RLC Calculation 
 * @author monica
 *
 */
public class Calculation3 {
/****
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Capacitor c3,c4,c5;
         
        c3=new Capacitor();
 		c3.readValue();

 		c4=new Capacitor();
 		c4.readValue();
 		
 		c5=c3.series(c4);
		System.out.print("\nEffective series capacitance:");
		c5.printValue();
         
	}

}
