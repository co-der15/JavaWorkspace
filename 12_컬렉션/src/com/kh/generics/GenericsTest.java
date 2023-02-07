package com.kh.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		// 컬렉션(list, set, map)은 여러가지 자료형을 받을 수 있따
		// Object로 상향 형변환하여 데이터를 처리하기 때문이다.
		
		// Book --> Object / Coffee --> Object
		// Book --> Book (!)
		// <> : 제네릭스
		ArrayList<Book> list1 = new ArrayList<>();
		
		list1.add(new Book());
		list1.add(new Book());
		// list1.add(new Coffee());
		// Book 외의 다른 타입은 들어 가 수 없다
		
		// forEach
		// list1에는 책만 들어가니까!
		for(Book bk  : list1) {
			bk.read();
		}
		
		ArrayList<Coffee> list2 = new ArrayList<>();
		
		list2.add(new Coffee());
		list2.add(new Coffee());
		
		GenericsTest test = new GenericsTest();
		
		test.printBook(list1);
		// test.printBook(list2);
		// 매개변수에도 제네릭을 적용할 수 있다!
		
		//-------------------------------------
		// map은 key, value 각각 제네릭을 적용해야 한다!
		HashMap<String, Book> map = new HashMap<>();
		
		map.put("어린왕자", new Book());
		map.put("콩쥐팥쥐", new Book());
		map.put("스폰지", new Book());
		map.put("나의라임오렌지나무", new Book());
		
		// value()로 값을 꺼낼 경우
		ArrayList<Book> result = new ArrayList<>(map.values());
		
		
		MyGenerics<Integer> my1 = new MyGenerics<>();
		
		MyGenerics<String> my2 = new MYGenerics<>();
	}
	
	public void printBook(List<Book> list) {
		for(Book a : list) {
			a.read();
		}
	}
	
	public void printCoffee(List<Coffee> list) {
		for(Coffee c : list) {
			c.drink();
		}
	}

}

class MyGenerices<T> {
	
	private T[] array;
	
	public void print() {
		for(T t : array);
			System.out.println(t);
	}
}




























