package com.kh.obj.method;

public class C_Overloading {
	// 오버로딩
	//   같은 이름의 메소드를 다른 매개변수를 선언하여
	//   메소드 이름을 재활용하는 기술
	
	// 일반적으로 메소드는 주어진 매개변수를 사용하여
	// 정해진 소스코드를 실행하는 기능을 지닌다.
	// 이 때, 만약 같은 기능을 실행하는 메소드일 경우
	// 굳이 이름을 여러 개로 만들 필요가 있을까?
	// 이런 문제점에 착안하여 같은 기능을 실행하되
	// 사용하는 매개변수가 다르면 같은 이름을 가지도록
	// 하는 기술이 오버로딩이다.
	
	public void isZero(int num) {
		// 정수 하나 전달받고
		// 0이면 "0입니다"
		// 0이 아니면 "0이 아닙니다"
		// 출력하기
		
		if( num == 0 ) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("0이 아닙니다.");
		}
	}
	
	public void isZero( double num ) {
		if( num == 0.0 ) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("0이 아닙니다.");
		}
	}
	
	// 오버로딩 주의사항
	// 1. 메소드 이름이 같아야 한다
	// 2. 매개변수의 자료형, 선언 순서가 달라야 한다
	public void sum(int num1, double num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	public void sum(double num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	

}









