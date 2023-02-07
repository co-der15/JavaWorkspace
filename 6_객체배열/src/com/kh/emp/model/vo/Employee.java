package com.kh.emp.model.vo;

public class Employee {
	// 사원 클래스 구현하기
	
	// 추상화
	// 사원번호 String, 
	// 이름     String, 
	// 급여     int,
	// 부서     String,
	// 연락처   String
	
	// 1. 필드
	private String empNo;
	private String name;
	private int salary;
	private String dept;
	private String tel;
	
	// 2. 생성자 ( Alt + Shift + 'S' )
	public Employee() { }

	// 사용자 정의 생성자
	public Employee(String empNo, String name, int salary, String dept, String tel) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.tel = tel;
	}
	
	// 3. 기능 제공 메소드
	// 사원의 모든 정보 출력
	public String empToString() {
		
		return empNo +", " 
		     + name + ", "
			 + salary + ", "
		     + dept + ", "
			 + tel;
		
	}

	// Getter & Setter
	// Alt + Shift + 'S' > generate getter & setter
	
	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}












