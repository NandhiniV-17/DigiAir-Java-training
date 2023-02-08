package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	String country;
	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("India");
		ar.add("Srilanka");
		ar.add("USA");
		ar.add("Canada");
		ar.add("Africa");
		ar.add("Singapore");
		ar.add("Malaysia");
		
		//Before sorting
		System.out.println("Array List before sorting:" );
		System.out.println(ar);
		
		//Sorting in ascending order
		Collections.sort(ar);
		System.out.println("\nArray List in Ascending order:" );
		System.out.println(ar);
		
		//Sorting in descending order
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println("\nArray List in Descending order:" );
		System.out.println(ar);

	}

}
