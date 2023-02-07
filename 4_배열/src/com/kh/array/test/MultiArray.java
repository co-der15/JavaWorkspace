package com.kh.array.test;

public class MultiArray {

	public void test1() {
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10};
		int[] arr3 = { 11, 12, 13, 14, 15};
		// . . .

		// 변수처럼 배열이 여러 개가 된다면
		// 변수가 많았던 것처럼 관리하기 힘들어 진다.
		// 해당 배열을 하나로 묶을 수 있는 
		// 더 큰 개념의 배열을 만들어 해결할 수 있는데,
		// 이를 다차원 배열이라고 한다.
		
		int[][] numbers = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};
		
		// 만약 묶은 배열마다 길이가 다르다면
		// 이를 가변 배열이라고 부른다.
		
		int[][] numbers2 = {
				{1, 2, 3, 4, 5},
				{1, 3, 5},
				{1, 4, 6, 8}
		};
		
		// 다차원 배열 선언 시
		int[][] numbers3 = new int[5][5];
		
		// 가변 배열 선언 시 : 맨 앞의 길이는 반드시 선언해야 한다.
		int[][] numbers4 = new int[5][];
		
	}
	
	public void test2() {
		// 2차원 배열 선언하기
		// 3 * 3
		
		int[][] arr = new int[3][3];
		
		// 2차원 배열에 값 추가하기
		int number = 1;
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = number++;
			}
		}
		
		// 2차원 배열의 값 출력하기
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void silsub1() {
		// 5 * 5 배열을 만들어
		// 1 ~ 25까지의 값을 추가한 후
		// 5개씩 끊어서 출력하기
		// ---------------------
		//  1  2  3  4  5
		//  6  7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		// ---------------------
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void silsub2() {
		// 5 * 5 배열을 만들어
		// 1 ~ 25까지의 값을 추가한 후
		// 5개씩 끊어서 출력하기
		// ---------------------
		//  1  6 11 16 21
		//  2  7 12 17 22
		//  3  8 13 18 23
		//  4  9 14 19 24
		//  5 10 15 20 25
		// ---------------------
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for ( int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
			System.out.println();
		}
	}
}





















