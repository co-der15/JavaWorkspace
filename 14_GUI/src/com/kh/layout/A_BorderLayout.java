package com.kh.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {
	public A_BorderLayout() {
		// BorderLayout :
		//    화면의 각 방향을 동, 서, 남, 북, 가운데로
		//    나누어 각 요소를 배치하는 방법
		
		// 부모 생성자를 통해 제목 짓기
		super("보더 레이웃 테스트");
		
		// 프레임 크기 설정하기
		this.setBounds(300, 300, 800, 500);
		
		// 레이아웃 설정하기
		// 컨테이너에서 사용하는 각각의 레이아웃
		// 설정은 LayoutManager 인터페이스의 후손 클래스로,
		// 각각의 레이아웃을 다양하게 지원한다.
		this.setLayout(new BorderLayout());
		
		// 레이아웃에 따른 버튼 배치하기
		// JButton : 대표적 컴포넌트
		/*
		JButton northBtn = new JButton("북");
		JButton eastBtn = new JButton("동");
		JButton westBtn = new JButton("서");
		JButton southBtn = new JButton("남");
		JButton centerBtn = new JButton("가운데");
		
		this.add(northBtn, "North");
		this.add(eastBtn, "East");
		this.add(westBtn, "West");
		this.add(southBtn, "South");
		this.add(centerBtn, "Center");
		*/
		
		this.add(new JButton("북"), "North");
		this.add(new JButton("동"), "East");
		this.add(new JButton("서"), "West");
		this.add(new JButton("남"), "South");
		this.add(new JButton("가운데"), "Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
