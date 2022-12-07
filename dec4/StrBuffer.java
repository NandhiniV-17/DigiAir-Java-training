package com.digiair.training.assignment.dec4;
import java.util.Scanner;
public class StrBuffer {
	
	public void sbuf() 
	{
		Scanner e = new Scanner(System.in);
		System.out.println("\nEnter a string for StringBuffer");
	    String s5 = e.nextLine();
		StringBuffer sb1=new StringBuffer(s5);
		System.out.println("\nEnter a string to append");
		String s6 = e.nextLine();
		sb1.append(" ").append(s6);
		System.out.println ("String: "+sb1);
		System.out.println ("\nLength before trimming: "+(sb1.length()));
		System.out.println ("Capacity before trimming: "+(sb1.capacity()));
		
		//trimToSize () - to trims the capacity used for the character sequence of StringBuffer object
		sb1.trimToSize();
		System.out.println ("\nLength after trimming: "+(sb1.length()));
		System.out.println ("Capacity after trimming: "+(sb1.capacity()));
		
		/*substring(int start, int end)- returns a new String that contains a subsequence of characters currently 
		contained in this sequence*/
		 System.out.println("Enter the starting index: ");
		 int s7 = e.nextInt();
		 System.out.println("Enter the ending index: ");
		 int s8 = e.nextInt();
	    System.out.println("\nString at index "+s7+"9 is '" + (sb1.substring(s7)) + "'");// prints substring from index 9
	    System.out.println("substring from index "+s7+" to "+s8+" is '" + sb1.substring(s7, s8) + "'");

	    /*subSequence(int start, int end) method of Java StringBuffer class returns the new character 
	     * sequence from given start index to exclusive end index value of this sequence*/
	    System.out.println("\nSubsequence from index "+s7+" to "+s8+" is '" + sb1.subSequence(s7, s8) + "'");
	   
	}

}
