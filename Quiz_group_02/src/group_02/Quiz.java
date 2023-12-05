package group_02;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		
		// 2번 exercise
		/*
		long i=1;
		        long count=0;
		        for(count=0; count<=10; count++, i*=10) {
		        	System.out.println("10^"+String.format("%2d", count)+"="+String.format("%11d", i));
		        }
		
		 */
		
//		3번
//		
//		Scanner scanner = new Scanner(System.in);
//		int num = 1; //0이 아닌 이유는 0을 곱하면 0이 되기 때문이다. 
//		int fac = 1;
//		
//		System.out.println("Input your decimal no. :");
//		num = scanner.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			
//			fac *=i;
//		}
//		System.out.println(num + " 's factorial value =" + fac);
		
		// 4번
		 
		/* Scanner scanner = new Scanner(System.in);
		 
		 int num = 0;
		 
		 System.out.print("Input your number : ");
		 num = scanner.nextInt();
		 for(int j = 1; j<=9; j++) {
			 System.out.println();
			 for(int i=num; i<=num+3; i++) {
				 System.out.print(i+" X "+j+" = "+String.format("%2d", j*i)+"\t");
			 }
		 }*/
		
		
		// 5번
		
		/*
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		System.out.print("Enter on ingeter(0~9) : ");
		num = scanner.nextInt();
		
		while (num > 0) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println("Sum of digits = "+sum);
		*/
		
		
		// 6번
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("몇개의 숫자를 더할까요 ? : ");
		int num=sc.nextInt();
		System.out.println(num+"의 숫자를 입력하세요");
		int[] arr= new int[num];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			int input=sc.nextInt();
			
			arr[i]=input;
			sum+=input;
		}
		System.out.println("입력한 숫자의 합은 "+sum+" 입니다.");
		*/
		
		
		// 7번
		/*
		Scanner sc= new Scanner(System.in);
		System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
		int level=sc.nextInt();
		int[] arr= new int[level];
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(String.format("%3d", count));
				count++;
			}
			System.out.println();
		*/
		
		
		//8번
		/*
		 Scanner scanner = new Scanner(System.in);
		int count;
		int count1 = 0;
		int max = 0;
		int a = 0;
		
		
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		count = scanner.nextInt();
		
		System.out.println(count + "개의 숫자를 입력하세요!");
		
		int[]num= new int[count];
		
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
			count1++;
				if(max < num[i]) {
					max = num[i];
					a = count1;
		 }
		}
		
		System.out.println(max+" "+a);
		 
		 
		*/
		
		
		
		
		// 9번
		/*
		Scanner scanner = new Scanner(System.in);
				
				// 과목 1차원 배열 생성
				String[] name = {"Korean", "English", "Mathemotic"};
				
				// 3X4 2차원 배열 생성(가로 : 과목, 세로 : 번호)
				int[][] scoreArray = new int[3][4];
				
				// 합계 초기값
				int total = 0;
		
				// i = 과목, j = 번호 => 성적 입력
				for(int i=0; i<3; i++) { // 세로줄 생성
							System.out.println(name[i] + "의 성적을 입력 : ");
							for(int j=0; j<4; j++) { // 가로줄 생성
								System.out.print("No"+(j+1) + "의 성적은 : ");
								scoreArray[i][j] = scanner.nextInt();
							}
				}
				
				// 과목, 합계, 평균 제목 부분
				System.out.println("\t" + name[0] + "\t" +  name[1] + "\t" + name[2] + "\t" + "Total" + "\t" + "avg");
				
				// 성적표 : 각 과목과 번호의 점수, 합계, 평균 구하기
				for(int j=0; j<4; j++) { // 세로줄
					System.out.print("No." + (j+1) + "\t");
					
					for(int i=0; i<3; i++ ) { // 가로줄
						System.out.print(scoreArray[i][j] + "\t");
						total += scoreArray[i][j]; // 합계 => 행의 합계 누적
					}
					System.out.println("\t" + total + "\t" + total/3); // 합계와 평균 출력
					total = 0; // 합계 초기화
				}
				*/
		
		
		// 10번
		
		/*
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int[10]; // 10개 배열 생성
		
		System.out.println("Input score : "); //성적 히스토그램 만들기 문제
		
		// int size = histo.length
		for(int i=0; i<histo.length; i++) { // 0~9 인덱스까지 돌릴거다
			System.out.print((i+1) + "의 score : "); // 입력 점수 출력문
			int inputScore = scanner.nextInt(); // 입력 점수 정수형에 저장
			++histo[inputScore/10]; 
			// histo[inputScore/10] = histo[inputScore/10] +1 
			// => 여기서 histo[inputScore/10]는 껍데기(틀)이라 생각하고 실질적인 값은 +O이 된다.
		}
		scanner.close();
		
		System.out.println("---------- Histogram ----------");
		
		for(int i=histo.length-1; i>=0; i--) {
			System.out.print(String.format("%3d : ", i*10));
			for(int j=0; j < histo[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}	
		*/
		

		
		// 11번
		/*
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
		*/
		
//		12번
//		
//		int num, inputNumber ;
//		int location, insertNum, gap = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("입력할 숫자의 갯수 ? :");
//		num = scanner.nextInt();
//		
//		int[] arrayNum = new int[num+1];
//		
//		System.out.println(num + "개의 숫자를 입력하세요! :");
//		for(int i=0; i<arrayNum.length-1; i++) {
//			System.out.println((i+1)+"의 숫자 :");
//			inputNumber = scanner.nextInt();
//			arrayNum[i] = inputNumber;
//		}
//			
//		System.out.println("숫자를 삽입하고자 하는 위치는? :");
//		location = (scanner.nextInt()-1);
//		
//		System.out.println("삽입하고자 하는 수는 ? :");
//		insertNum = scanner.nextInt();
//		
//		gap = (arrayNum.length-1) - location;
//		
//		for(int i=gap; i>0; i--) {
//			arrayNum[location+i] = arrayNum[location+i-1];
//		}
//		arrayNum[location] = insertNum;
//		
//		
//		for(int i=0; i<arrayNum.length; i++) {
//			System.out.println(arrayNum[i]);
		
		//2023. 12. 05 snr : git test 중입니다. ~!~! 
		}

	}


