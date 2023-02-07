package com.kh.wrapperTest;

public class WrapperClass {
	// 래퍼 클래스는
	// 기본 자료형(타입)들을
	// 참조 자료형처럼 사용하여
	// 메소드 기능들, 상수들을 추가하여
	// 제공한다.
	public static void main(String[] args) {
		WrapperClass wc = new WrapperClass();

		wc.test();
	}
	
	public void test() {
		// 문자열 -> 기본 자료형
		// parse
		
		byte b = Byte.parseByte("10");  // 문자열 -> byte
		short s = Short.parseShort("100");
		int i = Integer.parseInt("500");
		long l = Long.parseLong("25000000");
		
		// -----------------------------------
		
		float f = Float.parseFloat("10.5");
		double d = Double.parseDouble("10.123");
		
		// -----------------------------------
		
		boolean bl = Boolean.parseBoolean("true");

		// -----------------------------------
		
		char c = "C".charAt(0);
		
		// -----------------------------------
		
		System.out.println("int 최댓값 : " + Integer.MAX_VALUE);
		System.out.println("int 최솟값 : " + Integer.MIN_VALUE);
		
	}

	public void stringParse() {
		// 기본 자료형 -> 문자열
		
		// String str1 = 100 + "";
		String str1 = String.valueOf(100);
		
		String str2 = String.valueOf(1.234);
		
		String str3 = String.valueOf(false);
		
		String str4 = String.valueOf('A');
		
		
	}
	
}



















