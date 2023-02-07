package com.kh.list.sort;

import java.util.ArrayList;

public class SortTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Product("선풍기", 5000, 0.01));
		list.add(new Product("선크림", 15000, 0.05));
		list.add(new Product("붕어빵", 2000, 0.07));
		list.add(new Product("냉짱뽕", 8000, 0.0));
		
		System.out.println("list : " + list);

		// 가격 기준 정렬
		// 가격 오름차순
		list.sort(new AscPrice());
		System.out.println("list : " + list);
		
		// 가격 내링차순
		list.sort(new DescPrice());
		System.out.println("list : " + list);
		
		// 상품명 기준 정렬
		// 상품명 오름차순
		list.sort(new AscName());
		System.out.println("list : " + list);
		
		// 상품명 내림차순
		list.sort(new DescName());
		System.out.println("list : " + list);
		
	}

}










