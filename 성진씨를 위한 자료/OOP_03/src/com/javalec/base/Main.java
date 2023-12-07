package com.javalec.base;

import com.javalec.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Calc calc = new Calc();
		calc.num1 = 12; // Calc 클래스에 12를 num1에 대입
		calc.num2 = 10; // Calc 클래스에 10를 num2에 대입
		calc.addAction();
		calc.subAction();
		calc.mulAction();
		calc.divAction();
		*/
		
		
		Calc calc = new Calc(10, 20);
		System.out.println("---------");
		calc.num1 = 12; 
		calc.num2 = 10;
		calc.calaAll();

	}

}
