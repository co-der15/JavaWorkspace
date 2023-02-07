package com.kh.obj.model.vo;

public class FieldTest {
	
	public static final double PI = 3.14; 
	// 모든 FieldTest 클래스 객체가 사용하는 공용 상수 
	
	public int num1;       // 1. JVM 초기값
	public int num2 = 100; // 2. 사용자 명시 초기값
	/*
	{
		// [3. 초기화 블럭] / [] : 생략 가능 표현
		num1 = 150;
		num2 = 50;
	}
	
	static {
		// 정적 메모리 변수(클래스 변수)전용 초기화 블럭
	}
	*/
	
	// 4. 생성자를 통한 초기화
	public FieldTest(int num2) {
		this.num2 = num2;
	}
	
	
	
}
