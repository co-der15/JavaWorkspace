package com.kh.practice2;

import java.util.Comparator;

public class AscCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		int result = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book bk1 = (Book)o1;
			Book bk2 = (Book)o2;
			
			result = bk1.getCategory() > bk2.getCategory() ? 1 : -1;
			
		}

		return result;
	}
	
	
	
}
