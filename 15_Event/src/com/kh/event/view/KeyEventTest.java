package com.kh.event.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {

	private JTextField test;
	
	public KeyEventTest() {
		super("키입력 이벤트");
		setBounds(300,300,300,150);
		
		// 1. 이벤트 등록을 위한 컴포넌트 만들기
		test = new JTextField(20);
		
		// 2. 생성한 컴포넌트에 이벤드 발생 감지
		test.addKeyListener(this);
		
		// 3. 컨테이너에 해당 컴포넌트 등록
		add(test);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new KeyEventTest();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키가 눌러져 있을 때
		// display("key Typed", e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 눌렀을 때
		// display("key Pressed", e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키에서 손을 떼었을 때
		//display("key Released", e);
		sampleMethod();
	}
	
	public void sampleMethod() {
		System.out.println("--- 10자 이내 작성 금지 ");
		
		if((test.getText().length()) > 10) {
			System.out.println("10 초과 작성 완련");
		} else {
			System.out.println("11자 이상 작성해주셔야 합니다.");
		}
	}
	
	// 실행 확인 메소드
	public void display(String eventName, KeyEvent e) {
		char ch = e.getKeyChar();
		int keyNum = e.getKeyCode();
		
		String modifier = e.isControlDown() + ", " + e.isAltDown() + ", " + e.isShiftDown();
		System.out.println("이벤트명 : " + eventName);
		System.out.println("["+keyNum +"]" + ch);
		System.out.println("특수 키 여부 : " + modifier);
	}
	
}
