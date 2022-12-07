package com.digiair.training.assignment.dec4;
import java.util.Scanner;
public class FibonacciSeries 
{
	public void fiboseries()
	{
	Scanner f = new Scanner(System.in);
	System.out.println("Enter the number upto which the Fibonacci series has to be calculated");
	int max = f.nextInt();
	System.out.println("Enter the first number");
	int n1 = f.nextInt();
	System.out.println("Enter the second number");
	int n2 = f.nextInt();
	int temp = 0;
	int n3;
	// Iterate till counter is N
	while (temp < max) {
		System.out.print(n1 + " ");// printing the number
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		temp++;
	}
}
	
	
}
