package com.digiair.training.oops_abstraction_and_inhertitance.nov9;
//Abstract Class
abstract class Employee{
	//Abstract Methods- don't have a body
	public abstract void personaldetails();
	public abstract void officedetails();
	//Normal method-  has body
	public void Country(){
		System.out.println ("\nThe current location is Canada");
	}}
	//Subclass - inheritance	
class Emp extends Employee{
	//Providing the body for the above abstract method
	public void personaldetails(){
		System.out.println ("Employee name is Nandhini");
		System.out.println ("Employee DOB is 12/34/5678");
		System.out.println ("Address is 12, ABC Street, City, State 00001");
	}
	public void officedetails(){
		System.out.println("\nEmployee ID is 12345678") ;
		System.out.println("Department is Testing");
		System.out.println("Salary is 1234");
	}}
public class AbstractionInheritance {
	public static void main(String[] args) {
		//Creating object
		Emp e= new Emp();
		e.personaldetails();
		e.officedetails();
		e.Country();
	}}
