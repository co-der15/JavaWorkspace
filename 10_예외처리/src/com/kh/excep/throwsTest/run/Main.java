package com.kh.excep.throwsTest.run;

import com.kh.excep.throwsTest.controller.ThrowsTest;

public class Main {

	public static void main(String[] args) {
		
		ThrowsTest th = new ThrowsTest();
		
		try {
			
			th.method_A();
			
			System.out.println("-- 정상 실행 확인 --");
			
		} catch (Exception e) {
			System.out.println("실행 중 문제가 발생했습니다!");
			
			e.printStackTrace();
		} finally {
			
			System.out.println("예외 발생 여부와 관계없이 실행합니다!");
		}
		
			
	}

}
