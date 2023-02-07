package com.kh.poly.run;

import com.kh.poly.model.vo.*;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV("OLED", 1000);
		SmartPhone smart = new SmartPhone("s21", 500);
		Tablet tab = new Tablet("서피스", 700);
		
		// -----------------------------------------  //
		// ** 다형성!
		// 하나의 부모 클래스에서 뻗어나온 여러 다른 클래스들을
		// 부모 클래스라는 공통 사항으로 묶어 관리하는 기술
		
		Product[] products = new Product[3];
		
		products[0] = tv;
		products[1] = smart;
		products[2] = tab;
		
		// 반복문 사용이 가능!
		for (int i = 0 ; i < products.length ; i++) {
			System.out.println(products[i]); 
			   // product[i].toString() --> toString() 자동 생략!
		}
		
		/* 
		 * TV는 Product(제품)의 일종이다. ... ( O )
		 * 
		 * Product p = new TV();   : 더 큰 상위의 개념으로 묶는 것! (다형성)
		 *  
		 * 모든 Product 는 TV이다.  ............. ( X )
		 * 
		 * 더 큰 상위의 존재로 묶는 업캐스팅(상향 형변환)은 간단하지만,
		 * 더 작은 세부적인 존재로 쪼개는 다운 캐스팅(하향 형변환)은 쉽지 않다.
		 */
		
		// 배열 전용 반복문 : for-each
		// for(배열에 쓰인 자료형 변수명 : 배열명){ . . . }
		// for( int a : array) { ... a }
		for(Product p : products) {
			
			// TV t = (TV)p;  // 하향 형변환
			
			if( p instanceof TV ) {
				// A instanceof B : A를 B로 바꿀 수 있는가?
				((TV)p).watch();
			}
		}
	}
}








