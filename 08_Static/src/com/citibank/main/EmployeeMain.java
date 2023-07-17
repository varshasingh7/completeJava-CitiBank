package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
	static int x= 10;
	public static void main(String[] args) {
		System.out.println(x);
		Employee employee = new Employee( "varsha", 1000);
		Employee employee1 = new Employee("payal", 2000);
		Employee employee2 = new Employee("prachi", 3000);
		Employee employee3 = new Employee("rupesh", 4000);
		Employee employee4 = new Employee("rohit", 5000);
		
		
		
		
		System.out.println(employee);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		
		
		
	}

}
