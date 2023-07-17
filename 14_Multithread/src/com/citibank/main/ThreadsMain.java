package com.citibank.main;

import com.citibank.threads.ThreadOne;
import com.citibank.threads.ThreadTwo;

public class ThreadsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
//		threadOne.run();
		ThreadTwo threadTwo = new ThreadTwo();
		Thread t2 = new Thread(threadTwo);
		t2.start();
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main" + i);
			
		}
		System.out.println("main end");
	}

}
