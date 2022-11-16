package com.digiair.training.employeedetails;

public class EmployeeDataEntry 
{
	//Declaring Variables
	String empname;
	int empid;
	String empdesgination;
	String empdepartment;
	double empsalary;
	
	
	//Creating Constructor
	public EmployeeDataEntry(
	String empname,
	int empid,
	String empdesgination,
	String empdepartment,
	double empsalary)
	{
		this.empname = empname;
		this.empid = empid;
		this.empdesgination = empdesgination;
		this.empdepartment = empdepartment;
		this.empsalary = empsalary;
	}

}
