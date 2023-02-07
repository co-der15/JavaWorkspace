package com.kh.excep.inherit;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
	// 자식 클래스는 부모의 메소드를 재정의할 수 있다!
	// 단, 부모로부터 전달된 throws Exception이
	// 동일하거나 부모보다 하위 클래스여야만
	// 정의가 가능하다.
	/*
	@Override
	public void exceptionTest() throws IOException {
		// 동일한 예외 던지기
		
	}
	*/
	/*
	@Override
	public void exceptionTest() throws Exception {
		// 부모보다 더 높은 단계,
		// 부모와 관련없는 Exception을 던질 수는 없다.
		
	}
	*/
	
	@Override
	public void exceptionTest() throws FileNotFoundException {
		// 부모보다 낮은 단계 예외 던지기도 가능하다
		
	}
}


