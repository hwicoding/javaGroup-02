package com.javalec.function;

public class Calc {
	
//	Field
	int num1, num2 = 0;
	
	
//	Constructor
	public Calc() {	// 밑에 똑같은 생성자가 생겨도 overloading 때문에 상관이 없다. Main에서 쓸 때는 인자를 넣을 때마다 하는 기능이 달라진다.
	}


	public Calc(int num1, int num2) { // 우클릭 > 소스 > 제너레이트 컨스트럭쳐 유징 필드에서 생성
		this.num1 = num1; // 슈퍼는 부모 클라스, this는 num1로 넘긴다라는 뜻
		this.num2 = num2;
		addAction();
}
	
	
//	Method
	public void addAction() {
		System.out.println("덧셈 : " + (num1 + num2));

	}

}
