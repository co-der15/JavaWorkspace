package com.kh.dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {

	public static void main(String[] args) {
		DateClass dc = new DateClass();
		
		// dc.testDate();
		dc.testCalendar();
		// dc.localDate();
		
	}

	public void testDate() {
		// 날짜 담당 클래스
		// 1970년 1월 1일 - UTC -
		Date date = new Date();
		
		System.out.println("날짜 : " + date);
		System.out.println("밀리세컨단위 : " + new GregorianCalendar().getTimeInMillis());
	}
	
	public void testCalendar() {
		// 기존의 Date보다 많은 정보를
		// 저장하기 위한 자료형
		
		Calendar cal = new GregorianCalendar();
		
		System.out.println("cal : " + cal);
		
		int year = cal.get(Calendar.YEAR);
		// 월은 문자열 내용도 포함하기 때문에 배열로 관리한다.
		// 따라서 처음 시작하는 1월은 0부터!
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int am_pm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 \n", year, month, date);
		System.out.printf("%d : %d : %d (%s)\n", hour, min, sec, 
				                                (am_pm > 0 ? "오후" : "오전"));
		
		// 사용자 정의 날짜 포맷(형식)
		
		SimpleDateFormat dateStr
			= new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		
		String formatDate = dateStr.format(cal.getTime());
		
		System.out.println(formatDate);
		
		// 날짜 직접 변경하기
		cal.set(2021, 5, 28);
		
		formatDate = dateStr.format(cal.getTime());
		
		System.out.println(formatDate);
	}
	
	public void localDate() {
		// 기존의 잘못된 계산들을 보다 정확히
		// 맞추기 위해 만들어진 날짜 계산 클래스
		// LocalDate, LocalTime, LocalDateTime
		
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println("today : " + today);
		System.out.println("연도 : " + today.getYear());
		System.out.println("월 : " + today.getMonthValue()); // 1월, 2월 ...
		System.out.println("일 : " + today.getDayOfMonth());
		
	}
}


















