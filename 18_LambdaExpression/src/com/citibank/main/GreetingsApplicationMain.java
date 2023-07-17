package com.citibank.main;

import com.citibank.domain.GoodAfternoonGreetings;
import com.citibank.domain.GoodMorningGreeting;
import com.citibank.domain.GreetingApplication;
import com.citibank.domain.Greetings;

public class GreetingsApplicationMain {
	public static void main(String[] args) {
		GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
		GreetingApplication  application = new GreetingApplication(goodMorningGreeting);
		application.doGreet();
		GoodAfternoonGreetings afternoonGreetings = new GoodAfternoonGreetings();
		GreetingApplication  application1 = new GreetingApplication(afternoonGreetings);
		application1.doGreet();
		
		System.out.println();
		
		// lambda expression
		Greetings goodEveningGreetings = () -> System.out.println("Good Evening!!!");
		GreetingApplication  application2 = new GreetingApplication(goodEveningGreetings);
		application2.doGreet();
			
	
	}

}
