package com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator2 extends JFrame {

	public Calculator2() {
		super("OO's 사칙연산 계산기 ver 1.0");

		JPanel pan = new JPanel();
		
		JLabel lb1 = new JLabel("숫자 입력 : ");
		JTextField tf1 = new JTextField(15);
		
		JLabel lb2 = new JLabel("숫자 입력 : ");
		JTextField tf2 = new JTextField(15);
		
		JLabel lb3 = new JLabel("결과 확인 : ");
		JTextField result = new JTextField(15);
		
		result.setEditable(false); // 사용자가 수정 못하도록 막는다.
		
		pan.add(lb1);
		pan.add(tf1);
		pan.add(lb2);
		pan.add(tf2);
		
		JButton[] btns = new JButton[4];
		String[] oper = { " + ", " - ", " * ", " / "};
	
		for(int i = 0 ; i < btns.length; i++) { 
			btns[i] = new JButton(oper[i]);
			btns[i].addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// 결과 확인 버튼을 클릭했을 때,
					// 실행할 코드 구현하기
					
					// 1. 텍스트 필드의 숫자값을 가져와서
					//    숫자라면 파싱처리하기
					String text1 = tf1.getText();
					String text2 = tf2.getText();
					int num1 = 0, num2 = 0;
					
					try {
						num1 = Integer.parseInt(text1);
						num2 = Integer.parseInt(text2);
						
						// 2. 파싱 처리한 숫자 계산하기
						switch(e.getActionCommand().trim()) {
						case "+" : result.setText( String.valueOf(num1 + num2) );
							 	   break;
						case "-" : result.setText( String.valueOf(num1 - num2) );
								   break;
						case "*" : result.setText( String.valueOf(num1 * num2) );
								   break;
						case "/" : result.setText( String.valueOf(num1 / num2) );
								   break;
						}
						
					} catch(NumberFormatException ex) {
						
						result.setText("숫자가 아닙니다!");
						
					} catch(ArithmeticException ex) {
						
						result.setText("0은 나눌 수 없습니다.");
					}
				}
			});
			pan.add(btns[i]);
		}
	
		pan.add(lb3);
		pan.add(result);
		
		add(pan);
		
		setBounds(300, 300, 280, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

}