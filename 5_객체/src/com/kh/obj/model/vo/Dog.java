package com.kh.obj.model.vo;

public class Dog {
	// 추상화
	// 이름    - name:String
	// 견종    - type:String
	// 성별    - gender:char
	// 나이    - age:int
	// 몸무게  - weight:double
	
	// 1. Fields (멤버변수)
	private String name;
	private String type;
	private char gender;
	private int age;
	private double weight;
	
	private static int bobCount = 10;  // 공용 밥 개수
	
	// 2. 생성자
	public Dog() {}  // 기본 생성자
	
	public Dog(String name) {  // 사용자 정의 생성자
		this.name = name;
	}
	
	// 3. 기능 제공 메소드
	public void bark() {
		System.out.println("우리 집 " + name +"(이)가 짖습니다.");
	}
	
	public void play() {
		System.out.println("우리 집 " + name + "(이)가 난장판을 만듭니다.");
		
		bobCount--;
	}
	
	public static void checkBob() {
		
		System.out.println(bobCount + "개 밥이 남았습니다.");
		
	}
	
	// Dog 정보
	public void printDog() {
		System.out.println(name +", " + type + ", " + gender + ", " + age + ", " + weight +"kg");
	}
	
	// 기능 메소드 중 필드 값에 접근하기 위한
	// 특별한 메소드를 선언할 수 있다.
	// getter & setter :게터와 세터
	
	// public void set + 필드변수명( 사용할 매개변수 ) {
	//     this.변수명 = 변수명;
	// }
	// -------------------------------------------------------
	// public 리턴타입 get + 필드변수명() {
	//    return 변수명;
	// } 
	
	// 이름 변경 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// 이름을 가져오는 메소드
	public String getName() {
		return name;
	}
	
	// type getter / setter
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	// age getter / setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}


















