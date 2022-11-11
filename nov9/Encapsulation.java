package com.digiair.training.oops_encapsulation.nov9;

class employee{
//Declaring the variables
	private int id;
	private String name;
	private String department;
//getter and setter 	
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}}
public class Encapsulation {
	public static void main(String[] args) {
		employee emp = new employee();
		emp.setId(123);
		emp.setName("Nandhini Venkataraman");
		emp.setDepartment("Testing");
System.out.println("Employee Id is: "+emp.getId()+"\nEmployee name is: "+emp.getName()+"\nEmployee department is: "+emp.getDepartment());
		emp.setId(223);
		emp.setName("xyz");
		emp.setDepartment("Development");
System.out.println("\nEmployee Id is: "+emp.getId()+"\nEmployee name is: "+emp.getName()+"\nEmployee department is: "+emp.getDepartment());
	}}
