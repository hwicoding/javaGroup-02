package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 신장이 가장 크거나 작은 학생의 이름과 신장을 출력하기
		
				Scanner scanner = new Scanner(System.in);
				String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
				int height[]=new int[5];
				int total=0;
				int max=0;
				int min=0;
				
				
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i]+"의 신장을 입력하세요 : ");
					height[i]=scanner.nextInt();
				}
				
				for(int i=0; i<name.length; i++) {
					total+=height[i];
				}
				
				int average = (total/name.length);
				System.out.println("평균 신장은 : "+average);
				
				

			}
		}
