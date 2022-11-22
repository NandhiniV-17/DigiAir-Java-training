package com.digiair.training.typesofinheritance;

public class MethodOverriding extends EmployeeDetails 
{
	String name = "Anu Shakti Priya";//overriding
	int empid = 125;	
	void subclass2()
	{
		superclass();
		System.out.println("The employee name is "+name+"\nId is "+empid+"\nDesignation is "+designation);
	
	}

}
