package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		// 1~10까지 합계, 범위가 나오면 반복문
		
		// 절차지향 코드문
		int sum=0;
		Scanner scanner = new Scanner(System.in);
     // 정의  	객체(인스턴스)	  생성자
		int startNum = 0;
		int endNum = 0;
		
		
		System.out.print("범위의 숫자 중 작은 숫자 : ");
		startNum = scanner.nextInt();
		
		System.out.print("범위의 숫자 중 큰 숫자 : ");
		endNum = scanner.nextInt();
		
		
		for(int i=startNum; i<=endNum; i++) {
			
			sum +=i;
			
		}
		
		System.out.println(startNum + " ~ " + endNum + "까지의 합 : " + sum);
		
		if(sum % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		

	}

}
