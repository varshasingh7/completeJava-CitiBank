package com.citibank.main;

import com.citibank.domain.ProcessString;

public class ProcessStringMain {
	public static void main(String[] args) {
	
		ProcessString upCase = (s1) -> {
		  return s1.toUpperCase();
		 
			
		};
		String result = upCase.doProcess("hi");
		System.out.println(result);
		
//		ProcessString length = (s2) -> {
//			return s2;
//		};
		
		ProcessString processString = (s) -> "length is " + s.length();
//		result = length.doProcess("lambdaExpression");
//		int x = result.length();
//		System.out.println("length of supplied string is " +x);
		
		System.out.println(processString.doProcess("LambdaExpression"));
		ProcessString repeat = (s3) -> {
			  return s3.repeat(4);
		};
		result = repeat.doProcess("Hi");
		System.out.println(result);
		
		
			 
		
		
		
		
		
	}
	

}
