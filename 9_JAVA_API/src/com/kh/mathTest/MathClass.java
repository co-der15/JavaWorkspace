package com.kh.mathTest;

public class MathClass {

	public static void main(String[] args) {
		double num = 3.125;
		
		System.out.println("num : " + num);
		
		// 올림, 버림(내림), 반올림
		System.out.println("round() : " + Math.round(num));
		System.out.println("ceil() : " + Math.ceil(num));
		System.out.println("floor() : " + Math.floor(num));
		
		// 12.345 를 소숫점 둘째자리에서 반올림한다면...?
		double num2 = 12.345;
		
		num2 *= 10; // 123.45;

		System.out.println("결과 : " + Math.round(num2) / 10.0);
		
		// 제곱수 구하기
		int num3 = 5;
		// 5 * 5, 5 * 5 * 5, 5 * 5 * 5 * 5
		
		num3 = (int)Math.pow(num3, 3); // num3의 세 제곱
		
		System.out.println("num3 : " + num3);
	}
}
