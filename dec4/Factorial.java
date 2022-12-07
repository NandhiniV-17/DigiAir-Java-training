package com.digiair.training.assignment.dec4;
import java.util.Scanner;

public class Factorial 
{
	public void fact()
	{
		Scanner s4 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\nEnter a number to find the Factorial");

		int m = s4.nextInt();
		int fact = 1;
		// factorial of n = 1*2*...*n
		for (int i = 1 ; i <= m; i++)
		{
			fact = fact * i; 
		}
		System.out.println("The factorial for "+m+" is "+fact);
}
}