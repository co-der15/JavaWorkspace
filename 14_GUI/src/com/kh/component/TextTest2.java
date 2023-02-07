package com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextTest2 extends JFrame {
	
	public TextTest2() {
		// 숫자를 입력받아 제곱한 결과를 돌려주는 계산기
		
		super("홍길동's 제곱수 계산기 ver 1.0");
		
		JPanel pan = new JPanel();
		
		JLabel label = new JLabel("숫자 입력 :");
		JTextField text = new JTextField(15);
		
		JLabel label2 = new JLabel("결과 확인 : ");
		JTextField text2 = new JTextField(15);
		
		JButton btn = new JButton("제곱 계산하기");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 계산하기 버튼을 클릭했을 때 발생할 코드 작성
				
				// 텍스트 필드의 숫자를 값을 가져와서
				// 숫자라면 int로 변환하기
				
				String temp = text.getText();
				try {
					int num = Integer.parseInt(temp);
				
				text2.setText(String.valueOf(num * num));
				} catch(NumberFormatException ex) {
					
					text2.setText("숫자가 아닙니다!");
					
				}
			}
		});
		
		pan.add(label);
		pan.add(text);
		pan.add(label2);
		pan.add(text2);
		pan.add(btn);
		
		add(pan);
		
		setBounds(300, 300, 300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TextTest2();
	}
	
}

















