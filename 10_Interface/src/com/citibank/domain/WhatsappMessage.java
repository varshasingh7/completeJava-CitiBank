package com.citibank.domain;

public class WhatsappMessage implements Message{

	@Override
	public void SendMessage(String toName, String messageText) {
		System.out.println("sending Whatsapp message");
		System.out.println("To :" + toName);
		System.out.println("Message : "+ messageText);
		
	}

}
