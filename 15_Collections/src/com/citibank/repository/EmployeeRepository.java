package com.citibank.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private Set<Employee> employeeSet = new HashSet<>();
	
	
	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);
	}
	
	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
	
	public Employee getSingleEmployee(int empId){
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() ==  empId) {
				return employee;		
		}
			
		}
		return null;			
	}
	
	public boolean updateEmployeeSalary(int empId, double newSalary){
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() ==  empId) {
				employee.setSalary(newSalary);
				return true ;		
		}
			
		}
		return false;			
	}	
	
	public boolean delSingleEmployee(int empId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() ==  empId) {
				employeeSet.remove(employee);
				return true;
			}
	}
		return false;
	

	}
}
