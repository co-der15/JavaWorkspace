package com.kh.event.bind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
public class InnerClass extends JFrame {
	// 이벤트 리스너로 이벤트를 등록하는 방법 2
	// 클래스 내부에 또 하나의 클래스를 생성하여
	// 해당 클래스의 모든 컴포넌트를 공유하여
	// 사용하는 방법
	
	// 필드 변수로 어떤 메소드이건
	// 해당 객체를 접근할 수 있도록 전역 변수화 선언
	private JPanel pan;
	private JButton btn;
	private JLabel label;
	
	public InnerClass() {		
		super("내부 클래스 테스트");
		setBounds(300,300,300,300);
		
		pan = new JPanel();
	    btn = new JButton("실행 확인");
		label = new JLabel("아직 누르지 않았습니다.");
		
		btn.addActionListener(new MyListener());
		
		pan.add(btn);
		pan.add(label);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	// 내부에 별도의 클래스를 선언함으로써
	// 같은 필드 변수에도 접근할 수 있고
	// 접근 제한자를 통해 보다 더
	// 정보은닉을 확대할 수 있다.
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				label.setText("클릭 확인!!");
			}
			
		}
		
	}
}












