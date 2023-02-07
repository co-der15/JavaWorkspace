package com.kh.logic.test;

import java.util.Scanner;

public class SwitchTest {

	public void test1() {
		// 자판기 switch 버전
		/*
		 * 나나콘 - 700원
		 * 차카니 - 1500원
		 * 아폴로 - 3500원
		 * 라면땅 - 1000원
		 * 밭두렁 - 1300원
		 * 꾀돌이 - 800원
		 */
		System.out.println("-- 고길동's 자판기 프로그램 ver 1.0 --");
		System.out.println("1. 나나콘");
		System.out.println("2. 차카니");
		System.out.println("3. 아폴로");
		System.out.println("4. 라면땅");
		System.out.println("5. 밭두렁");
		System.out.println("6. 꾀돌이");
		System.out.println("---------------------------------------");
		System.out.print(" >> 메뉴 선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		String snack = "";
		int price = 0;
				
		switch(menu) {
		
		case 1 :  // if( menu == 1 )
			snack = "나나콘";
			price = 700;
			break;
		case 2 :
			snack = "차카니";
			price = 1500;
			break;
		case 3 :
			snack = "아폴로";
			price = 3500;
			break;
		case 4 :
			snack = "라면땅";
			price = 1000;
			break;
		case 5 : 
			snack = "밭두렁";
			price = 1300;
			break;
		case 6 : 
			snack = "꾀돌이";
			price = 800;
			break;
		default : 
			// if 로 따지면 else 의 역할
			System.out.println("해당 번호는 없는 번호입니다.");
			return;
		}
		
		System.out.println("주문하신 스낵은 " + snack + " 입니다.");
		System.out.printf("가격은 %d 입니다. \n", price);
		
	}
	
	public void test2() {
		// 만약 break가 없다면!
		// fall-through (폴스루 현상)
		// switch에서 각 case 별로 break; 를
		// 사용하지 않으면, 밑의 case도 마저
		// 실행해버리는 현상
		
		// 일반적으로 폴스루현상을 방지하여
		// 코드를 클린하게 작성하여야 하나
		// 경우에 따라 이를 응용하는 방법도 있다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num%10) {
		case 1 : case 3 : case 5 : case 7 : case 9 :
			System.out.println("홀수입니다!");
			break;
		case 2 : case 4 : case 6 : case 8 :
			System.out.println("짝수입니다!");
			break;
		default :
			System.out.println("0으로 입력 하셨습니다!");
		}
	}
	
}

















