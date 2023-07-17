package com.citibank.domain;

public class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor of B");
	}
	public B(int x) {
		super(x);
		System.out.println("parameterized constructor of B");
		System.out.println("x = " + x);
	}
	

}
