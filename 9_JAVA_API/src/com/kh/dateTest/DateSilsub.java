package com.kh.dateTest;

import java.time.LocalDateTime;

public class DateSilsub {

	public DateSilsub() { }
	
	// 평년과 윤년 확인하기
	public boolean isLeapYear( int year ) {
		
		boolean result = false;
		
		// 조건
		// - 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 연도
		if( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0 ) ) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	// 1년도 1월 1일부터 지금까지의 총 일수 계산하기
	public long getDays() {
		
		// 오늘 날짜를 구해서
		// 반복문을 통해 1년 1월 1일부터 오늘까지의 총 일수 계산하기
		long result = 0;
		
		// - 조건 및 반복문 -
		// 1) LocalDateTime 사용하기
		
		LocalDateTime today = LocalDateTime.now();
		
		for(int i = 1; i < today.getYear() ; i++) {
			
			result += isLeapYear(i) ? 366 : 365;			
		}
		
		result += today.getDayOfYear();
		
		// 2) 그레고리력 캘린더 사용하기
		/*
		Calendar cal = new GregorianCalendar();
		for(int i = 1; i <= cal.get(Calendar.YEAR); i++ ) {
			
			if(i == cal.get(Calendar.YEAR)) {
				result += cal.get(Calendar.DAY_OF_YEAR);
			} else {
				result += isLeapYear(i) ? 366 : 365;
			}
		}
		*/
		return result;
		
	}	
}
