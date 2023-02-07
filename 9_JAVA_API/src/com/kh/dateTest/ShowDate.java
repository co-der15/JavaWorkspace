package com.kh.dateTest;

import java.util.Scanner;

public class ShowDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 특정 연도가 윤년인지 확인하기");
		
		DateSilsub ds = new DateSilsub();
		
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		
		// ds.isLeapYear(year); 를 잘 활용하여 "입력하신 연도는 평년/윤년 입니다~!" 출력하기
		String result = ds.isLeapYear(year) ? "윤년" : "평년";
		
		System.out.println("입력하신 연도는 " + result + " 입니다~!");
				
		System.out.println("2. 1년 1월 1일부터 오늘까지 총 일 수 계산하기");
		
		// ds.getDays(); 메소드를 사용하여 "총 날짜 수 : 000000 일" 출력하기
		
		System.out.printf("총 날짜 수 : %d 일", ds.getDays());
	}

}
