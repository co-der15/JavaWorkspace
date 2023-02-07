package com.kh.layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class G_PanelLayout extends JFrame {

	public G_PanelLayout() {

		super("컴포넌트 레이아웃");
		
		setLayout(null);
		setBounds(300,300,500,500);
		
		JPanel pan = new JPanel();
		
		// JPanel은 기본 레이아웃이 FlowLayout이다!
		pan.setLayout(null);
		
		pan.setBounds(0,0,400,400);
		pan.setBackground(Color.white);
		
		JLabel label = new JLabel("아이디 : ");
		label.setBounds(50,100,150,50);
		
		JTextField text = new JTextField();
		text.setBounds(150,100,150,50);
		
		JButton btn = new JButton("로그인");
		btn.setBounds(300,100,100,50);
		
		pan.add(label);
		pan.add(text);
		pan.add(btn);
		
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
}
