package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int dan, startNum, endNum;

		
		System.out.println("구구단 몇단을 출력할까요?(단, 시작 수, 끝 수) ");
		dan = scanner.nextInt(); 
		startNum = scanner.nextInt();
		endNum = scanner.nextInt();
		
			
		Calc calc = new Calc(dan, startNum, endNum);
		calc.gugu();
		

	}

}
