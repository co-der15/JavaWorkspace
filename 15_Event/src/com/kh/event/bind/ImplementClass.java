package com.kh.event.bind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ImplementClass extends JFrame implements ActionListener {
	
	private JButton btn;
	private JLabel label;

	public ImplementClass() {
		super("직접 구현하는 클래스");
		setBounds(300,300,300,300);
		
		JPanel pan = new JPanel();
		btn = new JButton("실행 확인");
		label = new JLabel("아직 누르지 않았습니다.");
		
		// 자기 자신이 가진 이벤트 리스너를 사용하겠다!
		btn.addActionListener(this);
		
		pan.add(btn);
		pan.add(label);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			label.setText("실행 확인!!");
		}

	}

}
