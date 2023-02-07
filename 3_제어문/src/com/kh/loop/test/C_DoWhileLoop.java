package com.kh.loop.test;

import java.util.Scanner;

public class C_DoWhileLoop {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		String msg = null; 
		// 컴퓨터 상 해당 공간에 아직 값이 들어있지 않은 형태
		
		do { // 최초 한 번은 반드시 실행하는 반복문!
			System.out.print("문자열 입력 : ");
			msg = sc.next();
			
			System.out.println(" >> 글자 수 : " + msg.length() );
			
		} while(! msg.equals("나가기"));
		
	}
	
}
