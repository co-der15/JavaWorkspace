package com.kh.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {
	
	public B_FlowLayout() {
		// FlowLayout :
		//     컨테이너 안에 컴포넌트들을
		//     왼쪽, 오른쪽, 가운데 정렬 형식으로
		//     배치하는 방법
		
		super("플로우 레이아웃 테스트");
		
		this.setBounds(300, 300, 800, 500);
		
		// this.setLayout(new FlowLayout());
		// this.setLayout(new FlowLayout(FlowLayout.CENTER));
		// this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		// this.setLayout(new FlowLayout(FlowLayout.LEADING)); // 왼쪽 정렬
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));  // 오른쪽 정렬
		
		System.out.println("현재 레이아웃 : " + this.getLayout());
		
		// 2. 버튼 추가하기 (23개)
		for(int i = 1 ; i < 24 ; i++) {
			this.add(new JButton(i+"번"));
		}
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
