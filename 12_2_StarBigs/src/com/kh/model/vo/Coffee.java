package com.kh.model.vo;

public class Coffee {
	// 1. Field
	// 객체의 요소로 담을 공간(Field) 선언
	private String coffeeName;
	private int price;
	private int cups;

	// 2. 생성자
	//   새로운 객체를 만들때 사용하는 특별 메소드
	public Coffee() { }
	
	public Coffee(int type, int cups) {
		setCoffeeName(type);
		setCups(cups);
	}
	
	// Getter & Setter
	public String getCoffeeName() {
		return coffeeName;
	}
	
	public void setCoffeeName(int type) {
		switch(type) {
		case 1: coffeeName = "아포가토";
				price = 6500;
				break;
		case 2 : coffeeName = "아메리카노";
				 price = 5500;
				 break;
		case 3 : coffeeName = "밀크티(프로틴)";
				 price = 12000;
				 break;
		default : 
			coffeeName = "없음";			
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
	}
	
	@Override
	public String toString() {
		return "커피명 : " + coffeeName + ", 가격 : " + price +"원, 잔 수 : " + cups;
	}
}

