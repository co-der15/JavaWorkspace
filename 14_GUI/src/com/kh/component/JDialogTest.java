package com.kh.component;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JDialogTest extends JFrame {

	public JDialogTest() {
		super("다이얼로그 테스트");
		
		JPanel pan = new JPanel();
		JLabel label1 = new JLabel("hi");
		JTextField ft = new JTextField(20);
		JButton btn1 = new JButton("기본 다이얼로그");
		
		Dialog di = new Dialog(this, "기본 다이얼로그입니다!");
		
		di.setBounds(300, 300, 150, 150);
		di.add(new JLabel("다이얼로그 내용 ..."));

		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭 시 다이얼로그 표시하기
				di.setVisible(true);
			}
		});

		JButton btn2 = new JButton("닫기 버튼");

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				di.dispose();
			}
		});
		
		// 값을 입력받는 JOptionPanel 사용하기
		JButton btn3 = new JButton("입력값 작성 버튼");
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// String result = JOptionPane.showInputDialog("내용을 입력하세요!");
				int result = JOptionPane.showConfirmDialog(pan, "약관에 동의하시겠습니까?"); 
						
				System.out.println("result : " + result);
			}
		});
		
		pan.add(label1);
		pan.add(ft);
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		add(pan);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new JDialogTest();

	}

}