package electricalcomponents;

import java.io.*;
import java.util.*;


public class Resistor {
	double resistance;	
	public Resistor(double v)
	{
		resistance=v;
	}
	public Resistor()
	{
		resistance=0;
	}
	
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the resistance value ");
		resistance=sc.nextDouble();
	}
	
	void printValue()
	{
		System.out.print(" "+resistance+" ohm");		
	}
	
	Resistor parallel(Resistor v)
	{
		Resistor r;
		
			r=new Resistor();
			r.resistance=(v.resistance*this.resistance)/(v.resistance+this.resistance);
			
			return r;
	}

	Resistor series(Resistor v)
	{
		Resistor r;
		
			r=new Resistor();
			r.resistance=v.resistance+this.resistance;
			
			return r;
	}
}
