package com.kh.excep.inherit;

import java.io.IOException;

public class SuperClass {

	public SuperClass() { }
	
	public void exceptionTest() throws IOException {
		System.out.println("IO 에러가 발생할 경우 던지는 메소드");
	}
}
