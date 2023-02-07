package com.kh.comtainer;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	
	// 컨테이너 생성 방법1
	// JFrame을 직접 상속받아 처리
	public JFrameTest1() {
		// 프에림 크기 설정
		// this.setSize(400, 500);
		
		// 프레임 시작 위치
		// this.setLocation(300, 300);
		
		// 프레임 크기와 위치를 한 번에 설정하기
		this.setBounds(300, 300, 400, 300);
		
		// 프레임 종료와 같이 프로그램도 종료하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임 제목 작성하기
		this.setTitle("나의 쁘띠 프레임");
		
		// 프레임 기본 사이즈 수정 불가 설정
		this.setResizable(false);
		
		// 프레임 아이콘 변경
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 설정한 프레임 표시하게
		this.setVisible(true);
	}
}
