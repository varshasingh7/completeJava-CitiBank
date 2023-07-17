package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {
	public static void main(String[] args) {
//		try {
//			Employee employee = new Employee(101, "varsha", -10000);
//			System.out.println(employee);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}	
//		System.out.println("------------------");
//		Employee employee2 = new Employee();
//		try {
//			employee2.setSalary(-10000);
//		} catch (InvalidEmployeeSalaryException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		Employee employee = new Employee(101, "varsha", -110000);
	}

}
