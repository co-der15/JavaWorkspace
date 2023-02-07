package com.kh.prod;

public class Product {

	private String name;
	private int price;
	private int quantity;
	// Crtl + F / 바꾸기
	
	public Product() {}
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price =price;
		this.quantity = quantity;
	}
	
	/*
	public Product(int quantity, int price, String name) {
		this(name, price, quantity);
	}
	*/
	
	public String information() {
		
		// return name + ", " + price + ", " + quantity;
		return "상품명 : " + name + "\n"
			 + "가격 : " + price + " 원\n"
			 + "수량 : " + quantity +" 개";
		
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
