package com.digiair.training.oopsconcepts;
import java.util.Scanner; 
//Class is inheriting superclass and interface
public class Samsung extends Mobiles implements ExtraInformation{

	
	public static void display()//declaring a method
	{
		
		Mobiles obj1 = new Mobiles("red", 8, 128);//object instantiation
	System.out.println(obj1.message());//Calling the superclass method
	System.out.println("\nI am inside Samsung class: \nThe available options in Samsung are");
	System.out.println("1. "+obj1.color+", "+obj1.cameraquality+"MP and "+obj1.storagememory+"GB ");
	
	}
	
	public void wiFi()//interface method implementation
	{
		System.out.println("Samsung has 5G");
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter MobileType: ");
			String mType = myObj.nextLine();
			wiFi(mType);
		}
	}
	public void wiFi(String mobileType)//interface method implementation- overloading
	{
		System.out.println("Samsung has 5G\n Samsung "+mobileType+ " has good WiFi band");
	}

}
