package com.citibank.factory;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.Current;
import com.citibank.domain.Savings;

public class AccountTypeFactory
{	
	public Account AccountType(int accountType, int accountNumber, String name, double balance, boolean isSalary, double overdraftBalance) {
		
		switch (accountType) {
		case 1:			
			return new Savings(accountNumber, name, overdraftBalance, isSalary);
		case 2:
			return new Current(accountNumber, name, balance, overdraftBalance);

		default:
			return null;

		}
		
	}

}
