package com.kh.bank.test.model.vo;

public class Bank_Dp_Wd {
	
	private String name;
	private int AccNo;
	private double balance;
	
	public Bank_Dp_Wd(String n, int a, double amount) {
		name = n;
		AccNo = a;
		balance = amount;
	}

	public Bank_Dp_Wd(String n, int a) {
		name = n;
		AccNo = a;
		balance = 0.00;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.err.println("입력이 잘못 됬습니다. 다시 입력하세요.");
		}else {
			this.balance += amount;
			System.out.format("%.2f 원이 입금됬습니다\n", amount);
		}
	}
	
	public void withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
			System.out.format("%.2f 원이 출금됬습니다\n", amount);
		} else {
			System.err.println("잔액 부족으로 출금이 불가능합니다. 잔액 확인을 부탁드립니다.");
		}
	}
	
	public double getBalance() {
	System.out.format("%.2f 원입니다\n", balance);
		return balance;
	}
	
}
