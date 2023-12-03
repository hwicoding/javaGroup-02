package com.javalec.base;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까요 ? : ");
		int num=sc.nextInt();
		System.out.println(num+"의 숫자를 입력하세요");
		int[] arr= new int[num];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			int input=sc.nextInt();
			
			arr[i]=input;
			sum+=input;
		}
		System.out.println("입력한 숫자의 합은 "+sum+" 입니다.");
	}

}
