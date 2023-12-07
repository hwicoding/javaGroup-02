package com.javalec.function;

public class Calc {
	
//	Property, Field
	 public int num1, num2 = 0; // 기본적으로 타입이 ㅔrivate, 그래서 public을 앞에 써줘야 한다.
	
//	Constructor
	public Calc(int num1, int num2) { 
		this.num1 = num1;
		this.num2 = num2;
		
		
	}
	
	public void calaAll() {
		String arr[] = {addAction(), subAction(), mulAction(), divAction()};
		
		for(int i=0; i<arr.length; i++) {
			String a = arr[i];
		}
		
	}
	
	
	
//	method
//	>>> 덧셈
	public String addAction() {
		System.out.println("덧셈 : " + (num1 + num2));
		return "";
	}
	
//	>>> 뺼셈
	public String subAction() {
		System.out.println("뺄셈 : " + (num1 - num2));
		return "";
	}
//	>>> 곱셈
	public String mulAction() {
		System.out.println("곱셈 : " + (num1 * num2));
		return "";
	}
//	>>> 나눗셈
	public String divAction() {
		System.out.println("나눗셈 : " + ((double)num1 / num2));
		return "";
	}

}
