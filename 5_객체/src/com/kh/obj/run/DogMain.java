package com.kh.obj.run;

import com.kh.obj.model.vo.Dog;

public class DogMain {

	public static void main(String[] args) {
		// 생성자의 차이
		Dog d1 = new Dog();
		Dog d2 = new Dog("루이스");

		d1.setName("초롱이");
		
		d1.bark();
		d2.bark();
		
		d1.play();
		
		Dog.checkBob(); // static 사용법
		
		d1.setType("진도");
		d2.setType("슈나우저");
		
		d1.printDog();
		d2.printDog();
		
		
	}
}
