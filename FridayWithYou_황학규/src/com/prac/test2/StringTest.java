package com.prac.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22#4.12#5.93#8.71#9.34";
		double data[] = new double[5];
		double sum = 0;

		// str에서 데이터를 분리한다.
		String[] st = str.split("#");
		int i = 0;
		
		for(String s : st) {
			data[i] = Double.parseDouble(s);
			sum += data[i++];
		}
		
		System.out.printf("합계 : %.3f\n평균 : %.3f", sum, (sum/5));
		
	}

}
