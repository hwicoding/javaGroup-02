package com.javalec.function;

public class CalcEach {
	
//	field
	
	
	
	
//	constructor
	
	
	
	
//  Method
	
	public void calc4(int first, int second) {
		
		//덧, 뺼, 곱, 나눗
		add(first, second);
		sub(first, second);
		mul(first, second);
		div(first, second);
		
	}
	
	public void calc3(int first, int second) {
		
		//덧, 뺼, 곱, 나눗
		add(first, second);
		sub(first, second);
		mul(first, second);
		
	}
	
	
	
	private void add(int first, int second) {
		System.out.println("덧셈 : " + (first + second));
	}
		
		
	private void sub(int first, int second) {
		System.out.println("뺼셈 : " + (first - second));
	}
		
		
	private void mul(int first, int second) {
		System.out.println("곱셈 : " + (first * second));
	}
		
			
	private void div(int first, int second) {
		System.out.println("나눗셈 : " + ((double)first / second));
		
	}
	
	
	

}
