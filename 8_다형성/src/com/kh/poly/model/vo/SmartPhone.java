package com.kh.poly.model.vo;

public class SmartPhone extends Product {

	public SmartPhone() { }

	public SmartPhone(String modelName, int price) {
		super(modelName, price);
	}
	
	// 스마트폰 전용 메소드
	public void playApp() {
		
		System.out.println("과자런 왕국 하는 중....");
		
	}
}
