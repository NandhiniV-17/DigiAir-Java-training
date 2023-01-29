package arrayListDemoPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	public void arrayListDisplay(){
		//Adding ArrayList1
		list1.add("Chennai");
		list1.add("Trichy");
		list1.add("Coimbatore");
		list1.add("Madurai");
		list1.add("salem");
		System.out.println("The cities in TamilNadu are:");
		Iterator i=list1.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());  
		} 		
		//Adding ArrayList2
		list2.add("Bangalore");
		list2.add("Mysore");
		list2.add("Mangalore");
		list2.add("Vijayapura");
		list2.add("Udupi");
		System.out.println("\nThe cities in Karnataka are:");
		for(String s:list2){
		    System.out.println(s + " "); 
		}
	}
	public void arrayListAdd(){
		list1.add(0, "Vellore");
		System.out.println("\nThe new list of cities in TamilNadu after adding Vellore to index 0 are:");
		System.out.println(list1);
		list1.addAll(list2);
		System.out.println("Combining cities in TamilNadu and Karnataka are:");
		System.out.println(list1);
	}
	public void arrayListContains(){
		String s ="Chennai";
		boolean answer = list1.contains(s);  
        if (answer)
            System.out.println("\nThe list contains " + s);
        else
            System.out.println("The list does not contains " + s);
        
        boolean answers =list1.containsAll(list2);
        if (answer)
            System.out.println("The list1 contains " + list2);
        else
            System.out.println("The list1 does not contains " + list2);
	}
	public void arrayListRemove(){
		list1.remove(1);
		System.out.println("\nThe new list of cities after removing the value in index 1 are:");
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println("The new list of cities in Tamilnadu after removing the cities of Karnataka are:");
		System.out.println(list1);
		String s2 = "Trichy";
		list1.remove(s2);
		System.out.println("The new list of cities in Tamilnadu after removing " + s2 +
					" are: "+ list1);
		list1.removeIf(n -> (n.charAt(0) == 's'));
		System.out.println("The new list of TamilNadu cities after removing the city that starts"
				+ " with the letter s are: " + list1);	
		
	}
	
	
}
