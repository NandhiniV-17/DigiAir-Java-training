package com.digiair.training.nov3;

public class MaxAndMin {
	public static void main(String[] args)
	{
	int[] a = {10, 8, 12, 11, 1};
	int min = a[0];//declaring min and assigning 0th value of the array to it
	int max = a[0]; //declaring max and assigning 0th value of the array to it

	
	for (int i = 0; i < a.length; i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
			
		else if ( a[i] > max)
		{
			max = a[i];
		}
	}
	System.out.println("The minimum valus is "+min+" and the maximum value is "+max);
	}
}
