package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Application;
import com.citibank.domain.EmailMessage;
import com.citibank.domain.Message;
import com.citibank.domain.SmsMessage;
import com.citibank.domain.WhatsappMessage;

public class ApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String toName;
		String messageText;
		int choice;
		Message message = null;
		
		System.out.println("Menu :");
		System.out.println("1. SMS");
		System.out.println("2. Email");
		System.out.println("3. Whatsapp");
		System.out.println("enter your choice:");
		choice = scanner.nextInt();

		
		
		switch(choice) {
		case 1: 
			message = new SmsMessage();
			break;
		case 2:
			message = new EmailMessage();
			break;
		case 3:
			message = new WhatsappMessage();
			break;
		default:
			System.out.println("Invalid choice");
			System.out.println("existing");
			System.exit(0);
			break;
		}
		
		System.out.println("Enter To :");
		toName = scanner.next();
//		System.out.println();
		scanner.nextLine();
		System.out.println("Enter Message Text");
		messageText = scanner.nextLine();
		
		if (message != null) {
		
		Application application = new Application(message);
		application.processMessage(toName, messageText);
		}
		

	}


}
