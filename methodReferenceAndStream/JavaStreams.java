package methodReferenceAndStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
int empid;
String name;
String role;
int	salary;

public Employee(int empid, String name, String role, int salary){
this.empid = empid;
this.name = name;
this.role = role;
this.salary = salary;
}
}
class EmpMaxMinSalary implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.salary - o2.salary);
	}
}

public class JavaStreams {
	public static void main(String[] args) 
	{
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1001, "Suhanya", "Manager", 50000));
		emp.add(new Employee(1002, "Monica", "Team Lead", 45000));
		emp.add(new Employee(1003, "Ramesh", "QA Lead", 45000));
		emp.add(new Employee(1004, "Mahesh", "Trainee", 30000));
		emp.add(new Employee(1005, "Aarthi", "Senior Engineer", 35000));
		emp.add(new Employee(1006, "Harish", "Architect", 45000));
		//For Each
		System.out.println ("Below are the Employee list");
		Stream<Employee> emp1 = emp.stream();
		emp1.forEach((Employee)->{
			System.out.println(Employee.empid +" "
							+ Employee.name +" "
							+ Employee.role +" "
							+ Employee.salary);
					});
		
		//Filter
		System.out.println ("\nFiltering the employee with salary equals 45000:");
		emp.stream().filter(Employee -> Employee.salary == 45000)
					.forEach(Employee ->System.out.println(Employee.name));  
		

		//count method
		long count = emp.stream()  
                .filter(Employee -> Employee.salary == 45000)  
                .count();  
		System.out.println("\nTotal no. of employee with salary equals 45000: " + count); 
		
		//Filtering Collection by using Stream
		System.out.println("\n List of Employees whose salary are more than 35,000$");
		List<String> empname = emp.stream()  
                .filter(p -> p.salary > 35000)// filtering data  
                .map(p->p.name)        // fetching name based on the filter  
                .collect(Collectors.toList());// collecting as list
		System.out.println(empname +" ");  
		
		//reduce() Method  
		int totalSalaryOfEmployess = emp.stream()  
                 .map(Employee->Employee.salary)  
                 .reduce(0,(sum,salary)->sum+salary);   // accumulating price  
     System.out.println("\n\nTotal salary amount of all the employees: " + totalSalaryOfEmployess + "$");
     
     //Find Max and Min salary of an employee
     System.out.println("\nMaximum Salary is");
     Optional<Employee> maxsal = emp.stream().max(new EmpMaxMinSalary());
 	maxsal.ifPresent((d)->System.out.println(d.empid+" "+d.name+" "+d.role + " "+ d.salary));
 	
 	System.out.println("\nMinimum Salary is");
    Optional<Employee> minsal = emp.stream().min(new EmpMaxMinSalary());
	minsal.ifPresent((d)->System.out.println(d.empid+" "+d.name+" "+d.role + " "+ d.salary));
	}
}
