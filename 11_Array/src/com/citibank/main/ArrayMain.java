package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;

public class ArrayMain {
	public static void main(String[] args) {
//		System.out.println("enter array size");
//		int size = new Scanner(System.in).nextInt();
//
//		int [] numbers =new int[size];
//		numbers[0] = 10;
//		numbers[1] = 10;
//		numbers[2] = 10;
//		numbers[3] = 10;
//		numbers[4] = 10;
//		
//		for (int i : numbers) {
////		for (i=1; i<= size; i++)
//			System.out.println(i);
//			
//		}
	Employee [] employees = new Employee[5];
	employees[0] = new Employee(101, "emp 1", 1000);
	employees[1] = new Employee(102, "emp 2", 1000);
	employees[2] = new Employee(103, "emp 3", 1000);
	employees[3] = new Employee(104, "emp 4", 1000);
	employees[4] = new Employee(105, "emp 5", 1000);
	
	for (Employee employee : employees) {
		System.out.println(employee);
		
	}
	}
}


