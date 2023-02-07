package com.day.test;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년 입력 : ");
		int birthday = sc.nextInt();
		
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);

		System.out.println("현재 나이 : " + today.getDayOfMonth());
	}

}
