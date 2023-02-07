package com.kh.comtainer;

import java.awt.Rectangle;

import javax.swing.JFrame;

public class JFrameTest2 {
	
	// 컨테이너 생성 방법 2
	// 메소드를 통해 JFrame 을 직접 생성하는 방법
	public void showFrm() {
		
		// JFrame 객체 생성과 동시에 제목 설정이 가능하다.
		JFrame frm = new JFrame("쁘띠쁘띠 프레임♡");
		
		Rectangle r = new Rectangle(300,300, 400, 300);
		frm.setBounds(r);
		
		// 종료 메소드
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 리사이즈 방지
		frm.setResizable(false);
		
		// 현재 화면에 표시하기
		frm.setVisible(true);
	}
	

}
