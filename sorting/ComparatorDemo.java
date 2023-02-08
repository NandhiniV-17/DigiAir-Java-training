package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmpNameComparator implements Comparator<ComparatorDemo>{
@Override
public int compare(sorting.ComparatorDemo o1, sorting.ComparatorDemo o2) {
	return o1.empname.compareTo(o2.empname);
}
}	
class EmpIdComparator implements Comparator<ComparatorDemo>{
@Override
public int compare(sorting.ComparatorDemo o1, sorting.ComparatorDemo o2) {
	return o1.empid - o2.empid;
}
}
public class ComparatorDemo {
	String empname;
	int empid;
	ComparatorDemo(int empid, String empname)
	{
	  this.empid = empid;	
	  this.empname = empname;
	}
	void getDetails(){
		System.out.println(this.empid+" "+this.empname);
	}
	public static void iterateData(ArrayList<ComparatorDemo> arrlist){
		arrlist.forEach((d)-> d.getDetails());
	}
	public static void main(String[] args) {
		ComparatorDemo emp1 = new ComparatorDemo(111, "Ryan");
		ComparatorDemo emp2 = new ComparatorDemo(124, "Lara");
		ComparatorDemo emp3= new ComparatorDemo(116, "Tim");
		ComparatorDemo emp4= new ComparatorDemo(187, "Clifton");
		ArrayList<ComparatorDemo> empdetails = new ArrayList<ComparatorDemo>();
		empdetails.add(emp1);
		empdetails.add(emp2);
		empdetails.add(emp3);
		empdetails.add(emp4);
		System.out.println("Before sorting");
		iterateData(empdetails);
		System.out.println("\nsorting the Employee Id in ascending order");
		empdetails.sort(new EmpIdComparator());
        iterateData(empdetails);  
        System.out.println("\nsorting the name in ascending order");
        empdetails.sort(new EmpNameComparator());
        iterateData(empdetails);
	}
}
