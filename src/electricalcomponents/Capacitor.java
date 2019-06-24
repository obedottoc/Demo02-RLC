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
	/***
	 * Capacitance value in Farad
	 */
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
	
	
	/*************
	 * To read the capacitance value from the user
	 */
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter the capacitance value ");
		capacitance=sc.nextDouble();
	}
	
	/*******
	 * To print the capacitance value
	 */
	void printValue()
	{
		System.out.print(" "+capacitance+" farad");		
	}
	
	
	/********
	 * To calculate effective capacitance value of two parallel capacitors
	 * 
	 * @param v Capacitor object which is to be connected in parallel 
	 * @return Returns the effective total capacitance 
	 */
	Capacitor parallel(Capacitor v)
	{
		Capacitor c;
		
		c=new Capacitor();
		c.capacitance=v.capacitance+this.capacitance;
		
		return c;		
	}
	
	/**********
	 * To calculate effective capacitance value of two series capacitors
	 * 
	 * @param v Capacitor object which is to be connected in series
	 * @return Returns the effective total capacitance
	 */
	Capacitor series(Capacitor v)
	{
		Capacitor c;
		
		c=new Capacitor();
		c.capacitance=(v.capacitance*this.capacitance)/(v.capacitance+this.capacitance);
		
		return c;
	}	
}
