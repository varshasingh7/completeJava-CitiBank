package com.citibank.domain;

public class SmsMessage implements Message{

	@Override
	public void SendMessage(String toName, String messageText) {
		System.out.println("sending sms message");
		System.out.println("To :" + toName);
		System.out.println("Message : "+ messageText);
		
	}
	

}
