package com.citibank.domain;



//public class Employee implements Comparable<Employee> {
public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

//	public Employee(int employeeId, String name, double salary) throws InvalidEmployeeSalaryException {
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;	
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) throws InvalidEmployeeSalaryException  {
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}

	
//	public int compareTo(Employee e) {
////		int diff = employeeId - e.getEmployeeId();  //ascending order
////		int diff = e.getEmployeeId() - employeeId; //descending order
////		int diff = name.compareTo(e.getName());    //ascending order of String name
//		int diff = e.getName().compareTo(name);    //descending order
//		return diff;
//	}
	
	
	
	

}
