package com.kh.obj.method;

public class A_NonStatic {

	// 1. 매개변수 X, 리턴타입(반환값) X
	public void test1() {
		// 실행 시 해당 기능만 수행한 후
		// 자신을 호출한 곳으로 돌아가는 메소드
		
		System.out.println("나는 test1 입니다!");
		
		return; // 만약 돌려주는 값이 없을 때 return은 생략이 가능하다!
				// 후에 JVM이 컴파일 시 return 을 생성해준다.
	}
	
	// 2. 매개변수 X, 리턴타입 O
	public String test2() {
		// 메소드가 끝나고 반환하는 값(리턴타입)이 있다면
		// 반드시 해당 자료형의 값을 return과 함께
		// 작성해야 한다.
		
		String str = "촉촉한 나라의 초코칩공주";
		
		return str;
	}
	
	
	// 3. 매개변수 O, 리턴타입 X
	public void test3(String name) {
		
		System.out.println(name + "님, 환영합니다!");
		
		// return;
	}
	
	// 4. 매개변수 O, 리턴타입 O
	public int sum(int num1, int num2) {
		
		return (num1 + num2);
	}
}
















