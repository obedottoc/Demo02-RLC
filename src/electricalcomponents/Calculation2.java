package electricalcomponents;

public class Calculation2 {
	public static void main(String[] args) {
		Resistor r1,r2,r3,r4;
		
		
			r1=new Resistor();
			r1.readValue();
			
			r2=new Resistor();
			r2.readValue();
			
			
			r3=r1.parallel(r2);
			System.out.print("Effective parallel resistance:");
			r3.printValue();
			
			r4=r1.series(r2);
			System.out.print("\nEffective series resistance:");
			r4.printValue();
		}
}
