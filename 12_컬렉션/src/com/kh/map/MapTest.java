package com.kh.map;

import java.util.*;

public class MapTest {
		// Map : 
		//   자료(데이터)를 저장할 때
		//   각각의 식별 구분자(고유의 값)를 key로
		//   해당 값에 대한 내용을 value로
		//   나누어 저장, 관리하는 구조를 말한다.
		//   이 때 key는 set의 특성을,
		//   value는 list의 특성을 가진다.
		//  대표적으로 HashMap, HashTable, TreeMap, Properties가 있다.

		public static void main(String[] args) {
			
			HashMap map1 = new HashMap();
			
			// 키(Key), 값(Value)
			map1.put("1번", "수학익힘책");
			map1.put("2번", "수학익힘책");
			map1.put("3번", 12345);
			map1.put(100, new Date());  // Value : List 와 유사하다

			// 키는 순서 유지 X
			System.out.println(map1);
			
			map1.put("3번", 'A');
			// 키 중복 허용 X       --- Key : Set 과 유사하다!
			System.out.println(map1);
			
			// 값의 접근
			System.out.println("1번 : " + map1.get("1번"));
			System.out.println("100 : " + map1.get(100));
			System.out.println("700 : " + map1.get(700)); // null
			
					// 저장된 value를 하나씩 꺼내는 방법
			
			// 1. keySet() 메소드 사용
			//   map 안의 key들만 따로 빼내어
			//   해당 키로 하나씩 조회하는 방법
			Set keys = map1.keySet();
			
			Iterator iter1 = keys.iterator();
			
			while( iter1.hasNext() ) {
				
				// key 객체를 꺼냄
				Object key = iter1.next();
				
				System.out.println( map1.get(key) );
				
			}
			
			System.out.println("-------------------------------");
			
			// 2. values() 메소드 사용
			Collection values = map1.values();
			
			Object[] objArr = values.toArray();
			
			for(int i = 0 ; i < objArr.length ; i++) {
				
				System.out.println( objArr[i] );
			}
			/*
			Iterator iter2 = values.iterator();
			
			while(iter2.hasNext()) {
				
				System.out.println(iter2.next());
				
			}
			*/
			System.out.println("--------------------------------");
			
			// 3. entrySet() 메소드 사용
			//    key와 value를 한 쌍으로 통째로 꺼내오는 방법 
			
			Set entrySet = map1.entrySet();
			
			Iterator iter3 = entrySet.iterator();
			
			while(iter3.hasNext()) {
				
				// key와 value를 모두 가지는 객체
				Map.Entry entry = (Map.Entry)iter3.next(); 
				
				Object key = entry.getKey();
				Object value = entry.getValue();
				
				System.out.println(key + " : " + value);
			}
		}
	}

