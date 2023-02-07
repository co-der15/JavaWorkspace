package com.kh.jdbc.model.dao;

import com.kh.jdbc.model.vo.Member;
import java.sql.*;
import java.util.ArrayList;
import static com.kh.jdbc.common.JDBCTemplate.*;

public class MemberDAO {

	public MemberDAO() { }
	
	public Member selectOne(int memberNo) {
		Member m = null;
		
		Connection con = getConnection();
		Statement stm = null;
		ResultSet rst = null;
		
		try {
			stm = con.createStatement();
			
			String sql = "SELECT * FROM MEMBER WHERE MEMBER_NO = " + memberNo;
			
			rst = stm.executeQuery(sql);
			
			if( rst.next() ) {
				// 첫번째는 컬럼명이 나온다.
				m = new Member();
				
				m.setMemberNo(  rst.getInt("MEMBER_NO")    );  // 컬럼의 조회순서 / 컬럼명
				m.setId(        rst.getString("member_id")        );
				m.setPasswd(    rst.getString(3)           );
				m.setName(      rst.getString("MEMBER_NAME")      );
				m.setEmail(     rst.getString("member_email")     );
				m.setGender(    rst.getString("member_gender")    );
				m.setAge(       rst.getInt("member_AGE")          );
				m.setPhone(     rst.getString("MEMBER_PHONE")     );
				m.setEnrollDate(rst.getDate("ENROLL_DATE") );
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				rst.close();
				stm.close();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return m;
	}

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<>();
		
		Connection con = getConnection();
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MEMBER";
		
		try {
			st = con.createStatement();
			
			rs = st.executeQuery(sql);
			
			while( rs.next() ) {
				Member m = new Member();
				
				m.setMemberNo(  rs.getInt("member_no")    );  // 컬럼의 조회순서 / 컬럼명
				m.setId(        rs.getString("member_id")        );
				m.setPasswd(    rs.getString("member_pwd")    );
				m.setName(      rs.getString("member_name")      );
				m.setEmail(     rs.getString("member_email")     );
				m.setGender(    rs.getString("member_gender")    );
				m.setAge(       rs.getInt("member_age")          );
				m.setPhone(     rs.getString("member_phone")     );
				m.setEnrollDate(rs.getDate("enroll_date") );
				
				list.add( m );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(st);
			close(con);
		}
				
		return list;
	}
}