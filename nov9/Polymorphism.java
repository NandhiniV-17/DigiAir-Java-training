package com.digiair.training.oops_polymorphism.nov9;


class Details {
	  public void personaldetail()
	  {
		 System.out.println("The details are as follows"); 
	  }
}
	  
class Studentss extends Details{
	public void personaldetail()
	  {
		 System.out.println("Student name: Name1"); 
		 System.out.println("Student ID: 123");
		 System.out.println("Student emailid: Name1@example.com"); 
		 
	  }
}
class Employee extends Details{
	public void personaldetail()
	  {
		 System.out.println("\nEmployee name: Employee1"); 
		 System.out.println("Student ID: 223");
		 System.out.println("Student emailid: employee1@example.com");
		 
	  }
}
class Polymorphism {
	public static void main(String[] args) {
		
		Details d= new Details();
		d.personaldetail();
		Studentss st= new Studentss();
		st.personaldetail();
		Employee e= new Employee();
		e.personaldetail();
	
}

}
