package com.kh.loop.test;

import java.util.Scanner;

public class B_WhileLoop {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// while 문은 별도의 초기식, 증감식 없이
		// 특정 조건만 반복하면 무한정 반복을 수행하는
		// 무한 반복의 특성을 지닌다.
		
		// while( 조건식 ) {...}
		while(1 < 5) {
			System.out.println("OO야 사랑해 ♡");
		}
	}
	
	public void test2() {
		// 문자열을 하나 입력받아
		// 문자열의 길이만큼 문자 하나씩 분리하기
		// 안녕하세요 -> 안, 녕, 하, 세, 요
		
		// 안내 문구
		System.out.print("영단어 입력 : ");
		String word = sc.next();
		
		int i = 0 ; // 반복 횟수 계산용
		while( i < word.length() ) {
			
			// System.out.println(i + " : " + word.charAt(i));
			System.out.print(word.charAt(i) + ", ");
			i++;
		}
	}
}




















