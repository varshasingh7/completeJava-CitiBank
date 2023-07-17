package com.citibank.exception;

public class InvalidEmployeeSalaryException extends RuntimeException{
	@Override
	public String getMessage() {
		return "salaray must be > 0";
	}
}
