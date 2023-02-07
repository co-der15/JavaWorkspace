package com.kh.excep.tryCatch.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchTest {
	// 예외처리를 직접 구현하는 연습 클래스
	
	public void method_A() {
		System.out.println("메소드 A 실행합니다!!");
		
		try {
			method_B();
		} catch (Exception e) {
			
			System.out.println("메시지 : " + e.getMessage());
			
		} finally {
			
			System.out.println("예외에 관계없이 실행하는 블록 / 생략 가능");
		}
		
		System.out.println("메소드 A 종료합니다!!");
	}
	
	public void method_B() throws Exception {
		
		System.out.println("메소드 B 실행합니다!");
		
		throw new Exception("강제 예외 상황이 발생했습니다!");
	}
	
	public void ioTest1() {
		// 자바 프로그램은 시스템에 어떠한 데이터를 입력/출력할 때,
		// 직접 이를 처리하지 않고, OS-JVM으로부터 해당 자원을 받아서(빌려옴)
		// 처리한다. 따라서 해당 기능이 완료되면 반납해야 한다.
		// 입력 자원
		BufferedReader br = null;
		
			try {
				br = new BufferedReader( new FileReader("test.txt") );
			
				String str = "";
				
				do {
					str = br.readLine();
					
					if(str != null) {
						System.out.println("내용 : " + str);
					}
				} while(str != null);
			} catch(FileNotFoundException e) {
				
				// e.printStackTrace(); // 빨간 줄 에러 메소드
				System.out.println("파일이 존재하지 않습니다.");
				
			} catch(IOException e) {
				
				System.out.println("파일을 읽는 중 문제 발생! ");
			} finally {
				try {
					br.close();
				} catch(IOException e) {
					System.out.println("반납 도중 문제 발생!");
				}
			}
	}
	
	public void ioTest2() {
		// try with resource
		// try 안에 작성한 입출력 자원을
		// 모두 사용한 후 자동으로 close() 처리하여
		// 해당 자원을 반납하는 구문
		// java 1.7 버전부터!
		
		try (BufferedReader br = new BufferedReader( new FileReader("test.txt"))) {
			
			String str = "";
			
			do {
				
				str = br.readLine();
				if(str != null) {
					System.out.println("내용 : " + str);
				}
				
			} while(str != null);
			
		} catch (Exception e) {
			// 다형성을 활용하여 여러 예외를 한 번에 처리할 수도 있다.
			e.printStackTrace();
		}
	}
}
























