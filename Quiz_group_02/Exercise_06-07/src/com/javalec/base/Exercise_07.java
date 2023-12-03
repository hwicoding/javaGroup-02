package com.javalec.base;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
		int level=sc.nextInt();
		int[] arr= new int[level];
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(String.format("%3d", count));
				count++;
			}
			System.out.println();
		}

	}

}
