package quiz;

import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
	     System.out.print("입력할 숫자의 갯수 ? ");
	     int num = scanner.nextInt();
	     System.out.println(num+"개의 숫자를 입력하세요!");
	     int[] arr=new int[num];
	     int max=0;
	     int count=0;
	     int num1=0;
	     for(int i=0; i<arr.length; i++) {
	    	 int b = scanner.nextInt();
	    	 arr[i]=b;
	    	 count++;
	    	 if(max<arr[i]) {
	    		 max=arr[i];
	    		 num1=count;
	    	 }
	     }
	     
	     System.out.println("입력한 숫자중 최대값은 "+ max + "이고 " + num1 +"번째 값 입니다.");

	}

}
