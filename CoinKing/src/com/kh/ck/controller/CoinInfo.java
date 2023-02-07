package com.kh.ck.controller;

import java.util.Scanner;

import com.kh.ck.model.vo.CoinKing;

public class CoinInfo {

	CoinKing[] ckArr = new CoinKing[3];

	{
		ckArr[0] = new CoinKing("도지코인", 1200, "+20%", "7월 11일");
		ckArr[1] = new CoinKing("비트코인", 10000, "-10%", "7월10일");
		ckArr[2] = new CoinKing("피플", 365, "+5%", "7월 9일");

	}
	
	String computer = "";
	Scanner sc = new Scanner(System.in);
	
	public void random() {
		int choice = (int)(Math.random() * 2 + 1);
		
		if(choice == 1) {
			computer = "상승";
		}else if(choice == 2) {
			computer = "하락";
		};
		
		System.out.println(computer + " 중입니다.");
		if(choice == 1) {
			System.out.println("축하드립니다 \n\n");
		} else if(choice == 2){
			System.out.print("존버하겠습니다? Y/N : ");
			char ch = sc.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				System.out.println("떡상을 기원합니다. 화상 갈끄니까~ \n\n");
			}else if(ch == 'N' || ch == 'n') {
				System.out.println("손절한 당신의 승자입니다. \n\n");
			}
		}
		}
	
	public void doji() {
		System.out.println(ckArr[0].ckToString());
	}
	
	public void beatCoin() {
		System.out.println(ckArr[1].ckToString());
	}
	
	public void ripple() {
		System.out.println(ckArr[2].ckToString());
	}

}
