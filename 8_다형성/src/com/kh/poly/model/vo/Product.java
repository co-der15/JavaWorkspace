package com.kh.poly.model.vo;

public class Product {
	
	private String modelName;
	private int price;
	
	public Product() { }

	public Product(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [modelName=" + modelName + ", price=" + price + "]";
	}
	
}
