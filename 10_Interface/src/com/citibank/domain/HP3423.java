package com.citibank.domain;

public class HP3423 extends PrinterDriver implements UpdateTwo {

	@Override
	public void print() {
		System.out.println("HP3423 is printing");
		
	}

	@Override
	public void wirelessPrinting() {
		System.out.println("HP3423 is doing wireless printing");
		
	}

}
