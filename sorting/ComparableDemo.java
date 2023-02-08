package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class ComparableDemo implements Comparable<ComparableDemo> {

	String empname;
	int empid;
	
	ComparableDemo(int empid, String empname)
	{
	  this.empid = empid;	
	  this.empname = empname;
	}
	
	void getDetails()
	{
		System.out.println(this.empid+" "+this.empname);
	}
	@Override
	public int compareTo(ComparableDemo o) {
		//return this.empname.compareTo(o.empname);// For sorting name
		return this.empid - o.empid; //For sorting emplyee id
	}
	public static void iterateData(ArrayList<ComparableDemo> arrlist)
	{
		arrlist.forEach((d)-> d.getDetails());
	}
	public static void main(String[] args) {
		ComparableDemo emp1 = new ComparableDemo(111, "Ryan");
		ComparableDemo emp2 = new ComparableDemo(124, "Lara");
		ComparableDemo emp3= new ComparableDemo(116, "Tim");
		ComparableDemo emp4= new ComparableDemo(187, "Clifton");
		
		ArrayList<ComparableDemo> empdetails = new ArrayList<ComparableDemo>();
		empdetails.add(emp1);
		empdetails.add(emp2);
		empdetails.add(emp3);
		empdetails.add(emp4);
		System.out.println("Before sorting");
		iterateData(empdetails);
		
		Collections.sort(empdetails);
		System.out.println("\nAfter sorting the names");
		iterateData(empdetails);
		
		Collections.sort(empdetails, Collections.reverseOrder());
		System.out.println("\nAfter sorting the names in Descending order");
		iterateData(empdetails);
		
	
	}

	
}
