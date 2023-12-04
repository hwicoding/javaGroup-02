package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		// 문자와 숫자의 변환
		int num1 = 123;
		String str1 = "12345";
		
		System.out.println(str1.concat(Integer.toString(num1))); // num1 숫자형을 문자형으로 바꿔줌
		System.out.println(num1 + Integer.parseInt(str1)); // str1 문자형을 숫자형으로 바꿔줌
		
		

	}

}
