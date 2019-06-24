/**
 * Program to represent resistor
 * 
 * Developed by
 * C. Obed Otto,
 * Associate Professor, Saveetha Engineering College
 * obedotto@saveetha.ac.in
 */
package electricalcomponents;

import java.io.*;
import java.util.*;


/***************
 * To represent resistor 
 * 
 * @author obedotto@saveetha.ac.in
 *
 */
public class Resistor {
	
	/***
	 * Resistance value in ohm
	 */	
	double resistance;
	
	
	/****
	 * To initialize the resistor with inital value 
	 * 
	 * @param v value of the resistance in ohm
	 */		
	public Resistor(double v)
	{
		resistance=v;
	}
	
	
	/********
	 * Create a resistor with zero resistance
	 */	
	public Resistor()
	{
		resistance=0;
	}
	
	
	/*************
	 * To read the resistance value from the user
	 */		
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the resistance value ");
		resistance=sc.nextDouble();
	}
	
	/*******
	 * To print the resistance value
	 */		
	void printValue()
	{
		System.out.print(" "+resistance+" ohm");		
	}
	
	
	/********
	 * To calculate effective resistance value of two parallel resistors
	 * 
	 * @param v Resistor object which is to be connected in parallel 
	 * @return Returns the effective total resistance 
	 */		
	Resistor parallel(Resistor v)
	{
		Resistor r;
		
			r=new Resistor();
			r.resistance=(v.resistance*this.resistance)/(v.resistance+this.resistance);
			
			return r;
	}

	/**********
	 * To calculate effective resistance value of two series resistors
	 * 
	 * @param v Resistor object which is to be connected in series
	 * @return Returns the effective total resistance
	 */		
	Resistor series(Resistor v)
	{
		Resistor r;
		
			r=new Resistor();
			r.resistance=v.resistance+this.resistance;
			
			return r;
	}
}
