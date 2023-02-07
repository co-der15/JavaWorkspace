package com.kh.event.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventTest extends JFrame 
							implements MouseListener, 
									   MouseMotionListener {

	public MouseEventTest() {
		super("마우스 이벤트 테스트");
		
		setBounds(300, 300, 300, 200);
		
		JPanel pan = new JPanel();
		pan.addMouseListener(this);
		pan.addMouseMotionListener(this);
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// 마우스가 특정 객체를 끌고 다닐 때 감지
		display("Dragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스가 움직일 때 감지
		display("Moved", e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스로 클릭했을 때 감지
		display("Clicked", e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스로 클릭한 상태가 지속될 때 감지
		display("Pressed", e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 마우스가 클릭에서 해방되었을 때 감지 (손 떼었을 때)
		display("Released", e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 특정 객체 안에 들어왔을 때
		display("Entered", e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 특정 객체에서 벗어날 때
		display("Exited", e);
	}
	
	public void display(String eventName, MouseEvent e) {
		System.out.println(
				eventName + " : "
			  + "[x] : " + e.getX()
			  + "[y] : " + e.getY()
			  + "[clickType] : " + e.getClickCount()
			  + "[clickBtn] : " + e.getButton()
				);
	}
	public static void main(String[] args) {
		
		new MouseEventTest();
	}
}
