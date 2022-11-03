package com.digiair.training.nov3;

public class GcdAndLcm {
	public static void main(String[] args) 
	{
		int a = 60;
		int b = 40;
		int gcd = 0;
		int lcm;
		for (int i=1; i<=a; i++)
			/* using the for loop to find the common factors
			 * Assigned i=1 because 1 is the least factor for any given numbers
			 */
		{
			if (a%i==0&&b%i==0)
			{
				System.out.println("The common factors of "+a+" and "+b+" are "+i);
				gcd = i;
			}
		}
			
		System.out.println("The GCD of "+a+" and "+b+" are "+gcd);
		//LCM
		lcm = (a*b)/gcd;
		System.out.println("The LCM of "+a+" and "+b+" are "+lcm);
		
	}

}
