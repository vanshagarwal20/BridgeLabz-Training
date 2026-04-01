package encapsulations;

import java.util.*;

//	Interface
	interface Department {
	 void assignDepartment(String deptName);
	 String getDepartmentDetails();
	}
	
//	Abstract class
	abstract class Employee implements Department {
	 private int employeeId;
	 private String name;
	 protected double baseSalary;
	 private String department;
	
	 public Employee(int employeeId, String name, double baseSalary) {
	     this.employeeId = employeeId;
	     this.name = name;
	     this.baseSalary = baseSalary;
	 }
	
//	  Encapsulation
	 public int getEmployeeId() {
	     return employeeId;
	 }
	
	 public String getName() {
	     return name;
	 }
	
//	  Abstract method
	 public abstract double calculateSalary();
	
//	  Concrete method
	 public void displayDetails() {
	     System.out.println("Employee ID : " + employeeId);
	     System.out.println("Name        : " + name);
	     System.out.println("Department  : " + department);
	     System.out.println("Salary      : " + calculateSalary());
	     System.out.println();
	 }
	
//	  Interface methods
	 @Override
	 public void assignDepartment(String deptName) {
	     this.department = deptName;
	 }
	
	 @Override
	 public String getDepartmentDetails() {
	     return department;
	 }
	}
	
//	Full-time employee
	class FullTimeEmployee extends Employee {
	
	 public FullTimeEmployee(int id, String name, double salary) {
	     super(id, name, salary);
	 }
	
	 @Override
	 public double calculateSalary() {
	     return baseSalary;
	 }
	}
	
//	Part-time employee
	class PartTimeEmployee extends Employee {
	 private int hoursWorked;
	 private double hourlyRate;
	
	 public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
	     super(id, name, 0);
	     this.hoursWorked = hoursWorked;
	     this.hourlyRate = hourlyRate;
	 }
	
	 @Override
	 public double calculateSalary() {
	     return hoursWorked * hourlyRate;
	 }
	}
	
//	Main class
	public class EmployeeManagementSystem {
	 public static void main(String[] args) {
	
	     List<Employee> employees = new ArrayList<>();
	
	     Employee e1 = new FullTimeEmployee(101, "Vansh", 50000);
	     Employee e2 = new PartTimeEmployee(102, "Amit", 80, 300);
	
	     e1.assignDepartment("IT");
	     e2.assignDepartment("HR");
	
	     employees.add(e1);
	     employees.add(e2);
	
//	      Polymorphism
	     for (Employee emp : employees) {
	         emp.displayDetails();
	     }
	 }
	}

