package com.javalec.function;

public class CalcAll {
	
//	field
	
	
	
	
//	Constructor
	public CalcAll() {
		// TODO Auto-generated constructor stub
	}
	
//  Method
	public void calc(int first, int second) { // void는 텅텅 비어있다는 뜻.
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺼셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + ((double)first / second));
		
	}
	
	
}
