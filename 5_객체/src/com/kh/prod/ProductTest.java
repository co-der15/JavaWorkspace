package com.kh.prod;

import java.util.Scanner;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println(p.information());
		
		System.out.println("총 구매 가격 : "
		                   + (p.getPrice() * p.getQuantity()) + "원");
		
	}
}
