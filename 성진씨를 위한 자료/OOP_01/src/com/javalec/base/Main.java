package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		
		// 범위의 합계를 구하고 홀수 짝수 판별한다.
		
		Scanner scanner = new Scanner(System.in);
		SumEvenOdd evenodd = new SumEvenOdd();
		int startNum, endNum, sum = 0;

		
		
		System.out.print("범위의 숫자 중 작은 숫자 : ");
		startNum = scanner.nextInt();
		
		System.out.print("범위의 숫자 중 큰 숫자 : ");
		endNum = scanner.nextInt();
		
		sum = evenodd.sumCalc(startNum, endNum);
		System.out.println(startNum + " ~ " + endNum + "까지의 합 : " + sum);
		System.out.println(evenodd.evenOdd(sum));
	}

}
