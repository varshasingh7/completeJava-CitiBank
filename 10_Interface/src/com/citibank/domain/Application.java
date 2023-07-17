package com.citibank.domain;

public class Application {
	private Message message;
	public Application(Message message) {
		this.message = message;
		
	}
	public void processMessage(String toName, String messageText)
	{
		message.SendMessage(toName, messageText);
	}
}
