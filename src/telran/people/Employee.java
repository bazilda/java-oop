package telran.people;

import telran.points.Point;

public class Employee implements Comparable<Employee> {
 int id;
 String name;
 int birthYear;
 String department;
 int salary;
 
 public Employee (int id, String name, int birthYear, String department, int salary) {
	 this.id = id;
	 this.name = name;
	 this.birthYear = birthYear;
	 this.department = department;
	 this.salary = salary;	 
 }
 
 public int getId() {
		return id;
	}
 public int getBirthYear() {
		return birthYear;
	}
 public String getName() {
	return name;
}
public String getDepartment() {
	return department;
}
public int getSalary() {
		return salary;
	}
@Override
public boolean equals(Object emplObj) {
	Employee employee = (Employee)emplObj;
	return this.id == employee.id ; 
	//&& this.name == employee.name && this.birthYear == employee.birthYear && this.department == employee.department && this.salary == employee.salary;
}

@Override
public int compareTo(Employee employee) {
	return this.id - employee.id;	
}
}
