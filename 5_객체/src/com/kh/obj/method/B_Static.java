package com.kh.obj.method;

public class B_Static {
	// 프로그램 실행 시 static 영역에 보관되고,
	// 프로그램 종료 시 static 영역에서 소멸된다.
	
	// 1. 매개변수 X, 리턴타입 X
	public static void test1() {
		
		System.out.println("나는 B_Static 객체들의 공유 메소드입니다.");
		
	}
	
	// 2. 매개변수 X, 리턴타입 O
	public static String test2() {
		
		return "내가그린기린그림은...";
	}
	
	// 3. 매개변수 O, 리턴타입 X
	public static void test3(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	
	// 4. 매개변수 O, 리턴타입 O
	public static double sum(double num1, double num2) {
		
		return num1 + num2;
		
	}
}












