package com;

import java.util.Scanner;

public class Quiz4 {

	    public static void main(String[] args) {
	        // Scanner 객체를 사용하여 사용자로부터 한 자릿수 정수를 입력받음
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("한 자릿수 정수를 입력하세요: ");

	        // 사용자 입력을 정수로 변환
	        int number = scanner.nextInt();

	        // 입력된 정수의 각 자릿수를 더하는 과정
	        int originalNumber = number; // 입력된 정수를 보존하기 위한 변수
	        int sum = 0;

	        while (number>0) {
	            // 현재 숫자의 일의 자리를 더하고, 다음 자릿수로 이동
	            sum += number % 10;
	            number /= 10;
	        }

	        // 결과 출력
	        System.out.println(originalNumber + "의 각 자릿수의 합: " + sum);
	    }
	}


