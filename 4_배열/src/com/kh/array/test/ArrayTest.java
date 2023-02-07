package com.kh.array.test;

import java.util.Scanner;

public class ArrayTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		// 10명의 학생 국어 점수 관리하기
		int score1 = 80;
		int score2 = 90;
		int score3 = 75;
		// . . .
		
		// 변수가 너무 많으면 해당하는 변수들을
		// 일일이 사용하기 어려워진다.
		// 또한 각 변수 값의 관리, 연산처리도 어려워진다.
		
		// Ah! 같은 자료형끼리 하나로 묶어보자!
		
		// 배열!
		// int[] 배열명;
		// int 배열명[];
		
		int[] arr1 = new int[5];
		
		// [ ][ ][ ][ ][ ]
		//  0  1  2  3  4
		
		arr1[0] = 70;
		arr1[1] = 85;
		arr1[2] = 90;
		arr1[3] = 80;
		arr1[4] = 95;
		// arr1[5] = 100;  - 지정된 범위를 초과할 수 없다
		
		int sum = 0;
		
		for( int i = 0 ; i < arr1.length ; i++) {
			
			sum += arr1[i];
		}
		
		System.out.println("sum : " + sum);
		
	}

	public void test2() {
		// 배열 사용방법
		// 1. 선언
		// 자료형[] 변수명;
		// 자료형 변수명[];
		
		// 배열을 선언하면 Heap 메모리에 
		// 배열의 크기만큼 공간이 할당된다(빌려온다)
		// 가장 앞에 있는 값의 주소를 가져와 stack 메모리에 저장한다.

		// ** 참조 자료형 **
		// String, 배열과 같이 Heap 메모리에
		// 값을 저장하는 변수들은 메모리 고유 주소번지값을
		// 가지는데, 이렇게 new로 생성하여 주소를
		// '참조하여 가져온다' 라는 표현을 써서 참조 자료형이라 부른다.
		
		// 공간만 할당하는 경우
		int[] arr = new int[5];
		
		// 배열의 값으로 초기화하여 선언하는 경우
		int[] arr2 = new int[] {1, 2, 3, 4, 5};
		
		// short hand : 축약형
		int[] arr3 = { 10, 20, 30, 40, 50 };
		
		// 배열의 길이와 값을 모두 선언하는 경우 - 못믿는다, 휴먼! (ERROR)
		// int[] arr4 = new int[5] { 1, 2, 3, 4, 5 }; 
		
		// int 타입(자료형)말고도 배열 선언 가능하다
		char[] arr5 = {'H', 'e', 'l', 'l', 'o'};
		
		System.out.println("arr5 : " + arr5);
	}
	
	public void testCopy() {
		// 얕은 복사와 깊은 복사
		// 1. 얕은 복사
		//  배열의 주소만 복사하는 방법
		
		int[] origin = { 1, 2, 3 };
		int[] copy   = origin;
		
		//원본의 내용 바꾸기
		origin[1] = 5;
		
		// 안의 내용 출력하기
		for( int i = 0 ; i < origin.length ; i++) {
			
			System.out.println("원본 : " + origin[i]);
			
		}
		
		System.out.println("-------------------------------");
		
		for( int i = 0 ; i < copy.length ; i ++) {
			
			System.out.println("사본 : " + copy[i]);
		}	
	}
	
	public void testCopy2() {
		// 2. 깊은 복사
		// 배열의 주소가 아닌 실제 배열의 값들을
		// 복사하여 새로운 배열을 만드는 방법
		
		int[] origin1 = { 1, 2, 3, 4, 5 };
		int[] copy1   = new int[origin1.length];
		
		// 1) for 반복문을 사용하는 방법
		/*
		for( int i = 0 ; i < origin1.length ; i++) {
			copy1[i] = origin1[i];
		}
		*/
		
		// 2) System.arraycopy(복사할 원본 배열, 복사 시작번호,
		//                     사본 배열, 복사해서 넣을 시작 번호, 복사할 갯수)
		// System.arraycopy(origin1, 0, copy1, 0, origin1.length);
		
		// 3) clone() 메소드 사용하기
		copy1 = origin1.clone();
		
		origin1[2] = 7;
		
		// 출력
		for(int i = 0 ; i < origin1.length ; i++) {
			System.out.println("원본 : " + origin1[i]);
			System.out.println("사본 : " + copy1[i]);
		}
	}
	
	public void silsub1() {
		// 1~ 100까지 수 중 하나의 정수를
		// 총 다섯번 입력받아 배열의 각 방에 저장한 후
		// 이를 합하여 출력하는 기능을 구현하시오.
		
		int[] save = new int[5];
		
		// 입력부
		for(int i = 0; i < save.length; i++) {  // 다섯번 반복 준비!
			System.out.print("\n정수 입력 : ");
			save[i] = sc.nextInt();
		}
		
		// 출력부
		int sum = 0;
		for(int i = 0; i < save.length; i++) {
			sum += save[i];
		}
		
		System.out.println("sum : " + sum);
	}
	
	public void silsub2() {
		// 그 날도 어제와 같이 배가 무척 고픈 날이었다.
		// 그는 오늘도 어김없이 '엄마의 손맛'에 가서
		// 햄버거를 주문했다. 
		// 햄버거 1개는 4100원, 감자튀김은 1500원,
		// 콜라는 1캔 700원
		// 그는 햄최몇의 국가 대표이다.
		// 햄버거 5개는 먹어야 한다. 
		// 여기에, 감자튀김 2개, 콜라 3개를 추가 주문하였다.
		// 결제를 하려는데, 금액이 어디...
		// 어라... 총 얼마였지...
		// 계산기를 찾아 가방을 뒤져보다 이클립스를 발견했다.
		// 그래, 코드로 이 상황을 해결해보자!
		
		// [문제] 위와 같이 여러 음식을 여러 개 주문 하였을 때
		//          총 결제 금액이 얼마인지 산출하는
		//          프로그램을 작성하시오.
		
		// ------------ 메뉴 입력부 ------------
		// 1 버전
		int[] save = new int[3];
		
		System.out.print("햄버거 : ");
		save[0] = sc.nextInt();
		
		System.out.print("감자튀김 : ");
		save[1] = sc.nextInt();
		
		System.out.print("콜라 : ");
		save[2] = sc.nextInt();
		/*
		 * 2 버전
		String[] menuList = {"햄버거", "감자튀김", "콜라" }; 
		// 0, 2, 4 번 공간 : 가격 저장
		// 1, 3, 5 번 공간 : 갯수 저장
		int[] selectList = {4100, 0, 1500, 0, 700, 0};
		
			for(int i = 0 ; i < menuList.length ; i++) {
				System.out.print(menuList[i] + ": ");
				selectList[(2 * i) + 1] = sc.nextInt();
				// (2 * i + 1) = 1, 3, 5 
		}
		 */
		
		
		// ------------ 합계 계산부 ------------
		int sum = 0;
		// 1 버전
		int[] price = { 4100, 1500, 700 };
		
		for(int i = 0 ; i < 3 ; i++) {
			sum += (save[i] * price[i]);
		}
		/*
		 * 2 버전
		for(int i = 0 ; i < 6 ; i += 2) {
			sum += (selectList[i] * selectList[i + 1]);
		} 
		 */
		
		// ------------ 결과 출력부 ------------
		// %d = 정수 표현 / %,d = 정수에 천단위 쉼표 표현
		System.out.printf("합계 : %,d 원", sum);
	}
	
	public void test3() {
		// 배열의 단점 :
		// 1) 한 번 길이를 선언하면, 변경이 불가능하다
		// 2) 같은 타입(자료형)끼리만 묶을 수 있다
		
		int[] arr = new int[5];  // 0 ~ 4 : 5개
		
		arr[4] = 100;
		
		// ArrayIndexOutOfBoundsException : 배열의 범위 초과 시 발생하는 에러
		// arr[7] = 500;
		
		// 음수도 배열의 순서로 선언 불가
		// arr[-1] = 10;
		
		// 같은 자료형이 아니면 값을 받지 않는다.
		// arr[2] = "안녕!";
	}
}






















