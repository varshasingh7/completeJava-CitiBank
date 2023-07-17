package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Current;
import com.citibank.domain.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		double overdraftBalance;
		Current current;
		int choice;
		boolean salary;
		double amount;
		String continueChoice = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter account no" );
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter account name" );
		name = scanner.nextLine();
		System.out.println("enter account balance");
		balance = scanner.nextDouble();
		System.out.println("enter overdraft balance");
		overdraftBalance = scanner.nextDouble();
		
		
	current = new Current(accountNumber, name, balance, overdraftBalance);
	System.out.println("account name:" + current.getName());
	System.out.println("account account no:" + current.getAccountNumber());
    System.out.println("account balance:" + current.getBalance());
    
	do {
//	switch 
    System.out.println("menu");
    System.out.println("1. Withdraw" );
    System.out.println("2. deposit" );
    System.out.println("3. balance" );
    choice = scanner.nextInt();
    switch (choice) {
	case 1:
		System.out.println("enter amount to withdraw");
		amount=scanner.nextDouble();
		if(current.withdraw(amount)) {
			System.out.println("withdraw successful!");
		    System.out.println("balance =" + current.getBalance());
		    System.out.println("overdraft balance = " + current.getOverdraftBalance());
		}
		else
			System.out.println("withdraw failed!");
		break;
	case 2:
		System.out.println("enter amount to deposit");
		amount=scanner.nextDouble();
		if(current.deposit(amount)) {
			System.out.println("deposit successful!");
			System.out.println("balance =" + current.getBalance());
		    System.out.println("overdraft balance = " + current.getOverdraftBalance());
		}
		
		else
			System.out.println("deposit failed!");			
		
		break;
	case 3:
		System.out.println("display balance:" + current.getBalance());
		System.out.println("display overdraft:" + current.getOverdraftBalance());
		
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


	

