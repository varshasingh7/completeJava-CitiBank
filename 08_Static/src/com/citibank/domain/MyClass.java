package com.citibank.domain;

public class MyClass {

		
		private static int number1 = 10;
		public static int number2 = 10;
		public static void display() {
			System.out.println(" value of non static number1: " + number1);
			System.out.println(" value of  static number2: " + number2);
			number1 = number1 + 10;
			number2 = number2 + 10;
			System.out.println(" value of non static number1: " + number1);
			System.out.println(" value of  static number2: " + number2);
		
		
	}

}
