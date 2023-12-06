package com.javalec.function;

public class SumEvenOdd { // public이 아닌 private 으로 하면 메인에서 안보인다.
	
	// Field
	
	
	// Constructor
	public SumEvenOdd() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	// 1. 합계를 구한다.
	public int sumCalc(int num1, int num2) { // main에 evenodd.sumCalc(startNum, endNum);에서 startNum, edNum 받는다. 객체 이름은 달라도 상관 없다, 다만 받는 순서는 중요할 뿐
	    // int 말고 void도 가능, void는 내가 직접 main으로 넘기지 않고 직접 여기서 출력하겠다 라는 뜻.
		// int num1, int num2 => 이것은 파라미터(parameter)라고 한다.
		// parameter는 매개 변수
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum+= i;
		}
		
		return sum; // sum이라는 걸 넘겨주겠다 라는 뜻
		// 단 int가 아니라 void가 되는 순간 return은 사라지고 계산 출력 값이 나와야한다.
	}
	
	// 2. 합계의 짝수인지 홀수인지 판단.
	public String evenOdd(int sum) {
		String result = "";
		if(sum % 2 ==0) {
			result = "짝수 입니다.";
		} else {
			result = "홀수 입니다.";
		}
		return result; // result 라는 걸 넘겨 주겠다
		// 마찬가지로 String 아니라 void가 되는 순간 return은 사라지고 계산 출력 값이 나와야한다.
		// 근데 가급적이면 return으로 넘겨주는게 best다.
	}
	
	
	
	
	
	
	
	//프로세스 플로우 다이어그램(PFD) 흐름 순서도 그리는거 꼭 필수!

}
