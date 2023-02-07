package com.kh.list;

import java.util.*;

public class TestList {
	// List :
	//   자료를 저장하는 구조(자료구조) 형태 중,
	//   순서가 유지되고 중복을 허용하는 자료구조 기법을 말한다.
	//   자바에서는 ArrayList, Vector, LinkedList 등이 있다.
	//   이 중 ArrayList와 Vector는 기능이 동일하나
	//   Vector는 ThreadSafe 기능이 있고, ArrayList는 ThreadSafe
	//   기능이 없는 클래스이다.
	
	public static void main(String[] args) {
		// ArrayList 연습
		
		ArrayList list1 = new ArrayList();

		// 다형성 적용한다면
		// List list2 = new ArrayList();
		// Collection list3 = new ArrayList();
		
		// 1. 길이가 정해져 있지 않다.
		list1.add("사과");
		list1.add("바나나");
		
		System.out.println(list1);
		
		// 2. 여러 자료형을 담을 수 있다.
		list1.add(12345);  // int --> Integer ( Object의 후손 )
		list1.add(true);   // 
		list1.add(12.3);   // 	오토박싱(Auto Boxing)이라고 함.
		list1.add('A');
		
		System.out.println(list1);
		
		// --  List의 특징  --
		
		// 1. 순서가 유지된다.
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");
		
		System.out.println(list1);
		
		// 2. 중복 값이 허용된다.
		list1.add("사과");
		
		System.out.println(list1);
		
		// * 배열의 중간 값 추가, 수정, 삭제
		list1.add(5,"콰삭칩");
		
		System.out.println(list1);
		
		list1.set(5, "콘칩");
		
		System.out.println(list1);
		
		list1.remove(5);
		
		System.out.println(list1);
		
		// * list 는 순서가 유지된다
		// --> for 반복문으로 안의 값을 하나씩 꺼낼 수도 있다.
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println( i + ">> " + list1.get(i));
		}
		
		// * 정령하기
		
		ArrayList sortList = new ArrayList();
		
		sortList.add("꼬북칩");
		sortList.add("초코칩");
		sortList.add("포테토칩");
		sortList.add("스윙칩");
		sortList.add("썬칩");
		
		System.out.println("sort 전 : " + sortList);
		
		// 오른차순 정렬(1 ~ 10)
		Collections.sort(sortList);
		System.out.println("오름차순 : " + sortList);
		
		// Collections.reverse(sortList); 오름차순 리버스한 것
		
		// 내링차순 정렬(10 ~ 1)
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
