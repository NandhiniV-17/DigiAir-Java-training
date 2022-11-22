package com.digiair.training.typesofinheritance;

//single-level inheritance where class EmployeeSalary inherits class EmployeeDetails
public class EmployeeSalary extends EmployeeDetails
{
		double salary = 1234;
		void subclass()
		{
			superclass();
			System.out.println("\nThe Employee salary is "+salary);
		}
		

}
