package com.kh.poly.model.vo;

public class Tablet extends Product {

	public Tablet() { }

	public Tablet(String modelName, int price) {
		super(modelName, price);
	}
	
	// 타블렛 전용 메소드
	public void write() {
		System.out.println("수업 내용 필기 중...");
	}

}
