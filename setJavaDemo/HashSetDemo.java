package setJavaDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();   
		str.add("India");
		str.add("Canada");
		str.add("USA");
		str.add("SriLanka");
		str.add("Malaysia");
		
		
		HashSet<String> str2 = new HashSet<String>();  
		str2.add("Denmark");
		str2.add("Japan");
		str2.add("Ireland");
		str2.add("Netherland");
		str2.add("Malaysia");	
		System.out.print("List of Country in Set1 "+str + " ");
		System.out.print("\nList of Country in Set2 "+str2 + " ");
		
		HashSet<String> str3 = new HashSet<String>();  
		str3.add("Singapore");
		
		
		//addall()
		str.addAll(str2);
		System.out.print("\nAdding set2 to set1 "+str + " ");
		
		//clear()
		str2.clear();
		System.out.println("\nList of Country in Set2 after clearing the data: "+str2 + " ");
		
		//Contains()
		System.out.println("\nDoes the set contains Malaysia? " + str.contains("Malaysia"));
		
		//Containsall()
		System.out.println("\nDoes the set1 contains set3? " + str.containsAll(str3));
		
		//isempty()
		System.out.println("\nIs set2 empty? "+str2.isEmpty());
		Iterator value = str.iterator();
        System.out.println("\nThe iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
	}
}
