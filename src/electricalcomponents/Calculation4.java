package electricalcomponents;

public class Calculation4 {

	public static void main(String[] args) {
          Resistor R1,R2,R3,R4,R5;
          
          
          R1=new Resistor();
          R1.readValue();
          
          
          R2=new Resistor();
          R2.readValue();
          
          
          R3=R1.parallel(R2);
          
          
          R4=new Resistor();
          R4.readValue();
          
          R5=R4.series(R3);
          System.out.print("effective resistance is :");
          R5.printValue();
	}

}
