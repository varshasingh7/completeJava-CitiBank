package com.citibank.main;

import com.citibank.domain.A;
import com.citibank.domain.B;

public class ConstructorMain {
	public static void main(String[] args) {
		//without inheritance
//		A a = new A(); //default constructor of A
//		B b = new B(); //default constructor of B
//		after inheritance
//		B b = new B(); //default constructor of A default constructor of B
//		// after constuctor overloading in class a and b
//		B b = new B(10);
//		default constructor of A
//		parameterized constructor of B
//		x = 10
		B b = new B(10); //after adding super(x) in B;
//		parameterized constructor of A
//		x = 10
//		parameterized constructor of B
//		x = 10
		
		
	}

}
