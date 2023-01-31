package methodReferenceAndStream;

@FunctionalInterface 
interface MyInterface{  
    void display();  
} 

public class MethodReference {  
    
	public void method(){  
	System.out.println("Am inside Instance Method");  
    }  

	public static void  staticMethod(){  
		System.out.println("Am inside Static Method"); 
	}
	
	
	public static void main(String[] args) {
		MethodReference obj1 = new MethodReference();   
		// Method reference using the object of the class
		MyInterface ref = obj1::method;  
		// Calling the method of functional interface  
		ref.display();
		
		 // Referring static method 
		MyInterface obj2 = MethodReference::staticMethod;
		// Calling interface method
		obj2.display();
		

	}
}
