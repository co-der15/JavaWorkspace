package com.kh.list.sort;

import java.util.Comparator;

public class AscPrice implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		
		// 100 - 200 = -100
		// n1 - n2 = -m
		
		int result = 0;
		
		if(p1.getPrice() > p2.getPrice()) {
			result = 1; // swap 발생!
		} else {
			result = -1; // 자리 keep!
		}
		
		return result;
		// return p1.getPrice() - p2.getPrice();
	}

}
