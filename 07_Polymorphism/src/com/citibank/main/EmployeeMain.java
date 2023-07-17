package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = new Employee(101,"Varsha",1000);
		
		Employee employee2 = new Employee(102,"Vivek",2000);
		System.out.println(employee.toString());
		System.out.println(" hashcode of employee 1 =" + employee.hashCode());
		
		System.out.println(employee2.toString());
		System.out.println(" hashcode of employee 2 =" + employee2.hashCode());
		
//		Employee e = null;
//		System.out.println(e);
		
		Employee e = new Employee(2,"varsha",100);
		System.out.println(e);
		System.out.println(e.hashCode());
		
		Employee e2;
		e2 = e;
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		String s = "Hi";
		String s2 = "Hi";
		System.out.println(s.equals(s2)); //compares only the string
		
		Employee e4 = new Employee(101,"X", 100);
		Employee e5 = new Employee(101,"X",100);
		System.out.println(e4.equals(e5));
		
		
		}

}
