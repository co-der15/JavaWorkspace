package com.kh.emp.run;

import com.kh.emp.model.vo.Employee;

public class ObjArrTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		// ...
		
		// 객체를 여러 개 하나씩 선언하는 형태에서
		// 객체가 너무 많아질 경우, 객체도 배열로 묶을 수 있다!
		
		// 1. 객체 배열 선언
		// int[] array = new int[5];
		Employee[] array = new Employee[5]; // 5명의 사원(employee)을 받을 수 있는 공간
		
		array[0] = new Employee();
		array[1] = new Employee();
		array[2] = new Employee();
		array[3] = new Employee();
		// ...
		
		// 2. short hand
		Employee[] array2 = {
								new Employee(),
								new Employee(),
								new Employee(),
								new Employee(),
								new Employee()
							};
		
		for(int i = 0 ; i < array2.length ; i++) {
			
			System.out.println( array2[i].empToString() );
			
		}
	}

}
