package com.kh.excep.my.exception;

public class AgeException extends Exception {
	// 내가 만든 예외 객체
	
	public AgeException() { }
	
	public AgeException(String msg) {
		super(msg);
	}

}
