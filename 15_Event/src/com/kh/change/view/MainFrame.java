package com.kh.change.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private JPanel pan; // 주 화면
	private int pageNo; // 화면 번호
	
	public MainFrame() {
		
		super("패널 쿄체 테스트");
		setBounds(300,300,500,600);
		
		setLayout(new BorderLayout());
		
		pan = new JPanel();
		pan.setBackground(Color.green);
		
		JButton[] btns = new JButton[3];
		JPanel controlPan = new JPanel();
		
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(String.valueOf(i + 1));
			
			// 익명 클래스 방식!
			btns[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					pageNo = Integer.parseInt(e.getActionCommand());
					
					replace();
					
				}
				
			});
			
			controlPan.add(btns[i]);
		}
		
		add(pan, "Center");
		add(controlPan, "South");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public void replace() {
		//화면 교체 메소드
		
		// 현재 표현 중인 화면 제거
		this.remove(pan);
		
		if(pageNo == 1) {
			pan = new MyPanel1();
		} else if(pageNo == 2) {
			pan = new MyPanel2();
		} else if(pageNo == 3) {
			pan = new MyPanel3();
		}
		
		this.add(pan, "Center");
		
		// 자바는 화면 객체와 화면 구현 그래픽이 별도로 관리된다.
		// 따라서 화면이 변경 되었을 때 그래픽 객체를 통해
		// 화면의 소스 코드가 변경되었음을 다시 알려주며
		// 화면을 재구성해야 한다. 
		// 이때 사용하는 메소드가 repaint() 이다.
		repaint();
		
		setVisible(true);
	}
	
}
