package com.kh.jdbc.model.vo;

import java.io.Serializable;
import java.sql.Date;

/**
 * MVC : 프로그램 설계 기법
 * Model View Controller
 * 프로그램을 만들 때, 백지에서 만드는 것이 아니라
 * 일정한 형식을 바탕으로 만드는 기법을 설계 기법이라고 한다.
 * 
 * 이 중 MVC 설계 기법은 많은 기업에서 활용하고 있는
 * 생산성을 향상시키는 기법이다.
 * 
 * Model : 데이터, 객체를 선언하는 패키지 
 *         객체 선언 및 데이터 저장, 읽기 등에 쓰이는
 *         클래스를 가진다.
 *         
 *   - VO (Value Object) : 데이터 저장, 읽기에 쓰이는 객체 
 *     (DTO : Data Transfer Object)
 *     (Domain Object, Bean, Entity . . . )
 *   
 *   - DAO (Data Access Object) : VO를 저장, 읽는 등의 기능을
 *                                담당하는 클래스
 *   
 *   - Service : 회원 가입, 회원 정보 수정, 회원 탈퇴 등의 기능이
 *               하나의 회원 관리 서비스로 묶이듯, 각 기능들을
 *               하나의 서비스 단위로 묶어 관리하는 패키지
 *               
 * ----------------------------------------------
 * 
 * View : 사용자 화면을 담당하는 패키지
 *    - java : 메뉴 화면 출력 메소드
 *    - Web  : jsp / html / css 등의 화면 파일
 * 
 * ----------------------------------------------
 * 
 * Controller : 사용자 화면과 Service 기능을 연결하는
 *              패키지
 *     - java : Manager 클래스
 *     - Web  : Servlet 클래스         
 */
public class Member implements Serializable {
	
	// 필드 변수
	private int memberNo;
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String gender;
	private int age;
	private String phone;
	private Date enrollDate;

	// 생성자
	public Member() { }

	public Member(int memberNo, String id, String passwd, String name, String email, String gender, int age,
			String phone, Date enrollDate) {
		this.memberNo = memberNo;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.enrollDate = enrollDate;
	}

	public Member(String id, String passwd, String name, String email, String gender, int age, String phone,
			Date enrollDate) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.enrollDate = enrollDate;
	}
		
	// 메소드	
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", id=" + id + ", passwd=" + passwd + ", name=" + name + ", email="
				+ email + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", enrollDate=" + enrollDate
				+ "]";
	}

	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

}
