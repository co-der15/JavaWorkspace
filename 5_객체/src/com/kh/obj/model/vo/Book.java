package com.kh.obj.model.vo;

public class Book {

	// 추상화
	// 제목, 저자, 가격, 출판사
	
	// 1. 필드 변수
	private String title;
	private String author;
	private int price;
	private String publish;
	
	// 2. 생성자
	// 직접 선언하지 않으면 기본 생성자를 자동으로 JVM이 만들어 줌
	public Book() {}   // 기본 생성자
	// * 상속 관계에서 기본 생성자는 만들어 주지 않는다.
	//   직접 만드는 것을 원칙으로 한다.
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, int price, String publish) {
		// 다른 생성자를 사용할 때
		// this() 메소드 호칭으로 불러서 사용한다.
		// 또한 this() 메소드는 다른 코드보다 위에 선언되어야 한다.
		this(title, author);
		this.price = price;
		this.publish = publish;
	}
	
	// 3. 기능 제공 메소드
	public void printBook() {
		System.out.println(title + ", " + author +", " + price + ", " + publish);
	}
}






