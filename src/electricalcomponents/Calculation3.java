package electricalcomponents;

public class Calculation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capacitor c1,c2,c3;
		
		c1=new Capacitor();
		c1.readValue();
		
		c2=new Capacitor();
		c2.readValue();
		
		c3=c1.series(c2);
		System.out.print("Effective series capacitance:");
		c3.printValue();
		
		
		
	}

}
