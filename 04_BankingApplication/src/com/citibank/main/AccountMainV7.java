package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;
import com.citibank.domain.Savings;
import com.citibank.factory.AccountTypeFactory;

public class AccountMainV7 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		double overdraftBalance;
		String option;
		int choice;
		int accountType;
		boolean isSalary;
		double amount;
		String continueChoice = "";
		Account account = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter account no" );
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter account name" );
		name = scanner.nextLine();
		System.out.println("enter account balance");
		balance = scanner.nextDouble();
		System.out.println("Menu");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("enter your choice: ");
		accountType = scanner.nextInt();
		AccountTypeFactory typeFactory = new AccountTypeFactory();
		
		switch (accountType) {
		case 1:
			System.out.println("do you want to open salary account");
			isSalary = scanner.nextBoolean();
			account = typeFactory.AccountType(accountType, accountNumber, name, balance, isSalary, 0);
			break;
		case 2:
			System.out.println(" enter overdraft balance");
			overdraftBalance = scanner.nextDouble();
			account = typeFactory.AccountType(accountType, accountNumber, name, balance, false, overdraftBalance);
			break;
		default:
			System.out.println("invalid choice");
		}
		
		if( account instanceof Savings) {
		System.out.println("account ");
		System.out.println("account name:" + account.getName());
		System.out.println("account account no:" + account.getAccountNumber());
	    System.out.println("account balance:" + account.getBalance());
	    System.out.println("isSalary " + ((Savings) account).isSalary());
		}else {
			System.out.println("account ");
			System.out.println("account name:" + account.getName());
			System.out.println("account account no:" + account.getAccountNumber());
		    System.out.println("account balance:" + account.getBalance());
		    System.out.println("overdraftBalance " + ((Current) account).getOverdraftBalance());
		}
		
		do {
//			switch 
		    System.out.println("menu");
		    System.out.println("1. Withdraw" );
		    System.out.println("2. deposit" );
		    System.out.println("3. balance" );
		    choice = scanner.nextInt();
		    switch (choice) {
			case 1:
				System.out.println("enter amount to withdraw");
				amount=scanner.nextDouble();
				if(account.withdraw(amount)) {
					System.out.println("withdraw successful!");
	
				}
				else
					System.out.println("withdraw failed!");
				break;
			case 2:
				System.out.println("enter amount to deposit");
				amount=scanner.nextDouble();
				if(account.deposit(amount)) {
					System.out.println("deposit successful!");
					
				}
				
				else
					System.out.println("deposit failed!");			
				
				break;
			case 3:
				System.out.println("display balance:" + account.getBalance());
				if (accountType == 2)
				System.out.println("display overdraft:" + ((Current) account).getOverdraftBalance());
			
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
