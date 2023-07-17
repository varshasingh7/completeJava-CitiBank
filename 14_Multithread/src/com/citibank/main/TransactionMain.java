package com.citibank.main;

import com.citibank.domain.Account;
import com.citibank.threads.DepositThread;
import com.citibank.threads.WithdrawThread;

public class TransactionMain {
	public static void main(String[] args) {
		Account account = new Account();
		WithdrawThread withdrawThread = new WithdrawThread(account, 15000);
		DepositThread depositThread = new DepositThread(account, 3000);
	}


}
