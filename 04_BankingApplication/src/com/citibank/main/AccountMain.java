package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
	Account account = new Account();
	//account.accountNumber = 101;
	account.setAccountNumber(101);
	account.setName("vivek");
	account.setBalance(1000);
	System.out.println("account number =" + account.getAccountNumber());
	System.out.println("name =" + account.getName());
	System.out.println("balance =" + account.getBalance());
	
	System.out.println();
	
	Account account2 = new Account();
	account2.setAccountNumber(102);
	account2.setName("sagar");
	account2.setBalance(2000);
	
	System.out.println("acccount no2= " + account2.getAccountNumber());
	System.out.println("name= " + account2.getName());
	System.out.println("balance= " + account2.getBalance());
	
	System.out.println("main end");
	}

}
