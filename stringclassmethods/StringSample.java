package com.digiair.training.stringclassmethods;

public class StringSample {
	public static void main(String[] args) 
	{
		String s1 = new String("Hello!");
		String s2 = "Hello!";
		String s3 = "HELLO!";
		String s4 = new String("Welcome ");
		String s5 = " Hello World! ";
		String s6 = " My Name is ";
		String s7 = "Nandhini Venkataraman";
		System.out.println("The value in s1 is: "+s1);    
		System.out.println("The value in s2 is: "+s2);    
		System.out.println("The value in s3 is: "+s3); 
		System.out.println("The value in s4 is: "+s4);
		System.out.println("Adding extra string to s4 and output is "+s4+ "to Java Training"); //Value of s4 + the given string will be printed
		
		s4 = s4+ "to Java Training!!"; //Value of s4 will be changed from "welcome" to "welcome to Java Training!!"
		System.out.println("The value of s4 after adding the extra string and reassigning again to s4: "+s4);
		
		// To get particular index value of an array	
		System.out.println("\nThe character present at the 9th index value in the string - "+s4+" - is "+(s4.charAt(9)));
		
		//Substring
		System.out.println("\nThe characters present from the index value 2 untill 6 in the string - "+s4+" - are: "+(s4.substring(2,7))); 
		System.out.println("The characters present starting from the index value 8 in the string - "+s4+" - are: "+(s4.substring(8)));
		
		//To compare two strings lexicographically
		System.out.println("\n"+s1+" and "+s2+" are "+(s1.compareTo(s2)));// returns 0 since s1 and s2 are "Hello!"
		
		//Trim - to remove whitespace from both ends of a string
		System.out.println("\nThe string before trimming:"+s5);
		System.out.println("The string after trimming:"+s5.trim());
		
		//Concat - To join two or more strings.
		System.out.println("Concat output: "+(s1.concat(s6).concat(s7)));
		
		/*contentEquals - searches a string to find out if it contains the exact same sequence of characters 
		 * in the specified string or StringBuffer.
		 */
		System.out.println("Is content "+s1+" and string "+s2+" equal? The result is "+ (s1.contentEquals(s2)));
		System.out.println("Is content "+s1+" and string "+s3+" equal? The result is "+ (s1.contentEquals(s3)));
		
		//Equals = To compare two strings, and returns true if the strings are equal, and false if not
		System.out.println(s1+" equals "+s2+ " ? The result is "+ (s1.equals(s2)));
		System.out.println(s1+" equals "+s3+ " ? The result is "+ (s1.equals(s3)));	
		System.out.println(s1+" equals "+s2+ " ? The result for == method is "+ (s1==s2));
		}
}
