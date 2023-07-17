package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int num1;
	private int num2;
	private int result;
	private Scanner scanner;

	
	public void accept() {
		
		try {
		System.out.println("accept() starts");
	    scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		System.out.println("accept() ends");
		}
		catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("something is wrong!!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("accept() end");
			scanner.close();
		}
	}
	
	public int acceptAndCalculate() {
		try {
		System.out.println("accept() starts");	
		scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		System.out.println("accept() ends");
		
		System.out.println("Calculate() start");
		result = num1 + num2 ;
		System.out.println("calculate() ends");
//        return result;
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
//			return 0; -- not needed as finally result overrides it
		}
		finally {
			System.out.println("acceptAndCalculate() end");
			scanner.close();
//			return result;
		}
		return result;
	}
	
	public void display() {
		System.out.println("display() starts");
		System.out.println("result is::" + result);
		System.out.println("display() ends");
		
	}

}
