package com.kh.list.sort;

import java.util.Comparator;

public class DescName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		
		int result = 0;
		
		if(p1.getName().compareTo(p2.getName()) > 0) {
			result = -1;
		} else {
			result = 1;
		}
		
		return result;
	}

}
