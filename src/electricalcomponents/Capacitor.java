/**
 * Program to represent Capacitor
 * 
 * Developed by
 * C. Obed Otto,
 * Associate Professor, Saveetha Engineering College
 * obedotto@saveetha.ac.in
 */
package electricalcomponents;
import java.util.Scanner;

/***************
 * To represent capacitor 
 * 
 * @author obedotto@saveetha.ac.in
 *
 */
public class Capacitor {
	double capacitance;	
	
	/****
	 * To initialize the capacitor with inital value 
	 * 
	 * @param v value of the capacitance in farad
	 */
	public Capacitor(double v)
	{
		capacitance=v;
	}
	
	/********
	 * Create a capacitor with zero capacitance
	 */
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
