package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee;
		EmployeeRepository employeeRepository = new EmployeeRepository();
		int employeeId;
		String firstName;
		String lastName;
		double salary;
		String email;
		int choice;
		boolean result;
		String continueChoice;
		do {
		
		System.out.println("menu");
		System.out.println("1. add new employee");
		System.out.println("2. update salary of existing employee");
		System.out.println("3.display single employee details");
		System.out.println("4. display all employee details");
		System.out.println("5. Delete single Employee");
		System.out.println("enter your choice");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("enter the employeeId");
			employeeId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("enter  first name");
			firstName = scanner.next();
			System.out.println("enter  last name");
			lastName = scanner.next();
			System.out.println("enter  email");
			email = scanner.next();
			System.out.println("enter the salary");
			salary = scanner.nextDouble();
			employee = new Employee(employeeId, firstName, lastName, email, salary);
			result = employeeRepository.addNewEmployee(employee);	
			if (result)
				System.out.println("Employee added successfully");
			else
				System.out.println("failed to add new employee!!!");
			break;	
		case 2:
			System.out.println("enter employee id");
			employeeId = scanner.nextInt();
			System.out.println("enter updated salary");
			salary = scanner.nextInt();
		    result = employeeRepository.updateEmployeeSalary(employeeId, salary);
			if (result == true)
				System.out.println("salary updated");
			else
				System.out.println("salary update failed!!");
			break;
		case 3:
			System.out.println("enter employee id");
			employeeId = scanner.nextInt();
			employee = employeeRepository.getSingleEmployee(employeeId);
			System.out.println(employee);		
			break;
	 
		case 4:
			System.out.println("all employees details");
			System.out.println(employeeRepository.getAllEmployees()); 
			for (Employee e : employeeRepository.getAllEmployees()) {
				System.out.println(e);
				
			}
			break;

		case 5:
			System.out.println("enter employee id");
			employeeId = scanner.nextInt();
			result = employeeRepository.delSingleEmployee(employeeId);
			if (result == true)
				System.out.println("employee deleted");
			else
				System.out.println("employee Deletion failed!!");
			break;
			
		default:
			System.out.println("Invalid choice!!!");
			break;
		}
		System.out.println(" do you want to continue");
		continueChoice = scanner.next();
	}while(continueChoice.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
		
	}

}
