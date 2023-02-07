package com.kh.emp.controller;

import com.kh.emp.model.vo.*;
import java.util.*;

public class EmployeeManager {
	// 화면(view)과 각 객체(vo)를 연결하는 클래스
	
	// 사원의 수를 한정할 수 있는 길이 선언
	public static final int SIZE = 10;
	
	// 사원 목록을 관리하기 위한 배열 선언
	private Employee[] empArr = new Employee[ SIZE ];
	
	// 현재 등록된 사원 수
	private static int count;
	
	Scanner sc = new Scanner(System.in);
	
	{   // 미리 값을 몇 개 넣어 놓을 수 있는 초기화 블럭
		
		empArr[0] = new Employee("100", "홍길동", 200, "청소부", "010-1111-2222");
		empArr[1] = new Employee("101", "고길동", 250, "가정주부", "010-2222-3333");
		empArr[2] = new Employee("102", "김철수", 300, "유부", "010-3333-4444");
		
		// 초기화로 추가한 만큼의 사원 수 수정
		count = 3;
	}
	
	// 2. 생성자
	public EmployeeManager() { }
	
	// 3. 기능 제공 메소드
	
	// getter & setter
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		EmployeeManager.count = count;
	}
	
	// 전체 사원 정보 조회
	public void printAllEmp() {
		for(int i = 0; i < count ; i++) {
			System.out.println( empArr[i].empToString() );
		}
		System.out.println("\n\n\n");
	}

	// 사원 정보 추가용 메소드
	public void insertEmp() {
		
		System.out.print("사원번호 : ");
		String empNo = sc.next();
		
		System.out.print("사원 명 : ");
		String name = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.print("부서 : ");
		String dept = sc.next();
		
		System.out.print("연락처 : ");
		String tel = sc.next();
		
		empArr[count] = new Employee(empNo, name, salary, dept, tel);
		
		System.out.println("사원 정보 추가 완료!! \n\n\n");
		
		count++;
	}

	// 사원 정보 수정용 메소드
	public void updateEmp() {
		
		System.out.print("수정할 사원 번호 : ");
		String empNo = sc.next();
		
		boolean check = false;  // 찾는 사원 있는지 확인
		int idx = -1;
		
		for(int i = 0 ; i < count ; i++ ) {
			if ( empArr[i].getEmpNo().equals(empNo) ) {
				check = true;
				idx = i;
				break;
			}
		}
		
		if( check ) {
			System.out.println("현재 사원 연락처 : " + empArr[idx].getTel());
			System.out.print("바꿀 연락처 : ");
			empArr[idx].setTel(sc.next());
			
			System.out.println("사원 정보 수정 완료! \n\n\n");
		} else {
			System.out.println("해당하는 사원이 없습니다. \n\n\n");
		}
	}

	// 사원 삭제용 메소드
	public void deleteEmp() {
		
		System.out.print("삭제할 사원 번호 : ");
		String empNo = sc.next();
		
		boolean check = false;  // 찾는 사원 있는지 확인
		int idx = -1;
		
		for(int i = 0 ; i < count ; i++ ) {
			if ( empArr[i].getEmpNo().equals(empNo) ) {
				check = true;
				idx = i;
				break;
			}
		}
		
		if( check == true ) {
			for(int i = idx; i < count ; i++) {
				// 만약 삭제할 사원이 마지막 사원이라면
				//    i     count
				// ----------------
				//    0       1 명
				//    1       2 명
				//     ...
				//    9      10 명
				if ( i == count - 1) {
					empArr[i] = null;
				} else {
					empArr[i] = empArr[i + 1];
				}
			}

			count--;  // 사원 수 감소
			
			System.out.println("사원 정보 삭제 완료! \n\n\n");
		} else {
			System.out.println("찾는 사원 번호는 없는 사원입니다. \n\n\n");
		}
	}
}










