package com.digiair.training.stringclassmethods;

public class StringAssignment {
	public static void main(String[] args) 
	{

	String s11 = "WELCOME";
	String s12 = "Welcome";
	String s13 = "Welcome to Java Training";
	
	StringBuffer sb1=new StringBuffer("Training"); 
	StringBuilder sb2=new StringBuilder("Java");  
	//startsWith() - to check whether a string starts with the specified character(s).
	System.out.println ("Is my string '"+s12+"' starts with me?"+(s12.startsWith("me")));
	System.out.println ("Is my string '"+s12+"' starts with we?"+(s12.startsWith("we")));
	System.out.println ("Is my string '"+s12+"' starts with We?"+(s12.startsWith("We")));
	
	//endsWith() - To check whether a string ends with the specified character(s).
	System.out.println ("\nIs my string '"+s12+"' ends with Me?"+(s12.endsWith("Me")));
	System.out.println ("Is my string '"+s12+"' ends with me?"+(s12.endsWith("me")));
	
	//toUpperCase()- to convert a string to upper case letters
	System.out.println ("\nConverting the '"+s13+"' to uppercase: "+(s13.toUpperCase()));
	
	//toLowerCase()- to convert a string to lower case letters
	System.out.println ("\nConverting the '"+s11+"' to lowercase: "+(s11.toLowerCase()));
	
	//String buffer -> charAt(int index)- returns the character at a given index of string buffer
	System.out.println("\nString Buffer: character at index 2 in the string '"+sb1+"' is '"+(sb1.charAt(2))+"'");
	
	//StringBuilder append()- concatenates the given argument with this String
	System.out.println("\nString Builder: Concatinating the sb1 '"+sb1+"' and sb2 '"+sb2+"': "+(sb2.append(" ").append(sb1)));
	
}
}