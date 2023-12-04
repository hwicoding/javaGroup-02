package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num, inputclientNumber, inputAmount, 
			outputlientNumber, outputAmount, sum = 0;
		
		while(true) {
		
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 현황");
		System.out.println("4. 종료");
		
		System.out.print("번호를 선택하세요! ");
		num = scanner.nextInt();
		
		if(num == 1) {
			System.out.print("고객번호 : ");
			inputclientNumber = scanner.nextInt();
			System.out.print("금액 : ");
			inputAmount = scanner.nextInt();
			System.out.print("입금 결과 : 고객번호 : " + inputclientNumber + " 잔액 : " + inputAmount + "\n");
			inputAmount++;
			break;
		}
		
		else if(num == 2) {
			System.out.print("고객번호 : ");
			outputlientNumber = scanner.nextInt();
			System.out.print("금액 : ");
			outputAmount = scanner.nextInt();
			
			if(inputAmount < outputAmount) {
				System.out.print("잔액이 부족합니다!");
			} else {
				sum = outputAmount - inputAmount;
			}
			
			
		}
		
		
		
		
		
		
		
			// 종료 조건 구문
			if(num == 4) {
				break;
			}
		}
		
		System.out.println(">>>>> Thank you <<<<<");

	}

}
