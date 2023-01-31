import java.util.ArrayList;
import java.util.function.Consumer;

interface NoParameter{  
    public void print(); // No Parameter
}
interface SingleParameter{
	public String display (String input);
}

interface MultipleParameter{   
public int add(int a , int b, int c);   
} 
  
	public class LambdaClassPractice{
	  public static void main(String[] args) {
		  
	 ArrayList<String> data = new ArrayList<String>();
	 	data.add("Hi!!");
	 	data.add("Welcome");
	 	data.add("To");
	 	data.add("Java");
	 	data.add("Training");
	    //lambda expression in the ArrayList's forEach() method to print every item in the list:
	 	data.forEach( (n) -> { System.out.print(n + " "); } );
	   System.out.println("");
	    //Java's Consumer interface to store a lambda expression in a variable:
	    Consumer<String> store = (m) -> { System.out.print(m + " "); };
	    data.forEach(store);
	    System.out.println("");
	    
	    //Replace all
	    data.replaceAll(e -> e.toUpperCase());
	    System.out.println("Converting all to uppercase: " + data);
	    
	   //No parameter
	    NoParameter d1 = () -> {System.out.println("Hi!! Welcome");};
	    d1.print();
	    
	    //Single Parameter
	    SingleParameter d2 = (input) -> { return ("Hi!!" + input); };
	    System.out.println(d2.display("Welcome to 2023"));
	    
	    //Multiple Parameter
	    MultipleParameter d3 = (a,b,c) -> (a+b+c);
	    System.out.println("The addition of three numbers " + d3.add(3,4,5));
	    
	   
	  }
	
	}
