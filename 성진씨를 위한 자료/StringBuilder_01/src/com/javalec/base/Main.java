package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		//StringBuilder
		StringBuilder stringBuilder = new StringBuilder("abcedfg");
		System.out.println(stringBuilder);
		
		stringBuilder.append("hijklmn"); //추가
		stringBuilder.insert(3, "zzz"); // 3번째 값을 삽입
		stringBuilder.delete(3, 6); // 3~6번 삭제
		
		System.out.println(stringBuilder);
				
		
		//StringNuffer
		StringBuffer stringBuffer = new StringBuffer("abcedfg");
		System.out.println(stringBuffer);
		
		stringBuffer.append("hijklmn"); //추가
		stringBuffer.insert(3, "zzz"); // 3번째 값을 삽입
		stringBuffer.delete(3, 6); // 3~6번 삭제
		
		System.out.println(stringBuffer);
		
		

	}

}
