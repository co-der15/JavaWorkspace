package com.kh.ck.model.vo;

public class CoinKing {
	
	private String name;
	private int price;
	private String info;
	private String day;
	
	public CoinKing() { }

	public CoinKing(String name, int price, String info, String day) {
		super();
		this.name = name;
		this.price = price;
		this.info = info;
		this.day = day;
	}
	
	public String ckToString() {
		return name + ", " + price + ", " + info + ", " + day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
}
