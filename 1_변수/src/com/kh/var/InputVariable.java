package com.kh.var;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputVariable {
	// 입출력 기능 제공 메소드 활용하기
	
	// java 1.5 버전
	/*
	public void inputMethod() {
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 입력 : ");
		
		try {
			String value = rd.readLine();
			
			int result = Integer.parseInt(value);
			
			System.out.println("입력하신 숫자는 " + result +" 입니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
	
	
	public void inputMethod2() {
		// System.in  : 키보드 입력
		// System.out : 모니터 출력
		// System.err : 표준 에러 출력
		
		// Scanner : 각각의 자료형 별로 
		//           키보드 입력값을 처리하는 객체
		
		// Ctrl + Shift + 'O' : 자동 임포트
		Scanner sc = new Scanner(System.in);
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// 풀 패키지명(풀 클래스명) : 사용하려는 자바 클래스 파일의 이름을
		//                            해당 클래스가 속한 모든 패키지 명으로 선언하는 것
		
		// 키보드 입력값을 받아줄 변수 공간 선언
		String name;  // 이름 : 문자열
		int point;    // 점수 : 정수
		double avg;   // 평균 : 실수
		
		// 화면에 이름 입력을 위한 안내 메세지 출력
		System.out.print("이름:");
		name = sc.next();
		
		System.out.print("점수:");
		point = sc.nextInt();
		
		System.out.print("평균:");
		avg = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + point);
		System.out.println("평균 : " + avg);
	}
	
	public void myInputMethod() {
		// 실습 1.
		// 기본 자료형 3가지 이상을 사용하여
		// 도서의 정보를 입력받는 프로그램을 만들어 보자!
		// 단, Scanner를 사용하고, 변수의 이름은 성의있게
		// 직접 지어서 사용해보기
		
		String bookTitle;
		int bookPrice;
		double discount;
		boolean stock;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서 가격 : ");
		bookPrice = sc.nextInt();
		
		sc.nextLine();  // 엔터값 제거
		System.out.print("도서 명 : ");
		bookTitle = sc.nextLine();
		
		System.out.print("도서 할인율 : ");
		discount = sc.nextDouble();
		
		System.out.print("도서 재고 유무 : ");
		stock = sc.nextBoolean();
		
		System.out.println("--------------------------");
		
		// 1 번 방법
		System.out.println("도서 명 : " + bookTitle);
		System.out.printf("도서 가격 : %d\n", bookPrice);
		System.out.printf("도서 할인율 : %.3f%% \n", discount);
		System.out.printf("도서 재고 유무 : %b \n", stock);
		
		// 2번 방법
		/*
		System.out.printf("도서 명 : %s\n도서 가격 : %d\n도서 할인율 : %.3f\n도서 재고 유무 : %b", 
				bookTitle, bookPrice, discount, stock);
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
