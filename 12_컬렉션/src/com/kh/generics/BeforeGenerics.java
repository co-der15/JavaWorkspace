package com.kh.generics;

import java.util.ArrayList;

public class BeforeGenerics {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add( new Book());
		list.add(new Coffee());
		list.add( new Student());
		
		System.out.println("list 크기 :" + list.size());
		System.out.println(list);
		
		for(int i =0; i < list.size();i++) {
			
			Object obj = list.get(i);
			
			if( obj instanceof Book) {
				Book bk = (Book)obj;
				bk.read();
			} else if (obj instanceof Coffee) {
				Coffee co = (Coffee)obj;
				co.drink();
			} else if (obj instanceof Student) {
				Student stu = (Student)obj;
				stu.study();
			}
			
			
			//Book bk = list.get(i);
		}
	}
}

class Book {
	private int bno; // 책번호
	
	public Book() { }
	
	public void read() {
		System.out.println("책을 읽습니다!");
	}
}

class Coffee {
	private String name; // 커피명
	
	public Coffee() {}
	
	public void drink() {
		System.out.println(name + " 를 마십니다!");
	}
}

class Student {
	private String name; // 학생명
	
	public Student() { }
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}

