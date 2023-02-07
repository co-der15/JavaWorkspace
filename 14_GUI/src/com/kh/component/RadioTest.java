package com.kh.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RadioTest extends JFrame {
	
	public RadioTest() {
		super("심리테스트 1");
		
		JPanel pan = new JPanel();
		
		JLabel label = new JLabel("선호하는 음식을 고르세요!");
		
		pan.add(label);
		
		JPanel pan2 = new JPanel();
		
		// 라디오 버튼 넣기
		JRadioButton btn1 = new JRadioButton("짜장면");
		JRadioButton btn2 = new JRadioButton("짬뽕");
		JRadioButton btn3 = new JRadioButton("탕수육");
		
		// 라디오 그룹
		// 각각의 버튼을 하나의 그룹으로 묶어주는객체
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3); // 이제 단일 선택이 가능해졌다!
		
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		JPanel pan3 = new JPanel();
		
		JLabel result = new JLabel("~~ 결과 확인 ~~");
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				result.setText("A 타입입니다. (A:짜장면을 좋아하는 타입)");	
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("B 타입입니다. (B:짬뽕을 좋아하는 타입)");
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("C 타입입니다. (C:탕수육을 좋아하는 타입)");
			}
		});
		
		pan3.add(result);
		
		setLayout(new BorderLayout());
		
		add(pan, "North");
		add(pan2, "Center");
		add(pan3,"South");
		
		setBounds(300,300,500,400);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new RadioTest();

	}

}
