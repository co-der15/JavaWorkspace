package com.kh.prac;

import java.util.Scanner;

public class BMI {
	
	Scanner sc = new Scanner(System.in);
	
	public void test() {
		
		do { 
			
			System.out.println(" :: 단위 선택 ::");
			System.out.println("--------------");
			System.out.println("1) cm ");
			System.out.println("2)  m ");
			System.out.println("---------------");
			System.out.print(" 선택 : ");
			
			int select = sc.nextInt();
			double height = 0;
			int weight = 0;
			
			switch(select) {
			case 1 :
				System.out.print(" 키(cm) 입력 : ");
				height = sc.nextDouble();
				
				double n = height / 100;
				System.out.print("몸무게 입력 : ");
				
				weight = sc.nextInt();
				double result = weight / (n * n);
				
				System.out.println("BMI : " + result);
				
				if(result < 18.5) {
					System.out.println("저체중");
				} else if (result >= 18.5  && result <= 24.9) {
					System.out.println("정상");
				} else if (result >= 25 && result < 29) {
					System.out.println("경도비만");
				} else {
					System.out.println("고도비만");
				}
				return;
			case 2 :
				System.out.print("키(m) 입력 : ");
				height = sc.nextDouble();
				
				System.out.print("몸무게 입력 : ");
				weight = sc.nextInt();
				
				double result1 = weight / (Math.pow(height, 2));
				System.out.println("BMI : " + result1);
				
				if(result1 < 18.5) {
					System.out.println("저체중");
				} else if (result1 >= 18.5  && result1 <= 24.9) {
					System.out.println("정상");
				} else if (result1 >= 25 && result1 < 29) {
					System.out.println("경도비만");
				} else {
					System.out.println("고도비만");
				}
				
				return;
			}
		} while(true);	
	}
	
}
