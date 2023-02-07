package com.kh.jdbc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.jdbc.controller.MemberManager;
import com.kh.jdbc.model.vo.Member;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		MemberManager manager = new MemberManager();
		
		do {
			
			System.out.println("-------- 홍길동's 회원관리 시스템 --------");
			System.out.println("1. 회원 1명 조회");
			System.out.println("2. 전체 회원 조회");
			
			System.out.println("0. 프로그램 종료");
			System.out.print(">> 메뉴 선택 :  ");
			
			int sel = sc.nextInt();
			
			switch( sel ) {
			case 1 : 
				System.out.print("조회할 회원 번호 입력 : ");
				int memberNo = sc.nextInt();
				
				Member m = manager.selectOne(memberNo);
				
				System.out.println(m);
				
				break;
			case 2 : 
				ArrayList<Member> list = manager.selectAll();
				
				for(Member obj : list) {
					System.out.println(obj);
				}
				
				break;
			case 0 :
				System.out.println("프로그램 종료합니다!");
				return;
			}
			
			
		} while(true);
		
	}
}
