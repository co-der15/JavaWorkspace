package com.kh.jdbc.controller;

import java.util.ArrayList;

import com.kh.jdbc.model.dao.MemberDAO;
import com.kh.jdbc.model.vo.Member;

public class MemberManager {

	public MemberManager() { }
	
	// 회원 한 명 조회
	public Member selectOne(int memberNo) {
		Member m = new MemberDAO().selectOne(memberNo);
		
		if( m != null ) {
			System.out.println("데이터 조회 성공!");
		} else {
			System.out.println("데이터 조회 실패 ㅠㅠ");
		}
		
		return m;
	}
	
	// 회원 전체 조회
	public ArrayList<Member> selectAll(){
		ArrayList<Member> list = new MemberDAO().selectAll();
		
		if( list.size() == 0 ) { 
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.println("데이터 조회 성공!");
		}
		
		return list;
	}
}