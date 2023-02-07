package com.kh.obj.run;

import com.kh.obj.model.vo.Book;
import com.kh.obj.model.vo.FieldTest;
import com.kh.obj.model.vo.Human;

public class Main_1 {

	public static void main(String[] args) {
		// 1. 변수
		// 변수의 개수가 많아지면
		// 각각의 변수를 관리하거나
		// 사용하기 힘들어짐
		/*
		String name = "홍길동";
		int age = 10;
		
		String name2 = "고길동";
		int age2 = 12;
		
		String name3 = "수길동";
		int age3 = 15;
		 */
		
		// 2. 배열
		// 여러 변수를 하나의 배열명으로 관리하기가 편하나
		// 배열의 특징으로 인해 특정 사용자의 정보를
		// 배열의 순서로는 확인하기 어려워짐
		/*
		String[] names = {"홍길동", "고길동", "수길동"};
		int[] ages = { 10, 15, 12 };
		*/
		
		// 3. 객체!!
		// 특정 인물이나 사물에 대한 필요 정보만을 가지는
		// 고유한 개체를 컴퓨터 언어로 표현한 것
		Human hu1 = new Human();
		
		hu1.name = "홍길동";
		
		// Human.count += 1;
		// 접근 제한으로 코드 접근 못함!
		// hu1.age = 10; - is not visible
		
		Human hu2 = new Human();
		
		hu2.name = "고길동";
		
		
		//---------------------------------------
		
		FieldTest ft1 = new FieldTest(750);
		
		// System.out.println(ft1.PI);
		
		FieldTest ft2 = new FieldTest(300);
		
		// System.out.println(ft2.PI);
		
		System.out.println(FieldTest.PI);  // 클래스 변수
		
		System.out.println(ft1.num1);      // 인스턴스 변수
		System.out.println(ft1.num2);
		
		System.out.println(ft2.num1);      // 인스턴스 변수
		System.out.println(ft2.num2);
		
		Book bk1 = new Book();
		
		bk1.printBook();
		
		Book bk2 = new Book("생텍쥐페리", "어린왕자");
		
		bk2.printBook();
		
		Book bk3 = new Book("마시멜로 이야기", "호아킴 더 포사다", 10000, "한국경제신문사");
		
		bk3.printBook();
	}

}

















