package com.kh.excep.my.controller;

import java.util.Scanner;

import com.kh.excep.my.exception.AgeException;

public class MyExceptionTest {

	public static void main(String[] args) {
		// 나이를 입력받아 19세 이상이면 성인입니다.
		// 19세 미만이면 학생입니다. 라고 처리하는
		//  에러상황 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		MyExceptionTest my = new MyExceptionTest();
		
		try {
			
			my.checkAge(age);
			
		} catch (AgeException e) {
			 // 에러가 발생한 위치를 알려주는 메소드
			// e.printStackTrace();
			
			// 우리가 선언한 메시지를 출력하는 메소드
			System.out.println(e.getMessage());
			
		}

	}
	
	public void checkAge(int age) throws AgeException {
		
		if(age > 18) {
			
			System.out.println("성인입니다!");
			
		} else {
			
			throw new AgeException("학생입니다!");
			
		}
	}

	
}
