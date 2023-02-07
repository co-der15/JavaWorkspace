package com.kh.component;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxTest extends JFrame {

	public CheckBoxTest() {
		super("과일 선택하기");
		
		String[] fruit = {
					"수박", "멜론", "복숭아", "두리안", "기위"
		};
		
		JCheckBox[] box = new JCheckBox[5];
		
		// checkbox 반복문
		for(int i = 0; i < box.length; i++) {
			box[i] = new JCheckBox(fruit[i]);
		}
		
		
		JPanel pan = new JPanel();
		for(int i = 0; i < box.length; i++) {
			pan.add(box[i]);
		}
		
		JLabel label = new JLabel("과일을 선택해주세요!");
		
		// 과일을 선택할 경우 label 내용 변경하기
		for(int i = 0; i < box.length; i++) {
			box[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// v 로 체크하면 true, 아니면 false
					// isSelected()
					
					String str = "";
					int cnt = 0; // 체크한 과일 수
					
					for(int i = 0; i < box.length; i++) {
						if(box[j].isSelected()) {
							str += box[j].getText() + " ";
							
							cnt++;
						}
					}
					
					if(cnt == 0) {
						str = "과일을 선택해주세요!";
					}
					label.setText(str); 
					
				}
				
			});
		}
		
		setLayout(new BorderLayout());
		
		add(pan, "Center");
		add(label, "South");
		
		// 현재 컴포넌트들 기준으로 크기를 자동으로 맞춰주는 메소드
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		new CheckBoxTest();

	}

}











