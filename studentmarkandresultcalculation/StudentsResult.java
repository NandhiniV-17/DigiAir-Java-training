package com.digiair.training.studentmarkandresultcalculation;

import java.util.Scanner;

public class StudentsResult 
{
	public static void main(String[] args) 
	{
		
		String stopDataEntry = "no";
		while ("no".equals(stopDataEntry))
		{
			DataEntry.getStudentMarks();
			StudentResultCalculator.calculateStudentMarks(
					DataEntry.name,
					DataEntry.maths, 
					DataEntry.science, 
					DataEntry.social,
					DataEntry.english, 
					DataEntry.language);
			
			
			System.out.println ("Do you want to stop entering the details :");
			DataEntry.a = new Scanner(System.in);
			stopDataEntry = DataEntry.a.nextLine();
		}
		
		
		
			 
		 
	}
}