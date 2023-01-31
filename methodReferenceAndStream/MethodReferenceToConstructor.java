package methodReferenceAndStream;

interface display{  
    Message getMessage(String input);  
}

class Message{  
    Message(String input){  
        System.out.print(input);  
    }  
} 
public class MethodReferenceToConstructor {
	   public static void main(String[] args) {  
		   display data = Message::new;  
	        data.getMessage("Hi!! Welcome to Java Training on Method Reference to a Constructor");  
	    }  
	}  