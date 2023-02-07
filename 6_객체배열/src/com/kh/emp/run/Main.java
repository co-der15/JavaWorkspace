package com.kh.emp.run;

import com.kh.emp.model.vo.Employee;
import com.kh.emp.view.EmpMenu;

public class Main {

	public static void main(String[] args) {
		System.out.println("... 프로그램을 시작합니다!");

		// 메뉴 화면 사용하기
		EmpMenu.display();
		
		System.out.println("... 프로그램을 종료합니다...");
	}

}
