package com.javalec.function;

public class Calc {
	
	
//	Field
	int dan, startNum, endNum = 0;
	

	
//	Constructor
	public Calc(int num1, int num2, int num3) {	
		this.dan = num1;
		this.startNum = num2;
		this.endNum = num3;
	}
	
	
//	Method
	public void gugu() {
		for(int i=startNum; i<=endNum; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}

	}

	

}
