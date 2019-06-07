import java.util.Scanner;

public class Capacitor {
	double capacitance;	
	public Capacitor(double v)
	{
		capacitance=v;
	}
	public Capacitor()
	{
		capacitance=0;
	}
	
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter the capacitance value ");
		capacitance=sc.nextDouble();
	}
	
	void printValue()
	{
		System.out.print(" "+capacitance+" farad");		
	}
	
	Capacitor parallel(Capacitor v)
	{
		Capacitor c;
		
		c=new Capacitor();
		c.capacitance=v.capacitance+this.capacitance;
		
		return c;		
	}
	
	Capacitor series(Capacitor v)
	{
		Capacitor c;
		
		c=new Capacitor();
		c.capacitance=(v.capacitance*this.capacitance)/(v.capacitance+this.capacitance);
		
		return c;
	}	
}
