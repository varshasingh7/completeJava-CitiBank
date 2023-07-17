package com.citibank.main;

import com.citibank.domain.Canon350X;
import com.citibank.domain.HP3423;

public class PrinterDriverMain {
	public static void main(String[] args) {
		HP3423 hp3423 = new HP3423();
		hp3423.print();
		hp3423.wirelessPrinting();
		
		Canon350X canon350x = new Canon350X();
		canon350x.print();
		canon350x.borderlessPrinting();
		
		
	}

}
