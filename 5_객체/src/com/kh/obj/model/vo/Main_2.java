package com.kh.obj.model.vo;

public class Main_2 {

	public static void main(String[] args) {
		Human hu1 = new Human();
		
		hu1.name = "홍길동";
		hu1.age = 10;
		hu1.gender = 'M';
		
		// is not visible : 접근 불가!
		// hu1.tel = "01011112222";
		
	}

}
