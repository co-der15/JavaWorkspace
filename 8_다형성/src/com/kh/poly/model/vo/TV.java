package com.kh.poly.model.vo;

public class TV extends Product {
	// Product 클래스의 정보를 모두 가져오는 '상속'이다!

	public TV() { }

	public TV(String modelName, int price) {
		super(modelName, price);
	}
	
	// TV 전용 메소드
	public void watch() {
		System.out.println("TV 대탈출 시즌 4 보는 중...");
	}
	
}
