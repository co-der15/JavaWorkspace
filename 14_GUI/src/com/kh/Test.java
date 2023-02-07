package com.kh;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {
	public Test() {
		super("GUI Test");
		setBounds( 300, 300, 443, 293);
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(0, 0, 434, 261);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello, Everyone!");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 157, 187, 46);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click Me !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel.setText("Hi Hello 안녕!");
				
			}
		});
		
		btnNewButton.setBounds(166, 213, 97, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(34, 32, 97, 115);
		panel_1.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(166, 33, 97, 115);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(297, 32, 91, 115);
		panel_1.add(panel_3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
