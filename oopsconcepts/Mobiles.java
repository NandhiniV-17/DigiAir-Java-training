package com.digiair.training.oopsconcepts;

public class Mobiles {
	//class variables
	String color;
	int cameraquality;
	int storagememory;

	//Parameterized constructor
	public Mobiles(String color, int cameraquality, int storagememory)
	{
        this.color = color;
        this.cameraquality = cameraquality;
        this.storagememory = storagememory;
	}
	
	//Nonparameterized constructor
	public Mobiles() 
	{
	System.out.println("I Am a default constructor of Mobile class and I will be invoked always if you crreate a object of type Mobile");
	}
	//Protected method with return type
	protected String message()
	{
	if (isCustomer())
	return "\nHello Customer";
	else
	return "\nNot a Customer. Please subscribe";
	}

	//Private method with return type
	private boolean isCustomer()
	{
	return true;
	}
	
	
}

	