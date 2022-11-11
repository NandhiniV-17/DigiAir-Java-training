package com.digiair.training.conditionalloop.nov10;

public class If_Else_If 
{
	public static void main(String[] args) {
	double i= -20;
	
	if (i%2==0 && i<0) 
	{
		System.out.println (" The given number "+i+" is a negative even number");
	}
	
	else if (i%2==0 && i>0)
	{
		System.out.println("The given number "+i+" is a positive even number");
	}
	
	else if (i%2!=0 && i<0)
	{
		System.out.println("The given number "+i+" is a negative odd number");
	}
	else if (i%2!=0 && i>0)
	{
		System.out.println("The given number "+i+" is a positive odd number");
	}
	else
	{
		System.out.println("The given number is 0");
		
	}
}
}