package com.kh.bank.test.view;

import java.util.Scanner;

import com.kh.bank.test.controller.BankSystem;

public class BankDisplay {
	
	public static void display() {
		
		Scanner sc = new Scanner(System.in);
		BankSystem bs = new BankSystem();
		double amount = 0;
				
	do {
		System.out.println("----------- Six's Bank -----------\n");
		System.out.println("        < 어떤 업무로 오셨습니다까?      \n\n");
		System.out.println("1. 입,출금(Deposit,Withdraw\n\n");
		System.out.println("2. 신규가입(SignUp)\n\n");
		System.out.println("3. 대출(Loan)\n\n");
		System.out.println("4. 사용종료(Exit)");
		System.out.println("------------------------------------");
		System.out.print(" .......>>>> ");
		
		int select = sc.nextInt();
		
		switch(select) {
		case 1 : 
			System.out.println(" :: 입,출금(Deposit, Withdraw) 선택 :: ");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("------------------------------------");
			System.out.print(" .......>>>> ");
			int choose = sc.nextInt();
			if(choose == 1) {
				bs.insertDp();	
			} else if(choose == 2) {
				bs.insertWd();
			}
			break;
		case 2 : 
			bs.insertInfo();
			break;
		case 3 :
			System.out.println(" :: 입,출금(Deposit, Withdraw) 선택 :: ");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("------------------------------------");
			System.out.print(" .......>>>> ");
			int choose1 = sc.nextInt();
			if(choose1 == 1) {
				bs.insertDp();	
			} else if(choose1 == 2) {
				bs.insertWd();
			}
			break;
		case 4 :
			System.out.println("시스템을 종료합니다.");
			System.exit(select);
			}

		}while(true);
	}
}
