package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String str0 = "가나다라마바";
		String str1 = new String("abcdefg");
		String str11 = new String("ABCDEFG");
		String str2 = new String("HIJKLMN");
		String str3 = new String("   abc   ");
		//원래 이게 str1 코드 형태가 근본. str0는 편의를 위해!
		
		Scanner scanner = new Scanner(System.in);
		// 객체형 변수는 대문자로 시작한다. ex) int double... 소문자
		
		System.out.println(str1);
		System.out.println(str1.concat(str2)); // concat은 매소드 .concat은 str1을 str2를 붙여준다(같은 객체만!)
		System.out.println(str1.substring(3)); // sub는 부분이라는 뜻. substring은 3번부터 끝까지를 의미.
		System.out.println(str1.substring(3,5)); // 3번부터 5번 전까지를 의미. 즉 length 개념.
		
		// 라마 만 출력하기
		System.out.println(str0.substring(3,5));
		
		
		System.out.println(str0.length()); // id나 password에 많이 쓴다.
		System.out.println(str1.toUpperCase()); // 모두 대문자로 처리하겠다.
		System.out.println(str2.toLowerCase()); // 모두 소문자로 처리하겠다.
		
		System.out.println(str1.charAt(3)); // 인덱스 찾기
		System.out.println(str1.indexOf('d')); // d 라는게 str1에 어디에 있냐? 3에 있다.(주소 찾기) 
		
		System.out.println(str1.equals(str2)); // str1과 str2가 같냐? bool값으로 나옴
		
		System.out.println(str1.equals(str11.toLowerCase())); //중복도 가능하다.
		System.out.println(str1.toUpperCase().equals(str11)); //중복도 가능하다.
		
		System.out.println(str3);
		System.out.println(str3.trim()); // 빈칸(공백) 제거
		System.out.println(str1.replace('a', 'z')); // a를 z로 바꾸겠다. 비밀번호 누를 떄 보여주고 안보여주고 이런식으로
		System.out.println(str1.replace('a', 'z')); // a를 z로 바꾸겠다. 비밀번호 누를 떄 보여주고 안보여주고 이런식으로
		System.out.println(str1.replaceAll("abc", "zzzzzzz")); // abc를 zzzzzzz로 바꾸겠다. 문자열 바꾸기 문자열이라서 ""써야함

	}

}
