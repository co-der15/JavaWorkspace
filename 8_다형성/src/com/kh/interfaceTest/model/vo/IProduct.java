package com.kh.interfaceTest.model.vo;

/**
 * 인터페이스
 * 추상(미완성) 메소드와 모든 클래스에서 공용으로 사용할 
 * 상수들을 한데 묶어 놓은 추상 전용 클래스를 인터페이스라고 한다.
 * 
 * 인터페이스의 필드 변수는 반드시 상수만을 작성할 수 있고,
 * 메소드는 반드시 미완성 메소드만 가능하다.
 * 
 * 클래스로부터 상속받을 수 없고
 * 같은 인터페이스끼리만 상속이 가능하다.
 * 
 * 이 때, 상속 받고자하는 인터페이스를 선언할 경우
 * 클래스와 같이 extends 인터페이스명 으로 기술한다.
 * 
 */

public interface IProduct {
	// 인터페이스의 필드 상수
	// public static final 이 기본이기 때문에
	// 생략이 가능하다!
	public static final int NUM1 = 100;
	double PI = 3.14;
	
	// 인터페이스 메소드
	// 메소드 역시 미완성 메소드만으로 이루어지기 때문에
	// public abstract 를 생략 할 수 있다!
	public abstract void testMethod2();
	void testMethod3();
	
	// ** 자바에서 다룰 수 없는 메모리 영역 등의 네이티브 코드(컴퓨터 전용 언어)를
	//    표현하고자 할 때에도 종종 사용한다.
	
}











