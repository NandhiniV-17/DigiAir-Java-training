package com.digiair.training.typesofinheritance;

//EmployeeExperience inheriting superclass EmployeeSalary
public class EmployeeExperience extends EmployeeSalary{
	double experience = 2.2;
	void subclass3()
	{

		System.out.println("\nThe Employee " +name+" has "+experience+" in this company");
	}

}
