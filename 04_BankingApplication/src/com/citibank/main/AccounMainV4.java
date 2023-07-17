package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccounMainV4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Account account;
	int accno;
	String name;
	int choice;
	double amount;
	String continueChoice = "";
	
	System.out.println("enter account no" );
	accno = scanner.nextInt();
	scanner.nextLine();
	System.out.println("enter account name" );
	name = scanner.nextLine();
	
	account = new Account(accno, name);
	System.out.println("account name:" + account.getName());
	System.out.println("account account no:" + account.getAccountNumber());
    System.out.println("account balance:" + account.getBalance());
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
		if(account.withdraw(amount))
			System.out.println("withdraw successful!");
		else
			System.out.println("withdraw failed!");
		break;
	case 2:
		System.out.println("enter amount to deposit");
		amount=scanner.nextDouble();
		if(account.deposit(amount))
			System.out.println("deposit successful!");
		else
			System.out.println("deposit failed!");			
		
		break;
	case 3:
		System.out.println("display balance:" + account.getBalance());
		
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

