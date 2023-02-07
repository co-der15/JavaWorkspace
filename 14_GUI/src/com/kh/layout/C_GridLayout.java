package com.kh.layout;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {
	
	public C_GridLayout() {
		
		super("그리드 레이아웃 테스트");
		
		setBounds(300, 300, 500, 400);
		
		setLayout(new GridLayout(5, 5, 10, 20));
		
		// 랜덤 빙고판 만들기
		// 1 ~ 25 까지 랜더 한 수 만들기
		Set<Integer> binggo = new LinkedHashSet<>();
		
		while(binggo.size() < 25) {
			int num = (int)(Math.random() * 25) + 1;
			
			binggo.add(num);
		}
		
		ArrayList<Integer> list = new ArrayList<>(binggo);
		
		for(int i : list) {
			add(new JButton(i + " "));
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
