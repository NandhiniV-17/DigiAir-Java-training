package com.digiair.training.assignment.dec4;
import java.util.Scanner;

public class ReverseString 
{
	public void reverseStr()
	{
	      
		Scanner s3 = new Scanner(System.in);  
		
		System.out.print("String Reverse:\nEnter the number of String you want to store: ");  
		//reading the number of string from the that we want to enter  
		int num = s3.nextInt();   
		String[] str = new String [num];  
		
		System.out.println("Enter the String of the array: ");  
		for(int i=0; i<num ; i++)  
		{    
		str[i]=s3.nextLine();  
		}  
		
		System.out.print ("The given strings for reversing are: ");
		  
		  for( int j=0; j<str.length; j++)
		  {
			  System.out.print (str[j]+" ");
			  
		  }
		  System.out.print ("\nThe reversed strings are: ");
		  for(int i=str.length-1;i>=0;i--)
		  {
			  System.out.print(str[i] + "  ");
		  }
		}
}
