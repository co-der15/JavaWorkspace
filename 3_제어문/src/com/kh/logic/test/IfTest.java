package com.kh.logic.test;

import java.util.Scanner;

public class IfTest {
	/*
	 * 특정 조건을 만족 시킬 때 실행할 코드를 작성하는 문법
	 * ( 순서도 상 마름모 )
	 */
	
	public void test1() {
		// 기본적인 if문
		// 마스크 착용해주세요.
		// 마스크 착용 유무를 입력받아
		// 마스크를 착용해주세요 / 이용해 주셔서 감사합니다!
		// 문구 화면에 출력하기!
		
		Scanner sc = new Scanner(System.in);
		
		// 안내문구
		System.out.print("마스크 착용 하셨나요? <Y/N> :");
		char ch = sc.next().charAt(0);
		
		if( ch == 'Y' ) {
			// 만약 'Y'를 입력 했다면
			System.out.println("이용해 주셔서 감사합니다.");
		} else {
			System.out.println("마스크를 착용해 주세요!");
		}
	}
	
	public void test2() {
		// 조건에 따른 결과가 3개 이상일 경우
		// if와 else if 조건문을 사용한다.
		// 국어, 영어, 수학 점수를 입력받아
		// 평균에 따른 성적 구하기
		
		/*
		 * -- 점수 기준 --
		 * 평균 : 90점 이상 ( A )
		 *        80점 이상 ( B )
		 *        70점 이상 ( C )
		 *        60점 이상 ( D )
		 *        아니면 ...( F )
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		
		String grade = "";
		
		if( avg >= 90 ) {
			grade = "A";
		} else if( avg >= 80 ) {
			grade = "B";
		} else if( avg >= 70 ) {
			grade = "C";
		} else if( avg >= 60 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("당신은 " + grade + " 학점입니다.");
		
		
	}
	
	public void test3() {
		// 자판기 if 버전
		/*
		 * -- 음료 정보 --
		 * 
		 * 코카콜라 - 1500원
		 * 데자와   - 2000원
		 * 코코아   - 2500원
		 * 닥터페퍼 - 7600원
		 * 사이다   - 1200원
		 * 맥콜     - 500원
		 * 
		 */
		
		// 1. 메뉴판 만들기
		System.out.println("-- 홍길동's 자판기 프로그램 ver 1.0 --");
		System.out.println("1.  코카콜라");
		System.out.println("2.  데자와");
		System.out.println("3.  코코아");
		System.out.println("4.  닥터페퍼");
		System.out.println("5.  사이다");
		System.out.println("6.  맥콜");
		System.out.println("--------------------------------------");
		System.out.print(" >> 메뉴 선택 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int menu = sc.nextInt();
		
		String drink = "";
		int price = 0;
		
		if( menu == 1) {
			drink = "코카콜라";
			price = 1500;
		} else if (menu == 2) {
			drink = "데자와";
			price = 2000;
		} else if (menu == 3) {
			drink = "코코아";
			price = 2500;
		} else if (menu == 4) {
			drink = "닥터페퍼";
			price = 7600;
		} else if (menu == 5) {
			drink = "사이다";
			price = 1200;
		} else if (menu == 6) {
			drink = "맥콜";
			price = 500;
		} else {
			System.out.println("주문하신 번호는 없는 번호입니다.");
			
			return; // 해당 메소드를 강제 종료하고 호출한 곳으로 돌아감
		}
		
		System.out.println("주문하신 음료는 " + drink +" 입니다.");
		System.out.println("가격은 " + price + " 입니다.");
	}
	
	public void test4() {
		// 국어, 영어, 수학 점수를 입력받아
		// 평균에 따른 성적 구하기
		
		/*
		 * -- 점수 기준 --
		 * 평균 : 90점 이상 ( A ) --> 95점 이상 A+
		 *        80점 이상 ( B ) --> 85점 이상 B+
		 *        70점 이상 ( C ) --> 75점 이상 C+
		 *        -- 각 점수가 5점대 이상이면 '+'를 추가한다.
		 *        60점 이상 ( D )
		 *        아니면 ...( F )
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		
		String grade = "";
		
		if( avg >= 90 ) {
			grade = "A";
			
			if ( avg >= 95) {
				// grade = grade + "+";    // A+
				grade += "+";
			}			
		} else if ( avg >= 80 ) {
			grade = "B";
			
			if( avg >= 85) {
				grade += "+";
			}
		} else if ( avg >= 70 ) {
			grade = "C";
			
			if( avg >= 75) {
				grade += "+";
			}
		} else if ( avg >= 60 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



