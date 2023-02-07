package com.kh.var;

// import : 다른 패키지의 클래스가 필요할 경우

public class TestVariable2 {
	// 전역변수와 지역변수
	// 전역변수(Global / Fields)
	// 클래스 바로 밑에 선언하는 변수
	// 다른 메소드들이 공용으로 
	// 접근하여 사용할 수 있음
	// 값을 초기화 하지 않으면 해당 타입이 
	// 가지는 기본값으로 초기화가 이루어짐
	
	int num1 = 100;
	int num2 = 200;
	final int NUM3 = 300;  // 상수
	
	// 기능 제공 메소드
	public void method1() { 
		// 지역변수
		int num2 = 150;
		int num4 = 250;
		
		System.out.println("전역 변수 : " + num1);
		System.out.println("지역 변수 : " + num2);
		System.out.println("상수 : " + NUM3);
		
	}
	
	public void method2() {
		// 전역변수와 지역변수 접근 확인

		System.out.println("전역변수 : " + num1);
		System.out.println("전역변수 : " + num2);
		
		// 다른 메소드에 선언된 지역변수는 가져올 수 없다!
		// System.out.println("지역변수 : " + num4);  -- ERROR!
	}
	
	public void method3() {
		// 상수 사용하기
		// 변수는 선언 후 값을 변경할 수 있다
		num1 = 123;
		
		System.out.println("변경 확인 : " + num1);
		
		// 상수는 최초 값 변경 이후에 값을 변경할 수 없다.
		// NUM3 = 456;
	}
	
	public void method4( int money ) {
		// 매개 변수 (parameter)
		// 다른 메소드나 코드 내용을 실행 시
		// 해당 메소드를 호출할 때 선언한 값을 
		// 부여하고 시작하는 변수
		
		System.out.println("받은 돈 : " + money);
	}
	
}











