package com.kh.logic;

public class BeforeLogic {

	public static void main(String[] args) {
		// 조건문은 어떠한 연산의 결과가 참이냐 거짓이냐에 따라
		// 수행하는 코드를 선택할 수 있다.
		
		int min = 10, max = 99;
		double mass = 10.0;
		boolean check = false;
		char ch = 'a';
		
		// ------------------------------- //
		// 위의 변수 5개를 활용하여
		// 비교 연산자와 일반 논리 연산자를 적절히
		// 섞어 true / false 결과를 각각 10개 씩 만들어보기

		// -- true 10 개
		System.out.println("true  결과 1  : " + (min == mass && max > ch));
		System.out.println("true  결과 2  : " + (min < max));
		System.out.println("true  결과 3  : " + ( min == mass ) );
		System.out.println("true  결과 4  : " + ( ch != 100 ) );
		System.out.println("true  결과 5  : " + ( mass != min || mass < max ) );
		System.out.println("true  결과 6  : " + ( ch != min || min > ch ) );
		System.out.println("true  결과 7  : " + ( ch > min || ch < max ) );
		System.out.println("true  결과 8  : " + ( max >= mass && max > ch ) );
		System.out.println("true  결과 9  : " + ( !check ) );
		System.out.println("true  결과 10 : " + ( check == false ) );
		
		// -- false 10 개
		System.out.println("false 결과 1  : " + (min > max && ch < min));
		System.out.println("false 결과 2  : " + (ch > max));      
		System.out.println("false 결과 3  : " + (ch < min && ch < max));      
		System.out.println("false 결과 4  : " +  ( min > max ) );            
		System.out.println("false 결과 5  : " +  ( ch == 100 ) );            
		System.out.println("false 결과 6  : " +  ( mass != min || mass > max ) );            
		System.out.println("false 결과 7  : " +  ( check ) );            
		System.out.println("false 결과 8  : " +  ( check == true ) );            
		System.out.println("false 결과 9  : " +  ( (min + mass) == max ) );            
		System.out.println("false 결과 10 : " +  ( ch == 'A' ) );     
	}

}
