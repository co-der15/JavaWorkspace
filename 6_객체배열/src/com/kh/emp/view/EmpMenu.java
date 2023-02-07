package com.kh.emp.view;

import java.util.Scanner;

import com.kh.emp.controller.EmployeeManager;
import com.kh.emp.model.vo.Employee;

public class EmpMenu {
	// 사원 관리 메뉴 화면
	// private Employee emp;  // 관리할 사원 객체
	
	public static void display() {
		// 사원 관리 메뉴
		
		Scanner sc = new Scanner(System.in);
		// EmpMenu em = new EmpMenu(); // 메뉴 클래스에 선언된 필드 변수 사용을 위한 객체
		EmployeeManager em = new EmployeeManager();
		
		do {
		
			System.out.println("-- 홍길동's 사원 관리 프로그램 ver 2.0 --");
			System.out.println(" :: 총 입사 가능 인원 : " + EmployeeManager.SIZE + "명");
			System.out.println(" :: 현재 입사자 수 : " + EmployeeManager.getCount() + "명");
			System.out.println("1) 사원 정보 입력");
			System.out.println("2) 사원 정보 수정");
			System.out.println("3) 사원 정보 삭제");
			System.out.println("4) 전체 사원 정보 조회");
			System.out.println("0) 사원 퇴근시키기");
			System.out.println("------------------------------------------");
			System.out.print(" 메뉴 선택 >> ");
			
			int select = sc.nextInt();
			
			switch( select ) {
			case 1 :
				em.insertEmp();
				break;
			case 2 :
				em.updateEmp();
				break;
			case 3 :
				em.deleteEmp();
				break;
			case 4 : 
				em.printAllEmp();
				break;
			case 0 :
				System.out.println("오늘 하루도 수고 많으셨습니다 ^_^!");
				return;
			default :
				System.out.println("잘못 입력 하셨습니다!");
			}
		} while(true);
	}
}











