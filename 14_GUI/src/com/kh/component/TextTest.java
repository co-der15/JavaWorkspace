package com.kh.component;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextTest extends JFrame {

	public TextTest() {
		
		super("TextTest");
		
		setLayout(new GridLayout(3,2));
		
		JLabel label1 = new JLabel("이름 : ");
		JTextField text1 = new JTextField();
		
		JLabel label2 = new JLabel("비밀번호 : ");
		JPasswordField pw = new JPasswordField();
		
		JLabel label3 = new JLabel("비고 : ");
		JTextArea area = new JTextArea();
		
		add(label1);
		add(text1);
		add(label2);
		add(pw);
		add(label3);
		add(area);
		
		setBounds(300,300,600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new TextTest();
	}

}
