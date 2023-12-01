package quiz;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 int count;
	     int sum = 0;
	     System.out.print("몇개의 숫자를 더할까요 ? ");
	     count = scanner.nextInt();
	     
	     System.out.println(count+"개의 숫자를 입력하세요");
	     
	     for(int i=0; i<count; i++) {
	    	 int num = scanner.nextInt();
	    	 sum+=num;
	     }
	     System.out.println("합계 : 입력한 숫자의 합은 "+ sum +"입니다.");

	}

}
