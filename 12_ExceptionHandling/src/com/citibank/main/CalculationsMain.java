package com.citibank.main;

import com.citibank.domain.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		Calculations calculations = new Calculations();
//		calculations.accept();
		int result = calculations.acceptAndCalculate();
		System.out.println("reuslt ::" +result);
//		calculations.display();
	}

}
