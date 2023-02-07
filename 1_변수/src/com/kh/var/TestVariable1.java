// 1. 패키지 생성
package com.kh.var;

// 2. 클래스 생성(앞글자는 대문자)
public class TestVariable1 {

	// 실행은 Ctrl + F11 이 단축키
	// 기능 제공 메소드
	public void method1() {
		
		// 일반 데이터 출력
		System.out.println(10);
		System.out.println(1000);
		System.out.println(10000);
		
		// 변수 사용
		// 공간(변수) <- 값
		// money 공간에 100을 넣어라(대입해라)
		int money = 100;
		
		System.out.println( money );
		System.out.println( money );
		System.out.println( money );
		
	}
	
	public void method2() {
		// 변수 선언
		
		// 회원 정보 담기
		// 이름, 나이, 주소, 성별, 몸무게, 신장, 연락처, 이메일, 결혼여부
		
		String name;     // String:문자열 (name 이라는 이름의 공간에 문자열을 담겠다)
		int age;         // int:정수
		String addr;     // String
		char gender;     // char:문자 하나
		double weight;   // double:실수형
		double height;   // double
		String tel;      // String
		String email;    // String
		boolean mrg;     // boolean:논리형
		
		// 선언한 변수(공간)에 값 대입하기
	
		name = "홍길동";
		age = 10;
		addr = "서울시";
		gender = 'M';
		weight = 170.5;
		height = 65.5;
		tel = "01011112222";
		email = "user01@example.com";
		mrg = true; // false;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(gender);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(tel);
		System.out.println(email);
		System.out.println(mrg);	
		
	}
}
