package com.kh.bank.test.controller;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.bank.test.model.vo.BankAccess;

public class BankSystem extends BankAccess {
	
	public static final int SIZE = 10;
	
	private BankAccess[] bankArr = new BankAccess[SIZE];
	
	private static int count;
	
	Scanner sc = new Scanner(System.in);
	{
		//bankArr[0] = new BankAccess("황학규", "132-2645-45952");
		bankArr[0] = new BankAccess("m", "132", 1234, 100);
		bankArr[1] = new BankAccess("b", "456", 4567, 200); 
		
		count = 2;
	}
	
	public BankSystem() {}

	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		BankSystem.count = count;
	}
	
	public boolean checkName(String name1) {
		boolean result = false;
		
		for(int i = 0; i < bankArr.length; i++) {
			if(bankArr[i] == null) {
				break;
			}
			
			result = bankArr[i].getName().equals(name1);
			
			if(result == true) {
				break;
			}
		}
		return result;
	}
	
	public boolean checkAccountNo(int accNo) {
		boolean result = false;
		
		for(int i = 0; i < bankArr.length;i++) {
			if(bankArr[i] == null) {
				break;
			}
			result = bankArr[i].getAccountNo().equals(accNo);
			
			if(result == true) {
				break;
			}
		}
		return result;
	}
	double amount = 0;
	
	public void insertDp() {
		
		System.out.println("입금 금액 입력 : ");
		amount = sc.nextDouble();
		
		if(amount <= 0) {
			System.err.print("입력이 잘못됐습니다.");
		}else {
			for(int i = 0; i < bankArr.length; i++) {
				
			}
		}
	
	}
	public void insertWd() {
		
		System.out.println("출금 금액 입력  : ");
		amount = sc.nextDouble();
		
		if(this.getBalance() >= amount) {
			
		}
		
	}

	public void insertInfo() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		for(int i = 0; i <= 13; i++) {
			int num = (int)(Math.random() * 10);
			String accountNo = Integer.toString(num);
			System.out.print(accountNo);
		}		
		System.out.println("\n");
		System.out.println("비밀번호 : ");
		int password = sc.nextInt();
		
		setBalance(0);
		
		bankArr[count] = new BankAccess(name, getAccountNo(), password, getBalance());
		
		System.out.println("회원 등록이 되었습니다.\n");
		
		count++;
			
	
		
	}

	
}

















