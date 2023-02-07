package com.kh.event.bind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnonymousClass extends JFrame {
	// 이벤트 리스너를 연결(바인딩)하는 방법 1
	// 익명 클래스로 즉석 리스너를 생성하는 방법
	// 각 컴포넌트마다 1회성으로 리스너를 연결하여
	// 다른 컴포넌트는 똑같은 기능을 수행할 때
	// 다시 처음부터 만들어야 한다는 특성이 있다.
	
	public AnonymousClass() {
		super("익명클래스 테스트");
		
		setBounds(300,300,300,300);
		
		JPanel pan = new JPanel();
		
		JButton btn = new JButton("실행 확인");
		JLabel label = new JLabel("아직 누르지 않았습니다.");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 눌렀을 때
				System.out.println("이벤트 정보 : " + e);
				
				if(e.getSource() == btn) {
					label.setText("확인 완료!");
				}
				
			}
			
		});
		
		pan.add(btn);
		pan.add(label);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
