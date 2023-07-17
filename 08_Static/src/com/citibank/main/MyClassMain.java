package com.citibank.main;

import com.citibank.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		class1.display();
		
		System.out.println();
		MyClass class2 = new MyClass();
		class2.display();
		
		System.out.println();
		
		System.out.println(MyClass.number2);
		System.out.println(class1.number2);
		System.out.println(class2.number2);
	}

}
