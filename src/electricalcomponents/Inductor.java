/**
 * Program to represent inductor
 * 
 * Developed by
 * C. Obed Otto,
 * Associate Professor, Saveetha Engineering College
 * obedotto@saveetha.ac.in
 */
package electricalcomponents;


import java.util.Scanner;


/***************
 * To represent inductor 
 * 
 * @author obedotto@saveetha.ac.in
 *
 */
public class Inductor {
	
	/***
	 * Inductance value in Henry
	 */
	double inductance;	
	
	
	/****
	 * To initialize the inductor with inital value 
	 * 
	 * @param v value of the capacitance in henry
	 */	
	public Inductor(double v)
	{
		inductance=v;
	}
	
	
	/********
	 * Create a inductor with zero inductance
	 */
	public Inductor()
	{
		inductance=0;
	}	
	
	
	/*************
	 * To read the inductance value from the user
	 */	
	void readValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the inductance value ");
		inductance=sc.nextDouble();
	}
	
	/*******
	 * To print the inductance value
	 */	
	void printValue()
	{
		System.out.print(" "+inductance+" henry");		
	}
	
	
	/********
	 * To calculate effective inductance value of two parallel inductors
	 * 
	 * @param v Inductor object which is to be connected in parallel 
	 * @return Returns the effective total inductance 
	 */	
	Inductor parallel(Inductor v)
	{
		Inductor i;
		
			i=new Inductor();
			i.inductance=(v.inductance*this.inductance)/(v.inductance+this.inductance);
			
			return i;
	}

	/**********
	 * To calculate effective inductance value of two series inductors
	 * 
	 * @param v Inductor object which is to be connected in series
	 * @return Returns the effective total inductance
	 */	
	Inductor series(Inductor v)
	{
		Inductor i;
		
			i=new Inductor();
			i.inductance=v.inductance+this.inductance;
			
			return i;
	}
}
