package electricalcomponents;

public class Calculation3 {

	public static void main(String[] args) {
      Capacitor c3,c4,c5;
       
        c3=new Capacitor();
        c3.readValue();
        
        
        c4=new Capacitor();
        c4.readValue();
        
        
        c5=c3.parallel(c4);
        System.out.print("effective capacitance value is:");
        c5.printValue();
	}

}
