package com.digiair.training.nov3;

public class Factorial {

	public static void main(String[] args) {
		int fact=1, n=8; 
		/* initially assigned fact = 1 since factorial goes till 1
		 * n is the number for which factorial needs to be calculated
		 */
		
		for (int i=1; i<=n; i++)//using for loop for n-1,n-2,n-3 and so on

		{
			fact= fact *i;

		}
		
	System.out.println(" The factorial of the given number "+n+" is "+fact);	

	}

}
