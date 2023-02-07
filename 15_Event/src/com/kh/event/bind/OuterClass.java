package com.kh.event.bind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OuterClass extends JFrame {
	
	public OuterClass() {
		super("외부 클래스 테스트");
		
		setBounds(300,300,300,300);
		
		JPanel pan = new JPanel();
		JButton btn = new JButton("실행 확인");
		JLabel label = new JLabel("아직 누르지 않았습니다.");
		
		btn.addActionListener(new MyEvent(btn, label));
		
		pan.add(btn);
		pan.add(label);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class MyEvent implements ActionListener {

	//필드
	private JButton btn;
	private JLabel label;
	
	public MyEvent(JButton btn, JLabel label) {
		this.btn = btn;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			label.setText("수고했어 오늘도!");
		}
		
	}
	
}













