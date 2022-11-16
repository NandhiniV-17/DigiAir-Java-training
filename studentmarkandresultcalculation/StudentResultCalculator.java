package com.digiair.training.studentmarkandresultcalculation;

public class StudentResultCalculator 
{
	static double totalmark = 0.0;
	static double averagemark = 0.0;
	static double percentage = 0.0;
	
	public static void calculateStudentMarks (
			String name,
			double maths,
			double science,
			double social,
			double english,
			double language)
	{
	 totalmark = maths+science+social+english+language;
	 System.out.println("Total mark obtained: "+totalmark);
	 averagemark = totalmark/5;
	 System.out.println("The average mark obtained is "+averagemark);
	 percentage= (totalmark/ProjectConstants.totalMarksAllSubjects)*100;
	 System.out.println("Total percentage obtained: "+percentage+"%");
	 if (maths<ProjectConstants.passThresholds ||
			 science<ProjectConstants.passThresholds ||
			 social<ProjectConstants.passThresholds ||
			 english<ProjectConstants.passThresholds ||
			 language<ProjectConstants.passThresholds)
		 System.out.println(name+" has FAILED");
	 
	 else
	 {
		 double percentage1 = percentage/10.0;
		 int grade = (int) percentage1; 
		 //round to whole number since switch expression can't be float, double or boolean
		 switch(grade)
		 {
		 	case 10:
		 		System.out.println("Congratulations!! Passed with Distinction");
		 		break;
		 	case 9:
		 		System.out.println("Congratulations!! Passed with Distinction");
		 		break;
		 	case 8:
		 		System.out.println("Congratulations!! Passed with Distinction");
		 		break;
		 	case 7:
		 		System.out.println("Congratulations!! Passed with Distinction");
		 		break;
		 	case 6:
		 		System.out.println("Congratulations!! Passed with First class");
		 		break;	
		 	case 5:
		 		System.out.println("Passed with Second class");
		 		break;
		 }	
	 }
	} 
 
}
