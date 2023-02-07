package com.kh.array.test;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 길이가 5인 숫자 배열을 선언하고,
		// 값을 100, 200, 300, 400, 500으로
		// 초기화 한 후, 그 수들의 합을 for문으로 
		// 구하는 프로그램을 작성하시오.
		int[] arr = { 100, 200, 300, 400, 500 };
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			sum += arr[i];
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void test2() {
		// olleh -> hello
		// 문자열을 입력받아 
		// 해당 문자열을 문자 배열에 한 문자씩 차곡차곡 저장한 후
		// 반대로 뒤집어 뽑기
		// 
		// -- 출력 예시 --
		// 문자열 입력 : 강아지
		// 결과 : 지아강
		// hint : 문자 배열 사용
		
		System.out.print("문자열 입력 : ");
		String words = sc.next();
		
		char[] charr = new char[ words.length() ];
		
		// 입력부
		for(int i = 0 ; i < charr.length ; i++) {
			charr[i] = words.charAt(i);
		}
		
		// 출력부
		System.out.print("결과 : ");
		
		for(int i = charr.length - 1 ; i >= 0 ; i--) {
			System.out.print( charr[i] );
		}
		
	}
}
