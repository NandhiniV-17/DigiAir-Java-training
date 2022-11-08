package com.digiair.training.accessmodifiers.nov5;


public class PrivateAccessModifier
{
	private String firstname = "Nandhini";
	private String lastname = "Venkataraman";
	private String country = "India";
	private String company = "DigiAir";
	private String role = "Tester";

public static void main(String[] args) 
{
	PrivateAccessModifier Obj2 = new PrivateAccessModifier(); 
    System.out.println("Name: " + Obj2.firstname + " " + Obj2.lastname);
    System.out.println("Country: " + Obj2.country);
    System.out.println("Company: " + Obj2.company);
    System.out.println("Role: " + Obj2.role);   
}
}