package com.digiair.training.oopsconcepts;
//Class is inheriting superclass and interface
public class Iphone extends Mobiles{

	
	public static void display2()
	{
		Mobiles obj2 = new Mobiles("red", 8, 128);

	System.out.println("\nI am inside IPhone Class: \nThe available options in iPhone are are");
	System.out.println("1. "+obj2.color+", "+obj2.cameraquality+"MP and "+obj2.storagememory+"GB ");
	
	}
	public String message()//Method overrding - Overrriding the method "Message" from superclass
	{
	return "I am an overridden method";
	}

}
