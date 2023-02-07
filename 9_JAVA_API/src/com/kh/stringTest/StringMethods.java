package com.kh.stringTest;

import java.util.StringTokenizer;

// 기본적으로 JVM이 임포트를 하고 시작한다.
// import java.lang.*;

public class StringMethods {

	public static void main(String[] args) {
		StringMethods sm = new StringMethods();

		// sm.test1();
		// sm.stringBuffer();
		// sm.stringBuilder();
		sm.split();
		
	}
	
	public void test1() {
		// 문자열 특성
		// 1. 값이 불변성이다.
		// 2. 동일한 값이 이미 들어 있다면,
		//    새로운 문자열을 만들지 않는다.
		
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		String str3 = new String("Hello World!");
		
		// 문자열 == 비교
		// 본래 두 객체의 주소는 달라야 하나
		// 같은 저장 공간을 바라보고 있기 때문에 true로 결과가 나온다.
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + (str1.equals(str2)));
		
		// str3은 new String()의 과정에서 heap 공간에
		// 새로운 문자열을 받을 공간을 선언 후 메모리 할당이
		// 이루어지므로 주소 비교는 불가하다.   --> equals() 메소드가 해결책!
		System.out.println("str1 == str3 ? " + (str1 == str3));
		System.out.println("str1.equals(str3) ? " + (str1.equals(str3)));
		
	}
	
	public void stringBuffer() {
		// 문자열은 안의 내용이 변경될 때마다 새로운 공간을
		// 할당하고 값을 새로 집어 넣는다.
		// 이를 막기 위해 임시공간(buffer)을 하나 준비하여
		// 값을 임시공간 차곡차곡 담아 두었다 한번에 처리해주는
		// 클래스가 StringBuffer / StringBuilder이다
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		System.out.println(sb.hashCode());  // 저장된 메모리의 고유 번호
		
		sb.append(" World!");
		System.out.println(sb.hashCode());
		
		String str = sb.toString();
		System.out.println("결과 : " + str);
	}
	
	public void stringBuilder() {
		// StringBuffer는 동시 제어 기능(Thread Safe) 기능을 가진다.
		// 하지만, 간단한 프로그램 구현이나, 동시 제어를 다른 프로그램이
		// 제공하는 경우 굳이 버퍼까지도 동시 제어를 구현할 필요는 없다! -- Too Much!
		// 따라서 이 기능만 쏙 뺀 클래스를 필요로 하게 되었는데,
		// 그게 바로 StringBuilder 이다!
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		
		System.out.println( sb.hashCode() );
		
		sb.append(" World!");
		
		System.out.println( sb.hashCode() );
		
		String str = sb.toString();
		System.out.println("결과 : " + str);
	}
	
	public void split() {
		
		String str = "수박, 멜론, 빙수, 복숭아, 바다";
		
		String[] strArr = str.split(", ");
		
		for( String s : strArr ) {
			
			System.out.println(s);
			
		}
		
		System.out.println("-----------------------------");
		
		StringTokenizer tokens = new StringTokenizer( str ); // 2021/07/14-12:40:00
		
		while(tokens.hasMoreTokens()) {
			System.out.println( tokens.nextToken(", ") );
		}
		
		System.out.println("-----------------------------");
		
		// join() : 문자열 합치기
		System.out.println(String.join(" - ", strArr));
	}
	
	
}










































