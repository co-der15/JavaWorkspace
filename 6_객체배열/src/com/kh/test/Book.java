package com.kh.test;

public class Book {
	// 1. Fields
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	// 2. Constructor
	public Book() { }
	
	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	// 3. Methods
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
}
