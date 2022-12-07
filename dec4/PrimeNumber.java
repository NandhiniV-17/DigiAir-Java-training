package com.digiair.training.assignment.dec4;

import java.util.Scanner;

public class PrimeNumber {
	
	public void primeNum() 
	{
		Scanner s2 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("\nEnter a number to check whether it is a prime number or not:");

	    int n = s2.nextInt();	
		
	    if (n==1 || n==2 || ((n%n == 0) && (n%1 == 0) && (n%2 != 0)))
	    	System.out.println ("The Given number "+n+" is a Prime number");
	    else
	    	System.out.println("The Given number "+n+" is not a Prime number");
	}

}
