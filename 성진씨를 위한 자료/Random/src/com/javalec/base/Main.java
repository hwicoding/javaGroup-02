package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// 난수 만들기
		
		/*
		Random random = new Random();
		
		for(int loop=1; loop<=10; loop++) { //1o개 출력
		
		int i = random.nextInt(10); // 1~10까지
		System.out.println(i);
		}
		*/
		
		// Lotto 번호 생성기
		// 숫자 6개 번호 1~45까지 중복 x, 0나오면 안됨
		
		
		Random random = new Random();
		
		int j= 1;
		int[] lottoArray = new int[6];
 		
		for(int loop=0; loop<lottoArray.length; loop++) {
			
			int i = random.nextInt(44) + 1;
			
			
			if(lottoArray[loop] == lottoArray[0]) {
				lottoArray[loop] = i;
				} else { while(j<=loop) {
							if(lottoArray[loop] == lottoArray[loop+j]) {
								i = random.nextInt(44) + 1;
								j = 0;			
								} else{
									break;
								}
							
							}
							lottoArray[loop] = i;
						}
				
			
			System.out.print(lottoArray[loop] + "\t");
			
		}
		
	}

}
