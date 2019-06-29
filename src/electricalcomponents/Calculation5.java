package electricalcomponents;

public class Calculation5 {

	public static void main(String[] args) {
		
		
		Inductor L1,L2,L3;
		
		L1=new Inductor();
		L1.readValue();
		  
		
		L2=new Inductor();
		L2.readValue();
		
		L3=L1.series(L2);
		System.out.print(" effective inductance is :");
		L3.printValue();
		
	}

}
