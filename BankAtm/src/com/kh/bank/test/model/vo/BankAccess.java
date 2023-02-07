package com.kh.bank.test.model.vo;

public class BankAccess {
	
	private String name;
	private String accountNo;
	private int password;
	private double balance;
	
	public BankAccess() { }
	
	public BankAccess(String name, String accountNo, int password, double balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.password = password;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccess [name=" + name + ", accountNo=" + accountNo + ", password=" + password + ", balance="
				+ balance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
