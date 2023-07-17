package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Savings;

public class AccountMainV5 {
	public static void main(String[] args) {
//		
//		Savings savings = new Savings(101, "Varsha" , 10000, false);
//		Savings savings2 = new Savings(102, "Megha", 10000, true);
//		boolean result = savings.withdraw(8000);
//		System.out.println("Result = " + result);
//		System.out.println("balance after withdraw =" + savings.getBalance());
//		boolean result2 = savings.deposit(1000);
//		System.out.println("Result2 = " + result2);
//		System.out.println("balance =" + savings.getBalance());
		
		Scanner scanner = new Scanner(System.in);
		int accno;
		String name;
		double balance;
		String option;
		int choice;
		boolean salary;
		double amount;
		String continueChoice = "";
		Savings savings;
		
		System.out.println("enter account no" );
		accno = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter account name" );
		name = scanner.nextLine();
		System.out.println("enter account balance");
		balance = scanner.nextDouble();
		
		System.out.println("do you want to open salary account");
		option = scanner.next();
		if (option.equalsIgnoreCase("yes")) 
			salary = true;
		else
			salary = false;
		
			
		savings = new Savings(accno, name, balance, salary);
		System.out.println("account name:" + savings.getName());
		System.out.println("account account no:" + savings.getAccountNumber());
	    System.out.println("account balance:" + savings.getBalance());
		do {
//		switch 
	    System.out.println("menu");
	    System.out.println("1. Withdraw" );
	    System.out.println("2. deposit" );
	    System.out.println("3. balance" );
	    choice = scanner.nextInt();
	    switch (choice) {
		case 1:
			System.out.println("enter amount to withdraw");
			amount=scanner.nextDouble();
			if(savings.withdraw(amount))
				System.out.println("withdraw successful!");
			else
				System.out.println("withdraw failed!");
			break;
		case 2:
			System.out.println("enter amount to deposit");
			amount=scanner.nextDouble();
			if(savings.deposit(amount))
				System.out.println("deposit successful!");
			else
				System.out.println("deposit failed!");			
			
			break;
		case 3:
			System.out.println("display balance:" + savings.getBalance());
			
			break;
			
		default:
			System.out.println("invalid choice");
			break;
	    }
		System.out.println("if you want to continue");
		continueChoice = scanner.next();
	}while(continueChoice.equalsIgnoreCase("yes"));
	System.out.println("thank you!");
	    }   
}

