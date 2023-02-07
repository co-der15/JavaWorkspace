// : 한 줄 주석 (설명 / 부가 내용 문구)
/*
 * 여러 줄 주석
 */
package com.kh.hello;


/**
 * javadoc 주석 (문서 설명용 주석)<br>
 * 
 * 어떠한 클래스나 파일에 대한 내용을 <br>
 * 설명하는 문서 작성 시 활용하는 주석 표현
 * 
 * @author Daniel Yu
 * @when 2021-06-29
 * @version 1.0
 *
 */
public class HelloWorld {  // class 시작
	
	/*
	 * 자바 프로그램 작성 순서
	 * - 프로젝트 생성
	 * - 자동 생성된 src 폴더 안에 패키지 생성
	 *   패키지(package) : 특정 목적을 가진 소스 코드들을
	 *                   한 곳에 묶어 놓은 폴더 (like 양말은 양말서랍, 치킨은 치킨서랍에...)
	 * 
	 * - 클래스 파일 생성
	 *   클래스(class) : 어떠한 요소를 작성할 때 사용하는 하나의 설계 도면
	 *   
	 * - 메소드 생성
	 *   메소드(Method) : 특정 클래스 안에서 하나의 기능을 담당하는 함수
	 *   
	 *   실행 전용 메소드 :
	 *   	해당하는 프로젝트 전체에서 단 한 개만 존재하는 메소드
	 *      프로그램 실행 시 동작하는 함수
	 *   	public static void main(String[] args) { . . . }
	 *   
	 *   기능 제공 메소드 :
	 * 		나머지
	 */
	
	public static void main(String[] args) {  // main 메소드 시작

		System.out.println("Hello World!"); 

	}  // main 메소드 종료!

}  // class 끝
