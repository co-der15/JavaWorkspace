package com.kh.obj.method;

public class MethodTest {
	// 메소드는 다른 메소드를 호출할 수 있다!
	
	public void test1() {
		
		System.out.println("메소드 1 시작!");
		
		test2();
		
		System.out.println("메소드 1 종료!");
		
		
	}
	
	public void test2() {
		
		System.out.println("메소드 2 시작~~~");
		
		test3();
		
		System.out.println("메소드 2 종료~~~");
		
		return;
	}
	
	public void test3() {
		
		System.out.println("메소드 3 시작 ^^ ");
		
		
		System.out.println("메소드 3 종료 ^^ ");
		
		return;
	}
}
