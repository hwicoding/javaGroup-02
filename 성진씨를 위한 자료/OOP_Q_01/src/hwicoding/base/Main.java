package hwicoding.base;

import java.util.Scanner;

import hwicoding.function.EvenOdd;
import hwicoding.function.Sum;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Sum sum = new Sum();
		EvenOdd evenOdd = new EvenOdd();
		
		int firstNum, SecondNum, totalSum = 0;
		
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오 : ");
		SecondNum = scanner.nextInt();
		
		totalSum = sum.sumCalculator(firstNum, SecondNum);
		System.out.println(firstNum + " ~ " + SecondNum + "까지의 합 : " + totalSum);
		System.out.println(evenOdd.evenOdd(totalSum));
	}

}
