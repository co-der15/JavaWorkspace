package com.kh.interfaceTest.model.vo;

// 미완성 클래스 / 추상 클래스
public abstract class Product {

	public Product() { } // 기본 생성자
	
	// 일반 메소드
	public void print() {
		
		System.out.println("제품 정보 입니다...");
		
	}
	
	// 미완성 메소드
	// 몸통( { 구현부 } )이 없는 메소드
	public abstract void testMethod();
	
}
