package com.kh.excep.throwsTest.controller;

public class ThrowsTest {
	
	public void method_A() throws Exception {
		System.out.println("메소드 A 입니다!");
		
		method_B();
		
		System.out.println("메소드 A가 종료됩니다!");
	}

	public void method_B() throws Exception {
		System.out.println("메소드 B 입니다~");
		
		method_C();
		
		System.out.println("메소드 B가 종료됩니다~");
	}
	
	public void method_C() throws Exception {
		System.out.println("메소드 C 입니다!!");
		
		// throw : 강제로 특정 예외(개발자가 핸들링할 수 있는 문제상황)
		//         발생시킬 수 있는 코드
		throw new Exception();
		
		// 예외상황이 발생할 경우
		// 해당 구문까지만 프로그램에서 실행된다.
		// System.out.println("메소드 C 종료합니다!!!");
		
	}
}
