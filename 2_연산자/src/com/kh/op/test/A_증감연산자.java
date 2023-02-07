package com.kh.op.test;

public class A_증감연산자 {
	// ++ : +1 연산 의미
	// -- : -1 연산 의미
	
	// 단일로 사용될 경우
	// 어느 위치에서 연산을 수행해도 그 결과가 같다.
	public void testMethod1() {
		int num = 100;
		
		System.out.println("현재 num : " + num);
		
		++num; // 전위 연산
		System.out.println("전위 후 num : " + num);
		
		num++; // 후위 연산
		System.out.println("후위 후 num : " + num);
		
		// num = (num + 1);
		
		--num;
		System.out.println("전위 후 num : " + num);
		
		num--;
		System.out.println("후위 우 num : " + num);
	}
	
	// 다른 연산과 함께 사용할 경우
	public void testMethod2() {
		
		int num = 10;
		
		int result1 = ++num + 3;
		// 전위 연산자 : 어떠한 연산을 함께 수행할 때, 먼저 처리하는 연산
		
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		System.out.println("---------------------");
		
		int num2 = 10;
		
		int result2 = num2++ + 3;
		// 후위 연산자 : 어떠한 연산을 함께 수행할 때, 
		//               해당 연산이 다 끝난 후 처리하는 연산
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
	}
	
}
