package com.kh.op.test;

import java.util.Scanner;

public class B_논리부정연산자 {
	// ! 논리값(Not) 
	// !true --> false , !false --> true
	
	public void testMethod() {
		
		System.out.println("true 의 반대 : " + !true);
		System.out.println("false의 반대 : " + !false);
		
		// 정수 하나를 입력받아 
		// 해당 숫자가 5의 배수인지
		// 확인하는 코드 작성하기
		System.out.print("정수 한 개 입력: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 5의 배수인가? " + (num % 5 == 0));
		System.out.println("입력한 정수가 5의 배수가 아니냐? " + !(num % 5 == 0));
	}

}
