package com.kh.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame {

	public TextAreaTest() {
		super("길동이의 나홀로 체팅방");
		
		// 프레임에 담을
		// JPanel 준비하기
		JPanel pan = new JPanel();
		
		pan.setLayout(new BorderLayout());
		
		JTextArea area = new JTextArea();
		JTextField text = new JTextField();
		
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 택스트 필드에 어떤 이벤트가 발생했을 때
				// 텍스트에리어에 필드의 값을 전달하는 기능
				
				String str = text.getText();
				
				area.append(str + "\n");
				
				text.setText("");
				
			}
		
		});
		
		pan.add(area, "Center");
		pan.add(text, "South");
		add(pan);
		
		setBounds(300,300,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TextAreaTest();
	}

}
