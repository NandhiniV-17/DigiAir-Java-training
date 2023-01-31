package methodReferenceAndStream;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println ("\nTotal no. of employee with salary equals 45000:");
		long count = emp.stream()  
                .filter(Employee -> Employee.salary == 45000)  
                .count();  
		System.out.println(count);  
	}

}
