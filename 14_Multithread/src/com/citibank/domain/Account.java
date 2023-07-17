package com.citibank.domain;

public class Account {
	private double balance = 10000;
	     public synchronized void Withdraw(double amount) {
	    	 System.out.println("before withdraw =" +balance);
	    	 if(amount > balance) {
	    		 try {
	    			 System.out.println("less balance , waiting for deposit");
	    			 wait();
	    		 }catch(InterruptedException e) {
	    			 e.printStackTrace();
	    		 }
	 			balance = balance - amount;
	 		}
	    	 System.out.println("after withdraw =" +balance);
	 	}
	    public synchronized void Deposit(double amount) {
	    	System.out.println("before withdraw =" +balance);    	
			balance += amount;		
	    	System.out.println("after balance =" +balance);
	    	notify();
	    }
	

}
