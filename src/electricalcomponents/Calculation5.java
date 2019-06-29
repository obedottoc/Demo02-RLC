package electricalcomponents;
/****
 * 
 * @author monica
 *
 */
public class Calculation5 {
/*****
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inductor l1,l2,l3;
		
		l1=new Inductor();
		l1.readValue();
		
		l2=new Inductor();
		l2.readValue();
		
		l3=l1.parallel(l2);
		System.out.print("Effective parallel inductance:");
		l3.printValue();
		
		
		
	}

}
