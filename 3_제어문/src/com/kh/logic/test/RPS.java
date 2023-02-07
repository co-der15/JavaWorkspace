package com.kh.logic.test;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	// 전역 변수 스캐너
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 가위 바위 보 중 하나를 입력해서
		// 컴퓨터가 낸 가위와 겨루는 프로그램 만들기
		
		System.out.print("입력 : ");
		String player = sc.next();
		String computer = "가위";
		
		// 가위 : 가위 == 무승부
		// 바위 : 가위 == 사용자
		// 보   : 가위 == 컴퓨터
		/* 문자열 비교 */
		// 문자열은 값의 길이가 제한되지 않기 때문에
		// 동적 메모리 공간(Heap)에 담긴다.
		// 하지만, heap에 담기면 값을 직접 가져올 수 없기 때문에
		// 값에 할당받은 주소를 '참조'하게 된다.
		// 따라서 이러한 문자열의 실제 값을 비교하려면,
		// 현재 주소값을 비교하는 '=='이 아닌 '.equals(비교값)'
		// 메소드를 써야 한다.
		
		if ( player.equals(computer) ) {
			
			System.out.println("무승부 입니다!");
		} else if ( player.equals("바위") ) {
			
			System.out.println("당신이 이겼습니다!");
		} else if ( player.equals("보") ) {
			
			System.out.println("컴퓨터가 이겼습니다!");
		} else {
			System.out.println("잘못입력하셨습니다 ㅠ,.ㅠ ");
		}
	}
	
	public void test2() {
		// 숫자를 임의의 수로 뽑아주는 메소드
		
		// 1) Math.random() : 0 ~ 0.99999
		double num1 = Math.random();
		
		System.out.println("num1 : " + num1);
		
		// double --> int
		int num2 = (int)(Math.random() * 10) + 1;  // 1 ~ 10
		
		System.out.println("num2 : " + num2);
		
		// 2) Random.nextInt() : 0부터 지정한 수까지의 임의의 수를 추출
		Random rd = new Random();
		
		System.out.println("rd 숫자 : " + rd.nextInt(10)); // 0 ~ 9
		System.out.println("rd 숫자 + 1 : " + (rd.nextInt(10) + 1)); // 1 ~ 10
		
	}
	
	public void test3() {
		// 컴퓨터에게 0 ~ 2 까지 임의의 수를 고르게 한 후
		// 해당 숫자를 가위, 바위, 보로 바꾸기
		int choice = (int)(Math.random() * 3);  // 0 ~ 2
		
		String computer = "";
		
		switch(choice) {
		case 0 :
			computer = "가위";
			break;
		case 1 :
			computer = "바위";
			break;
		case 2 :
			computer = "보";
			break;
		}
		
		System.out.println("컴퓨터 : " + computer);
	}
	
	public void playGame() {
		// 가위 바위 보 중 하나를 입력하여
		// 컴퓨터와 겨루는 프로그램을 작성하시오.
		// 내가 이길 경우 : 당신이 이겼습니다!  -ㅅ-)/
		// 무승부일 경우 : 아쉽게 비겼습니다!   @_@
		// 내가 졌을 경우 : 컴퓨터가 이겼습니다!
		
		// 입력 안내 문구
		System.out.print("입력 (가위/바위/보) : ");
		String player = sc.next();  
		
		// System.out.println("player : " + player);  // 여기서 한 번 확인!
		// 확인했다면 주석 처리!
		
		// 컴퓨터를 위한 랜덤 숫자
		int choice = (int)(Math.random() * 3); // 0 ~ 2
		
		// System.out.println("choice : " + choice);  // 여기서 한 번 더 확인!
		// 이런 식으로 작은 성공을 만들어 갑시다!
		
		// 컴퓨터 선택 만들기!  -- test3() 메소드의 내용입니다!
		String computer = "";
		
		// 방법 1
		switch(choice) {
		case 0 : 
			computer = "가위";
			break;
		case 1 : 
			computer = "바위";
			break;
		case 2 :
			computer = "보";
			break;
		}
		
		// 방법 2 - 삼항연산자 중첩 사용 버전
		// String computer2 = (choice == 0) ? "가위" : ((choice == 1) ? "바위" : "보");
		// choice 가 0이면 가위를, 아니면 다시 한 번 삼항 연산자 사용!
		
		// 게임 알고리즘!
		// 1) 사용자와 컴퓨터가 같은 걸 냈다면 무승부!
		// 2) 사용자가 가위를, 컴퓨터가 바위를 내거나
		//    사용자가 바위를, 컴퓨터가 보를 내거나
		//    사용자가 보를, 컴퓨터가 가위를 냈다면 컴퓨터 승리!
		// 3) 위의 조건이 아니면 사용자가 승리!
		
		if(player.equals(computer)) {
			System.out.println("아쉽게 비겼습니다!    @_@");
		} else {
			// 비긴 게 아니라면!
			// 방법 1 - 일반적인 값 비교
			if( player.equals("가위") && computer.equals("바위")) {
				System.out.println("컴퓨터가 이겼습니다!");
			} else if ( player.equals("바위") && computer.equals("보")) {
				System.out.println("컴퓨터가 이겼습니다!");
			} else if ( player.equals("보") && computer.equals("가위")) {
				System.out.println("컴퓨터가 이겼습니다!");
			} else {
				System.out.println("당신이 이겼습니다!     -ㅅ-)/ ");
			}
			
			// 방법 2 - boolean 값 활용
			/*
			boolean win = true;
			
			if( player.equals("가위") && computer.equals("바위")) {
				win = false;
			} else if( player.equals("바위") && computer.equals("보")) {
				win = false;
			} else if( player.equals("보") && computer.equals("가위")) {
				win = false;
			}
			
			if( win ) {
				System.out.println("당신이 이겼습니다!    -ㅅ-)/ ");
			} else {
				System.out.println("컴퓨터가 이겼습니다!");
			}
			*/
			
			// 방법 3 - 숫자 비교
			/*
			int playerChoice = 0;
			
			switch(player) {
			case "가위" : 
				playerChoice = 0;
				break;
			case "바위" :
				playerChoice = 1;
				break;
			case "보" :
				playerChoice = 2;
				break;
			default :
				System.out.println("잘못 입력 하셨습니다!");
				return;
			}
			
			//  사용자   :  컴퓨터
			//    0      :    1
			//    1      :    2
			//    2      :    0
			
			if((playerChoice== 2 && choice == 0) || (playerChoice +1 == choice)) {
				System.out.println("컴퓨터가 이겼습니다!");
			} else {
				System.out.println("사용자가 이겼습니다!         -ㅅ-)/ ");
			}
			*/
		}
	}
}





















