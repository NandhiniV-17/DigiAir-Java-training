package com.digiair.training.studentmarkandresultcalculation;

import java.util.Scanner;

public class DataEntry 
{
	static String name;
	static double maths;
	static double science;
	static double social;
	static double english;
	static double language;
	static Scanner a = new Scanner(System.in);
public static void getStudentMarks()
{
	
		try 
		{
			System.out.println("Enter the Student name");
			name = a.nextLine();
			System.out.println("Enter the Maths mark");
			maths = a.nextDouble();
			System.out.println("Enter the Science mark");
			science = a.nextDouble();
			System.out.println("Enter the Social mark");
			social = a.nextDouble();
			System.out.println("Enter the English mark");
			english = a.nextDouble();
			System.out.println("Enter the Language mark");
			language = a.nextDouble();
		}
		finally 
		 {
			 // To Close the Scanner
		 }
	}
}