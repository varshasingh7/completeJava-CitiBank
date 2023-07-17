package com.citibank.main;

import com.citibank.domain.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		System.out.println("main start");
		new Account();
		
		Account account = new Account(10, "varsha", 1000);
		System.out.println(account.getName());
// call constructor with 2 args and print both values
		Account account2 = new Account(20, "payal");
		System.out.println(account2.getName());
		System.out.println(account2.getAccountNumber());
        System.out.println(account2.getBalance());
		//		Account account; -- only declaration of object so constructors not called
		
//		Account account = new Account();
//		Account account2 = new Account();
//		Account account3 = new Account();
        System.out.println("deposit 2000");
        boolean result = account2.deposit(2000);
        if (result)

        	System.out.println("transaction success");
        else
        	System.out.println("transaction failed");
        System.out.println("balance = " + account2.getBalance());
        
        System.out.println("withdraw 1000");
        result = account2.withdraw(4000);
        if (result)
        	System.out.println("transaction success");
        else 
        	System.out.println("transaction failed");
        System.out.println("balance = " + account2.getBalance());
        
		System.out.println("main end");
	}

}
