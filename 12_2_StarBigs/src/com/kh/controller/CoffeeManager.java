package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.CoffeeDAO;
import com.kh.model.vo.Coffee;

public class CoffeeManager {
	// 1. 필드
	// private Coffee[] orderArr;  // 커피 배열
	// private int count;          // 주문 수량
	// 객체 배열의 단점
	// 1. 배열의 크기를 변경할 수 없다.
	// 2. 각 공간에 값이 잘 들어 있는지 확인하기 어렵다!
	// 3. 중간의 값을 추가하거나 삭제하기 어렵다!
	
	// 이러한 단점을 보완하여 보다 편리하게 사용가능한
	// 클래스를 제공하게 되었는데, 그게 바로 Collection이다!
	// List : 중복 허용, 저장 순서 유지
	//   Vector, ArrayList, LinkedList
	// Set : 중복 허용 X, 저장 순서 유지 X
	//   HashSet, LinkedHashSet, TreeSet
	// Map : Key 와 Value 두 개의 값을 한 쌍으로
	//       저장, 관리하는 구조, Key: Set , Value : List
	//   HashMap, HashTable
	private ArrayList<Coffee> orderList;
	private CoffeeDAO coDAO; //  커피 주문 정보 저장 클래스
			
	// 2. 생성자
	public CoffeeManager() {
		// orderArr = new Coffee[10];
		orderList = new ArrayList<>();
	}
	
	// 3. 기능 제공 메소드
	// 커피 정보 추가
	public Coffee insertCoffee(Coffee co) {
		orderArr[count] = co;
		count++;
		
		return co;
	}
	
	// 커피 주문 취소 기능
	public void deleteCoffee(int index) {
		
		for( int i = index; i < count ; i++) {
			if(orderArr[i + 1] != null) {
				orderArr[i] = orderArr[i + 1];
				orderArr[i + 1] = null;
			}
		}
		count--;
	}
	
	// 커피 주문 조회 메소드
	public void printAll() {
		for(Coffee co : orderArr) {
			System.out.println( co );
		}
	}
	
}
