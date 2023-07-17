package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		System.out.println("enter account no,name, balance" );
		int accno = scanner.nextInt();
		String name = scanner.next();
		double bal = scanner.nextDouble();
		


		System.out.println("account number =" + account.getAccountNumber());
		System.out.println("name =" + account.getName());
		System.out.println("balance =" + account.getBalance());
			
		System.out.println("enter 2nd account no,name, balance" );
		accno = scanner.nextInt();
		name = scanner.next();
		bal = scanner.nextDouble();
	    Account account2 = new Account();
		account2.setAccountNumber(accno);
		account2.setName(name);
		account2.setBalance(bal);
		
		System.out.println("account number =" + account2.getAccountNumber());
		System.out.println("name =" + account2.getName());
		System.out.println("balance =" + account2.getBalance());
		
	}

}
