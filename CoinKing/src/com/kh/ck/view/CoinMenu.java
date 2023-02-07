package com.kh.ck.view;

import java.util.Scanner;

import com.kh.ck.controller.CoinInfo;

public class CoinMenu {
	
	public static void display() {
			
		Scanner sc = new Scanner(System.in);
		CoinInfo ci = new CoinInfo();
		
		do {	
			System.out.println(" --- 6조s 코인 프로그램 ver 1.0 --- ");
			System.out.println("1) 도지코인");
			System.out.println("2) 비트코인");
			System.out.println("3) 리플");
			System.out.println("-------------------------------");
			System.out.print(">> 코인 선택 : \n ");
			
			int coin = sc.nextInt();
			
			switch(coin) {
			case 1 :
				ci.doji();
				ci.random();
				break;
			case 2 :
				ci.beatCoin();
				ci.random();
				break;
			case 3 :
				ci.ripple();
				ci.random();
			}					
		}while(true);
		
}

	}
