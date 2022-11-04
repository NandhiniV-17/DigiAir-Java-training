package com.digiair.training.operators.nov4;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		math (600.5,210.9); // Arithmetic operation using method calling

	}
	static void math(double a, double b)
	{
		System.out.println("The sum of two given numbers "+a+" and "+b+" is "+(a+b));
		System.out.println("\nThe difference between the two numbers "+a+" and "+b+" is "+(a-b));
		System.out.println("\nThe multipication of two given numbers "+a+" and "+b+" is "+(a*b));
		System.out.println("\nThe Quotient of two given numbers "+a+" and "+b+" is "+(a/b));
		System.out.println("\nThe Remainder of two given numbers "+a+" and "+b+" is "+(a%b));
	}
	
}
