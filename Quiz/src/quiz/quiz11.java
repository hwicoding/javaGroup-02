package quiz;

import java.util.Scanner;

public class quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int input=0;
		int lookNum=0;
		int cnt=0;
		
		System.out.println("입력할 숫자의 갯수? :");
		num=sc.nextInt();
		
		System.out.println(num+"개 숫자를 입력하세요 :");
		int[] numArr=new int[num];
		
		for(int i=0; i<=numArr.length-1; i++) {
			System.out.print((i+1)+"의 숫자 : ");
			input=sc.nextInt();
			numArr[i]=input;
		}
		
		System.out.print("검색할 숫자는? : ");
		lookNum=sc.nextInt();
		
		for(int i=0; i<=numArr.length-1; i++) {
			if(lookNum==numArr[i]) {
				System.out.println(lookNum+"의 위치는 "+(i+1)+"번째 입니다.");
				cnt++;
				break;
			}
		}
		
		if(cnt==0) {
			System.out.println(lookNum+"은 존재하지 않습니다.");
		}

	}

}
