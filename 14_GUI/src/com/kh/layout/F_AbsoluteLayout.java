package com.kh.layout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class F_AbsoluteLayout extends JFrame {
	
	public F_AbsoluteLayout() {
		// 절대영역 레이아웃 :
		//		개발자가 원하는 위치에 직접 컴포턴트를
		//		배치하는 방식(NullLayout)
		
		super("절대영역 테스트");
		
		setBounds(300,300,600,460);
		
		// 레이아웃 확인 (기본은 BorderLayout)
		//System.out.println(getLayout());
		
		setLayout(null);
		
		JLabel label = new JLabel("아이디 : ");
		label.setLocation(50,100);
		label.setSize(150,50);
		
		JTextField text = new JTextField();
		text.setLocation(300,100);
		text.setSize(150,50);				
		add(label);
		add(text);
				
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
