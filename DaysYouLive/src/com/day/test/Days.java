package com.day.test;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Days {

	public static long main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일 입력 : ");
		int birthday = sc.nextInt();
		
		long result = 0;
		
		LocalDateTime birthday1 = LocalDateTime.now();
		
		for(int i = 1; i < birthday1.getYear(); i++) {
			result += isLeapYear(i) ? 366 : 365;
		}
		result += birthday1.getDayOfYear();
		return result;
		
		
		
	}
	
	private static boolean isLeapYear(int i) {
		
		return false;
	}

}
