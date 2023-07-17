package com.citibank.domain;

public class Application {
	private Employee [] employees;
	
	public Application() {
		// TODO Auto-generated constructor stub
	}
		public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

		public void displayAllEmployee() {
			for (Employee employee : employees) {
				System.out.println(employee);
				
			}
		}
		
	}


