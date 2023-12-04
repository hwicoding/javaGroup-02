package com.javalec.base;

import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

public class Main {

	public static void main(String[] args) {


		int num, location, gap;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("**원하는 위치에 숫자 삽입하기**");
		
		
		System.out.print("입력할 숫자의 갯수? : ");
		num = scanner.nextInt();
		
		int[] arrayNum = new int[num];
		int[] temp = new int[1];
		
		
		System.out.println(num + "개의 숫자를 입력하세요! : ");
		for(int i=0; i<arrayNum.length; i++) {
			System.out.print((i+1) + "의 숫자 : ");
			arrayNum[i] = scanner.nextInt();
		}
		
		System.out.println("몇 번째의 숫자를 삭제 하시겠습니까? : ");
		location = scanner.nextInt()-1;
		
		
		gap = (arrayNum.length-1) - location;
		
		for(int i=0; i<gap; i++) {
			arrayNum[location+i] = arrayNum[location+i+1];
		}
		
		arrayNum[arrayNum.length-1] = [null];
		
		System.out.println("-----결과-----");
		for(int i=0; i<arrayNum.length; i++) {
			System.out.println(String.format("%3d", arrayNum[i]));
		}
		
		//3 4 4 5
		
		
	}

}
