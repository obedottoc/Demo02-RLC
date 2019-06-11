package electricalcomponents;
import java.util.Scanner;

public class Inductor {
	double inductance;	
	public Inductor(double v)
	{
		inductance=v;
	}
	public Inductor()
	{
		inductance=0;
	}	
	
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the inductance value ");
		inductance=sc.nextDouble();
	}
	
	void printValue()
	{
		System.out.print(" "+inductance+" henry");		
	}
	
	Inductor parallel(Inductor v)
	{
		Inductor i;
		
			i=new Inductor();
			i.inductance=(v.inductance*this.inductance)/(v.inductance+this.inductance);
			
			return i;
	}

	Inductor series(Inductor v)
	{
		Inductor i;
		
			i=new Inductor();
			i.inductance=v.inductance+this.inductance;
			
			return i;
	}
}
