package com.kh.list.sort;

public class Product {
	
	private String name;
	private int price;
	private double discount;
	
	public Product() { }

	public Product(String name, int price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return name + ", " + price + ", " + discount;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
