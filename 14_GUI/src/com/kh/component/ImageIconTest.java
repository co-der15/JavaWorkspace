package com.kh.component;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageIconTest extends JFrame {

	public ImageIconTest() {
		super("이미지 표시 변경하기");
		
		JPanel pan = new JPanel();
		
		Image myImg = new ImageIcon("images/dog.PNG")
						.getImage()
						.getScaledInstance(150,150,0);
		
		JLabel label = new JLabel(new ImageIcon(myImg));
		
		pan.add(label);
		
		JButton btn = new JButton("이미지 변경");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Image temp = new ImageIcon("images/ryan.gif")
								.getImage()
								.getScaledInstance(150, 150, 0);
								// DO_NOTHING_ON_CLOSE : 0
								// HIDE_ON_CLOSE : 1
								// DISPOSE_ON_CLOSE : 2
								// EXIT_ON_CLOSE : 3
				
				label.setIcon(new ImageIcon(temp));
			}
			
		});
		
		setLayout(new BorderLayout());
		add(pan, "Center");
		add(btn, "South");
		
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new ImageIconTest();

	}

}
