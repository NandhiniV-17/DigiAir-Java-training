package com.digiair.training.accessmodifiers.nov5;

public class SecondaryClass
{
		  public static void main(String[] args)
		  {
			  //Default variables inside same package but different classes
			 /* DefaultAccessModifier obj3 = new DefaultAccessModifier();
			  System.out.println ("x+y = "+obj3.z);*/
			  
			/*MainPublicClass Obj1 = new MainPublicClass(); //public variables inside same package but different classes
		    System.out.println("Name: " + Obj1.firstname + " " + Obj1.lastname);
		    System.out.println("Country: " + Obj1.country);
		    System.out.println("Company: " + Obj1.company);
		    System.out.println("Role: " + Obj1.role);  */ 
		   
		    //private variables inside same package but different classes
		   /*PrivateAccessModifier Obj2 = new PrivateAccessModifier(); 
		    System.out.println("Name: " + Obj2.firstname + " " + Obj2.lastname);
		    System.out.println("Country: " + Obj2.country);
		    System.out.println("Company: " + Obj2.company);
		    System.out.println("Role: " + Obj2.role);  */
			  
			 //Procted access modifier outside the class 
			  ProtectedAccessModifier obj5= new ProtectedAccessModifier();
			  System.out.println("Addition "+obj5.x3);
			  System.out.println("Subtraction "+obj5.x4);
			  System.out.println("Multiplication "+obj5.x5);
		    
		  
		  }


}
