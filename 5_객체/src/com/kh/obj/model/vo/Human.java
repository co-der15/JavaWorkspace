package com.kh.obj.model.vo;

public class Human {
	// 객체 지향 언어 ( OOP : Object Oriented Programming )
	//    -> 일상의 존재를 컴퓨터 코드화한 객체를 사용하여
	//       프로그램을 만드는 일
	// 
	// 객체는 class에 의해 만들어진다!
	// c++ : 클래스에 의해 만들어진 변수
	//       클래스명 변수명;
	//
	// Java : Heap 메모리에 값을 할당하여
	//        주소값을 받을 수 있는 변수
	//     클래스명 변수명 = new 클래스명();
	// 
	// 추상화
	// 이름 (String name)
	// 나이 (int age)
	// 성별 (char gender)
	// 연락처 (String tel)
	
	// 1. 해당 클래스에서 사용할 변수(Fields)
	//    접근 제한자 자료형(타입) 변수명;
	//  public > protected > default > private
	
	public String name;  // 이름
	protected int age;   // 나이
	char gender;         // 성별
	private String tel;  // 연락처
	
	public static int count = 0;
	
	
}
