package com.kh.practice1;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// static 메소드 실행
		lottoDisplay();

	}

	public static void lottoDisplay(){
		
		TreeSet tree = new TreeSet(); 
		
		while(tree.size() < 6) {
			
			// 1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생
			int value = new Random().nextInt(46) + 1;
			// 2. 자동 오름차순정렬되게 처리하는 Set 계열에 보관
			tree.add(value);
		}
		
		// 쉬운 방식
		int[] array = new int[6];
		
		Iterator iter = tree.iterator();
		int i = 0;
		while(iter.hasNext()) {
			int num = (int)iter.next();
			array[i] = num;
			i++;
		}
		
		// 응용 방식
		/*
		Integer[] resultArr = new Integer[tree.size()];
		tree.toArray((Integer[])resultArr);
		
		// 3. int[]로 바꾸어 출력
		for(int i = 0; i < resultArr.length ; i++) {
			System.out.println(resultArr[i]);
		}
		*/
	}

}