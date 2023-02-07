package com.kh.interfaceTest.model.vo;

import java.io.Serializable;

/*
 * - 상속 -
 * 클래스 : extends
 * 인터페이스 : implements
 * (인터페이스는 여러 개 상속이 가능하다)
 */
public class MyProduct extends Product implements IProduct, Serializable {

	// 미완성 메소드 재정의
	@Override
	public void testMethod() {
		
		System.out.println("미완성 클래스에서 받은 메소드입니다!");
		
	}

	@Override
	public void testMethod2() {
		System.out.println("인터페이스에서 온 메소드입니다!");
		
	}

	@Override
	public void testMethod3() {
		System.out.println("인터페이스에서 온 메소드입니다!");
		
	}
	
	
	
}
