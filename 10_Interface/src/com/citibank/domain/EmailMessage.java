package com.citibank.domain;

public class EmailMessage implements Message{

	@Override
	public void SendMessage(String toName, String messageText) {
		System.out.println("sending email message");
		System.out.println("To :" + toName);
		System.out.println("Message : "+ messageText);
		
	}

}
