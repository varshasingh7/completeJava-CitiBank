package com.citibank.main;

import com.citibank.domain.Application;
import com.citibank.domain.Employee;

public class ApplicationMain {
	public static void main(String[] args) {
		Employee [] employee = new Employee [5];
		employee[0] = new Employee(101,"emp 1",1000);
		employee[1] = new Employee(101,"emp 2",1000);
		employee[2] = new Employee(101,"emp 3",1000);
		employee[3] = new Employee(101,"emp 4",1000);
		employee[4] = new Employee(101,"emp 5",1000);
		
//		Application application = new Application();
//		application.displayAllEmployee();
		
		Application application = new Application();
		application.setEmployees(employee);
		application.displayAllEmployee();
	}

}
