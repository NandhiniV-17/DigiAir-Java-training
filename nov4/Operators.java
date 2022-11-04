package com.digiair.training.operators.nov4;

public class Operators 
{
	static int a = 10;
	static int b = 9;
	static int c=5;
	public static void main(String[] args) 
	{
		unaryincrement();
		unarydecrement();
		arithmetic();
		logicaloperator();	
		ternaryoperator();
		relational();
		
	}
	static void unaryincrement()
	{
		System.out.println("Unary increment operator");
		System.out.println("The value of a, b and c are "+a+", "+b+" and "+c);
		System.out.println("Adding a and b and post incrementing b: "+ (a+(b++)));
		System.out.println("While adding value of b is same and after that the value will increase. So the new b value is: "+b);
		System.out.println("Pre incrementing a and adding it with c: "+ ((++a)+(c)));
	}
	
	static void unarydecrement()
	{
		System.out.println("\nUnary decrement operator");
		System.out.println("The value of a, b and c are "+a+", "+b+" and "+c);
		System.out.println("Adding a and b and post decrementing b: "+ (a+(b--)));
		System.out.println("While adding value of b is same and after that the value will decrease. So the new b value is: "+b);
		System.out.println("Pre decrementing a and adding it with c: "+ ((--a)+(c)));
	}
	
	static void arithmetic()
	{
		System.out.println("\nArithmentic operator");
		System.out.println("The sum of two given numbers "+a+" and "+b+" is "+(a+b));
		System.out.println("The difference between the two numbers "+a+" and "+b+" is "+(a-b));
		System.out.println("The multipication of two given numbers "+a+" and "+b+" is "+(a*b));
		System.out.println("The Quotient of two given numbers "+a+" and "+b+" is "+(a/b));
		System.out.println("The Remainder of two given numbers "+a+" and "+b+" is "+(a%b));
	}
	static void logicaloperator()
	{
		System.out.println("\nLogical operator");
		System.out.println("The value of a is "+a);
		System.out.println("Checking whether the value is greater than 4 and less than 9. The result is :"+ (a > 4 && a < 9));
		System.out.println("Checking whether the value is either greater than 4 or less than 9. The result is :"+ (a > 4 || a < 9));
		System.out.println("Checking for revese scenario for the first point. The result is :"+ (!(a > 4 && a < 9)));
	}
	static void ternaryoperator()
	{
		System.out.println("\nTernary operator");
		System.out.println("The value of a and b are "+a+" and "+b);
		String output= (a<b)?" a is less than b":" a is greater than b";
		System.out.println("Ternary operator output is"+output);
	}	
	static void relational()
	{
		System.out.println("\nRelational operator");
		System.out.println("The value of a and b are "+a+" and "+b);
		System.out.println("Are the two numbers equal: "+ (a == b));
		System.out.println("Are the two numbers not equal: "+ (a != b));
		System.out.println("Is a greater than b: "+ (a>b));
		System.out.println("Is a smaller than b: "+ (a<b));
		System.out.println("Is a greater than or equal b: "+ (a>=b));
		System.out.println("Is a smaller than or equal b: "+ (a<=b));
		
	}
		
}