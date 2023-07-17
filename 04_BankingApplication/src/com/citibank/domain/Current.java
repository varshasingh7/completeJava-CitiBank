package com.citibank.domain;

public class Current extends Account {
	double overdraftBalance;
	double limit;
	double calculation;
	public Current() {
		System.out.println("this is current default constructor");
	}
	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		limit = overdraftBalance;
	}
	public double getOverdraftBalance() {
		return overdraftBalance;
	}
	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return true;
			
		}
		
		if(amount >= getBalance() && overdraftBalance + getBalance() >= amount) {
			calculation = amount - getBalance();
			overdraftBalance -= calculation;
			setBalance(0);
			return true;
		}
		}
		return false;
	

}
	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
		if(limit > overdraftBalance) {
			if(amount < (limit - overdraftBalance)) {
			overdraftBalance = overdraftBalance + amount;
			return true;
		}
		else {
			amount = amount - (limit - overdraftBalance);
			overdraftBalance = limit;
			setBalance(getBalance()+ amount);
			return true;
			
		}}else {
			setBalance(getBalance() + amount);
			return true;
			
		}
		}else
			return false;
				
	}
	
}
