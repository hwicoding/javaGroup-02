package com.javalec.base;

import java.util.Calendar;

import javax.print.CancelablePrintJob;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] dateName = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		Calendar calendar = Calendar.getInstance(); // 현재 시각 캘린더 불러오기, new 쓰면 0년부터 시작
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 1월이 0으로 계산 그래서 현재 달은 +1해줘야함
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int date = calendar.get(calendar.DAY_OF_WEEK);
		
		int hour = calendar.get(calendar.HOUR);
		int minute = calendar.get(calendar.MINUTE);
		int secound = calendar.get(calendar.SECOND);
		
		
		System.out.println(year + "-" + month + "-" + String.format("%02d", day) + "-" + dateName[date-1]);
		System.out.println(String.format("%02d", hour) + ":" + minute + ":" + secound );
	}

}

//DAY_OF_MONTH => 1,2,3,4
//DAY_OF_WEEK => 0~6(mon = 0, )