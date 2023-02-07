package com.kh.var;

public class CastingTest {
	
	public void castMethod1() {
		/*
		 * 본래 컴퓨터는 어떠한 값을 처리할 때
		 * 같은 자료형끼리만 계산이 가능하다.
		 * 
		 * 하지만, 다른 자료형과도 계산이 필요한 순간이
		 * 종종 있을 수 있기 때문에 각각의 자료형으로
		 * 변환해주는 캐스팅(형변환) 기술을 제공한다.
		 * 
		 * 기본적으로 정수형은 실수형으로 자동 형변환이 가능하며,
		 * 실수형은 정수형으로 자동 형변환이 불가능하다.
		 * 
		 * 또한 각각의 자료형이 다르더라도
		 * 해당 자료형 크기보다 바꾸고자 하는 자료형의 크기가
		 * 더 큰 경우 자동으로 형변환 해준다.
		 * 
		 * 1byte --> 2byte
		 */
		
		// 자동 형변환이 일어나는 경우
		// char --> int 
		char ch1 = '안';
		System.out.println("결과 확인 : " + ch1);
		
		int num1 = '안';
		System.out.println("결과 확인 : " + num1);
		
		char ch2 = 97;
		System.out.println("결과 확인 : " + ch2);
		
		// Type mismatch: cannot convert from int to char
		// 문자는 음수로 선언할 수 없다!
		// char ch3 = -97; // 0 ~ 65535
		
		// int 자료형은 4byte이기 때문에
		// 2byte char형에 옮겨 담을 수 없다.
		// 이 때에 우리가 강제로 해당 값을 
		// 담길 원한다면 '강제 형변환'을 할 수 있다.
		// 변수 앞에 (바꿀 자료형)
		int num2 = 300;
		char ch3 = (char)num2;
		
		System.out.println("결과 확인 : " + ch3);
		
		// 실수형 데이터 간 값 손실 확인
		double dnum = 1.2345678912345;
		
		System.out.println("결과 확인 : " + dnum);
		
		float fnum = (float)dnum;
		
		System.out.println("결과 확인 : " + fnum);
		
	}
	
	public void castMethod2() {
		// 다른 두 자료형 간의 사칙연산 수행하기
		// 두 자료형 중 더 큰 범위의 
		// 자료형으로 자동 형변환이 발생한다.
		int num1 = 100;
		long num2 = 500l;
		
		System.out.println(num1 + num2);
		
		long result1 = num1 + num2;
		
		System.out.println("result1 : " + result1);
		
		// 자료형에 관계없이 강제 형변환을 시킬 경우
		int result2 = (int)(num1 + num2);
		
		System.out.println("result2 : " + result2);
		
		// 데이터 처리가 가능한 가장 큰 자료형(Type)으로 선언하는 경우
		double result3 = num1 + num2;
		
		System.out.println("result3 : " + result3);
		
		
		// ** byte와 short 자료형을 연산에 사용하는 경우
		//    그 연산의 결과는 무조건 int로 변형된다.
		byte b1 = 120;
		short s1 = 430;
		
		// short result4 = b1 + s1;
		int result4 = b1 + s1;
		
		System.out.println("result4 : " + result4);
	}
}















