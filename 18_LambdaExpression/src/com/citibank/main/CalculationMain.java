package com.citibank.main;

import com.citibank.domain.Calculation;

public class CalculationMain {
	public static void main(String[] args) {
	
		Calculation divideCal = (n1, n2) -> {
			return n1/n2;
		};
		double result = divideCal.doCalculation(10,	2);
		System.out.println("result is " +result );
	
		Calculation addCal = (n1, n2) -> n1 + n2 ;
		result = addCal.doCalculation(20, 40);
		System.out.println("result is "+ result);
		
		Calculation subCal = (n1, n2) -> n1 - n2;
		result = subCal.doCalculation(20, 10);
		System.out.println("result is "+ result);
	}
}
