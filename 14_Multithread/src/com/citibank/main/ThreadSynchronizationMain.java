package com.citibank.main;

import com.citibank.domain.Receiver;
import com.citibank.threads.Caller;

public class ThreadSynchronizationMain {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		
		Caller prachi = new Caller(receiver, "hi");
		Caller varsha = new Caller(receiver, "hello");
		Caller Payal = new Caller(receiver, "how are you!");
		
		
//		receiver.getCall("hi");
//		receiver.getCall("hello");
//		receiver.getCall("How are you");
	}

}
