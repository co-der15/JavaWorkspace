package com.kh.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	
	public Calculator() {
		super("Max's Calculator ver 2.0");
		
		JPanel pan = new JPanel();
		
		JLabel jl1 = new JLabel("숫자 입력 : ");
		JTextField jtf1 = new JTextField(15);
		
		JLabel jl2 = new JLabel("숫자 입력 : ");
		JTextField jtf2 = new JTextField(15);
		
		JLabel jl3 = new JLabel("결과 확인 : ");
		JTextField result = new JTextField(15);
		
		result.setEditable(false);
		
		JButton[] btn = new JButton[4];
		String[] oper = {" + ", " - ", " * ", " / "};
		
		for(int i = 0; i < btn.length;i++) {
			btn[i] = new JButton(oper[i]);
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int num1 = 0, num2 = 0;
					
					String text1 = jtf1.getText();
					String text2 = jtf2.getText();
					
					
					
				}
				
			});
			
		}
		
		
		add(pan);
		
		pan.add(jl1);
		pan.add(jtf1);
		pan.add(jl2);
		pan.add(jtf2);
		pan.add(jl3);
		pan.add(result);

		
		
		setVisible(true);
		setBounds(300,300,280,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
