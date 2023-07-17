package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Square;

public class SquareMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();
		System.out.println("Number entered :" + number);
		Square square = new Square();
		int output = square.calculateSquare(number);
		System.out.println("print the square::" + output);
		
		System.out.println("enter number");
		number = scanner.nextInt();
		System.out.println("Number entered :" + number);
		output = square.calculateSquare(number);
		System.out.println("print the square::" + output);
	}
	

}
