package com.digiair.training.assignment.dec4;
import java.util.Scanner;
public class Palindrome 
{
	public void palind() 
	{
		Scanner b = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("\nEnter a string to check whether it is a Palindrome or not");
	    String s = b.nextLine();
	    
	    String revStr = "";
	    
	    int strLength = s.length();

	    for (int i = (strLength - 1); i >=0; i--) 
	    {
	      revStr = revStr + s.charAt(i);
	    }

	    if (s.equals(revStr) )
	    {
	      System.out.println("The String '"+ s + "' is a Palindrome");
	    }
	    else 
	    {
	      System.out.println("The String '"+ s + "' is not a Palindrome");
	    }
	}
}