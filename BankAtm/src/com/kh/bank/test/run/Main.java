package com.kh.bank.test.run;

import java.util.Scanner;

import com.kh.bank.test.controller.BankSystem;
import com.kh.bank.test.model.vo.Bank_Dp_Wd;
import com.kh.bank.test.view.BankDisplay;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankSystem bs = new BankSystem();
		
		
		System.out.println(":: SIX's BANK LOADING ::");
		
		System.out.print("이름 입력 : ");
		String name1 = sc.next();
		
		System.out.print("계좌번호 입력 : ");
		int accNo = sc.nextInt();
		System.out.println("\n");
		
		if(bs.checkName(name1) && bs.checkAccountNo(accNo)) {
			bs.getBalance();
			System.out.println("\n\n");
			BankDisplay.display();
		} else {
			System.out.println("정보가 없습니다.");
			BankDisplay.display();
		}

		System.out.println(" :: ENDING SYSTEM :: ");

	}

}
