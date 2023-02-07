package com.kh.op.test;

public class C_산술연산자 {
	// 일반 사칙연산
	
	public void testMethod() {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기   : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2)); // x --> *
		System.out.println("나눈몫 : " + (num1 / num2));
		// 나눗셈에서 0으로는 연산을 할 수 없다
		System.out.println("나눈 나머지 : " + (num1 % num2));

		// 문자열 + 숫자 == 문자열
		
		System.out.println(10 + 'A');    // 10 + 65 --> 75
		System.out.println("10" + 'A');  // 10A 
		
	}
	
	public void testUnicode() {
		// 유니코드 : 세계 주요 문자에 대응하는
		//            숫자 표기를 제공하는 언어 표현체계
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		
		String str = sc.next();
		
		char ch = str.charAt(0);
		
		// 안 녕 하 세 요
		// 0  1  2  3  4
		
		int num = ch;
		
		System.out.println(ch + "에 해당하는 유니코드 숫자는 " + num + " 입니다!");
		
	}
	
	
	
	
	
	
	
	
	
}
