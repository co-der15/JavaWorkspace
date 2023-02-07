package com.kh.hello;

import java.util.Scanner;

public class practiceTest {
	public static void main(String[] args) {

			for(int i=2; i < 10; i++) {
				
				for(int j=1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
				System.out.println();
			}
		
			
		System.out.println("값 입력 : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		
			
		}
	}
}



