package com.kh.view;

import java.util.Scanner;

import com.kh.controller.CoffeeManager;
import com.kh.model.vo.Coffee;

public class CoffeeMenu {

	private static CoffeeManager tom = new CoffeeManager();
	
	// 커피 주문 화면 만들기
	public static void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		/*
		// # 1) 변수로 메뉴 구현하기
		System.out.println("== 기창's StarBigs ==");
		System.out.println("----------------------");
		System.out.println("1. 아포가토");
		System.out.println("2. 아메리카노");
		System.out.println("3. 밀크티 feat.프로틴");
		System.out.println("----------------------");
		System.out.print(" 메뉴 입력 >> ");
		
		int select = sc.nextInt();
		
		System.out.print("몇 잔? >> ");
		int cup = sc.nextInt();
		int price = 0;
		
		String coffeeName = null;
		
		switch(select) {
		case 1:
			coffeeName = "아포가토";
			price = 6500;
			break;
		case 2:
			coffeeName = "아메리카노";
			price = 5500;
			break;
		case 3:
			coffeeName = "밀크티(프로틴)";
			price = 12000;
			break;
		default:
			coffeeName = "없음";
		}
		
		System.out.println("주문하신 커피는 " + coffeeName +" 입니다!");
		System.out.println("총 " + cup + " 잔 입니다!");
		System.out.println("가격은 " + (cup * price) + "입니다. ");
		// 변수 선언 시 재사용이 어렵다.
		*/
		/*
		// # 2 배열
		int[] cup = new int[3];
		
		System.out.println("== 기창's StarBigs ==");
		System.out.println("----------------------");
		System.out.println("1. 아포가토");
		System.out.println("2. 아메리카노");
		System.out.println("3. 밀크티 feat.프로틴");
		System.out.println("----------------------");
		System.out.print(" 메뉴 입력 >> ");
		
		cup[0] = sc.nextInt();
		
		System.out.print("몇 잔? >> ");
		cup[1] = sc.nextInt();
		cup[2] = 0;
		
		String coffeeName = null;
		
		switch(cup[0]) {
		case 1:
			coffeeName = "아포가토";
			cup[2] = 6500;
			break;
		case 2:
			coffeeName = "아메리카노";
			cup[2] = 5500;
			break;
		case 3:
			coffeeName = "밀크티(프로틴)";
			cup[2] = 12000;
			break;
		default:
			coffeeName = "없음";
		}
		
		System.out.println("주문하신 커피는 " + coffeeName +" 입니다!");
		System.out.println("총 " + cup[1] + " 잔 입니다!");
		System.out.println("가격은 " + (cup[1] * cup[2]) + "입니다. ");
		// 변수명을 재사용할 수 있지만
		// 각 배열의 몇 번째에 어떤 값이 들어 있는지 알기 어렵다.
		*/
		
		/*
		// # 3. Coffee 객체를 사용하기
		menu();
		int select = sc.nextInt();
		System.out.print(" 잔 수 >> ");
		int cup = sc.nextInt();
		
		Coffee co = new Coffee(select, cup);
		
		System.out.println("주문하신 커피 정보입니다.");
		System.out.println(co); // toString() 생략됨
		
		// 커피 정보를 처리하는 소스 코드가
		// Coffee 클래스에 담기게 되어 코드가 짧아졌으나
		// 아직 한 잔 밖에 팔지 못한다!
		*/
		
		// # 4 객체 배열을 사용할 경우!
		do {
			
			menu();
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				insertCoffee();
				break;
			case 2:
				printAll();
				break;
			case 3:
				deleteCoffee();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다!");
				return;
			default :
				System.out.println("잘못 입력 하셨습니다!");
			}
			
			
		} while(true);
		
	}
	
	public static void menu() {
		System.out.println("== 기창's StarBigs ==");
		System.out.println("----------------------");
//		System.out.println("1. 아포가토");
//		System.out.println("2. 아메리카노");
//		System.out.println("3. 밀크티 feat.프로틴");
		
		// # 4-1. 객체 배열을 사용할 시 주문 목록 관리 전용 메뉴
		System.out.println("1. 커피 주문");
		System.out.println("2. 주문 내역 확인");
		System.out.println("3. 주문 취소");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------");
		System.out.print(" 메뉴 입력 >> ");
	}
	
	public static void insertCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- 주문 메뉴 ----");
		System.out.println("1. 아포가토");
		System.out.println("2. 아메리카노");
		System.out.println("3. 밀크티(프로틴)");
		
		System.out.print(" 메뉴 선택 >> ");
		int select = sc.nextInt();
		
		System.out.print(" 잔 수 >> ");
		int cup = sc.nextInt();
		
		Coffee co = tom.insertCoffee( new Coffee(select, cup) );
		System.out.println("주문 정보 : " + co);
		
	}
	
	public static void printAll() {
		tom.printAll();
	}
	
	public static void deleteCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 장보 확인 : ");
		int index = sc.nextInt();
		
		tom.deleteCoffee(index);
	}
}


