package quiz;

import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int[] histo=new int[10];
		int num=0;
		
		System.out.println("입력할 숫자의 갯수? :");
		num=scanner.nextInt();
		
		for(int i=0; i<histo.length; i++) {
			System.out.print((i+1)+"의 숫자 :");
			int kk = scanner.nextInt();
			histo[kk/10]++;
		}
		
		scanner.close();
		
		System.out.println("----- Histogram -----");
		
		for(int i=(histo.length-1); i>=0; i--) {
			System.out.print(String.format("%3d : ", i*10));
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
	}

}
