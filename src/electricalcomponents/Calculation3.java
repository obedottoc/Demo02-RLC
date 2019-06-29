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
		System.out.println("\nEffective serie capacitance");
		c3.printValue();

		Resistor r1,r2,r3,r4,r5;
		r1=new Resistor();
		r1.readValue();
		r1.printValue();
		
		r2=new Resistor();
		r2.readValue();
		r2.printValue();
		
		r3=new Resistor();
		r3.readValue();
		r3.printValue();
		
		r4=r2.parallel(r3);
		System.out.println("\nEffective parallel resistance");
		r4.printValue();
		r5=r4.series(r1);
		System.out.println("\nEffective serie resistance");
		r5.printValue();
		
		Inductor l1,l2,l3;
		
		l1=new Inductor();
		l1.readValue();
		l1.printValue();
		
		l2=new Inductor();
		l2.readValue();
		l2.printValue();
		l3=l1.parallel(l2);
		System.out.println("\nEffective parallel inductance");
		l3.printValue();


	}

}
