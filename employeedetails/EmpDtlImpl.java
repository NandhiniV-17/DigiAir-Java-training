package com.digiair.training.employeedetails;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpDtlImpl {

	
	public static void main(String[] args) {
		
	EmployeeDataEntry EDE1 = new EmployeeDataEntry("Nandhini", 12345, "Project Manager", "QA", 10000);
	EmployeeDataEntry EDE2 = new EmployeeDataEntry("Anu", 12346, "Project Lead", "QA", 10500);
	EmployeeDataEntry EDE3 = new EmployeeDataEntry("Sangeetha",12347, "Director", "QA", 15000);
	EmployeeDataEntry EDE4 = new EmployeeDataEntry("Vijai", 12348, "Delivery Manager", "Development", 12000);
	EmployeeDataEntry EDE5 = new EmployeeDataEntry("Srini", 12349, "Team Member", "Development", 10000);
	EmployeeDataEntry EDE6 = new EmployeeDataEntry("Ramesh", 12350, "Product Owner", "BusinessAnalyst", 11000);
	EmployeeDataEntry EDE7 = new EmployeeDataEntry("Vijai A", 12351, "Team Lead", "BusinessAnalyst", 11500);
	
	EmployeeDataEntry[] all = {EDE1, EDE2, EDE3, EDE4, EDE5, EDE6, EDE7};
	EmployeeDataEntry[] matched = new EmployeeDataEntry[11];
	//System.out.println("Please Enter the Emp First Name for Search : ");

	try (Scanner scan = new Scanner(System.in)) {
		//String name = scan.nextLine();
		int count = 0;
		for (EmployeeDataEntry ede  : all) {
			count ++;
		//if (ede.empname.equals(name))
				//{
					//matched[count] = ede;
					//System.out.println("EmpName : " + ede.empname);
					//System.out.println("EmpId : " + ede.empid);
					System.out.println("EmpDesgination : " + ede.empdesgination);
					//System.out.println("EmpDepartment : " + ede.empdepartment);
					System.out.println("EmpSalary : " + ede.empsalary);
				//}
		}
		System.out.println("Please Enter the Emp Designation Name for Search : ");
		String designation = scan.nextLine();
		for (EmployeeDataEntry ede  : all) {
			if (ede.empdesgination.equals(designation))
			{
				matched[count] = ede;
				System.out.println("EmpName : " + ede.empname);
				System.out.println("EmpId : " + ede.empid);
				System.out.println("EmpDesgination : " + ede.empdesgination);
				System.out.println("EmpDepartment : " + ede.empdepartment);
				System.out.println("EmpSalary : " + ede.empsalary);
			}
				
		}
	}
 }

}
