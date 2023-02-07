package com.kh.component;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest extends JFrame {

	public ComboBoxTest() {
		super("콤보박스 테스트");
		
		String[] item = {"cat", "dog", "tiger", "user"};
		
		JComboBox itemList = new JComboBox(item);
		
		// 기본값 정의
		itemList.setSelectedIndex(3);
		
		JLabel label = new JLabel();
		
		itemList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 어떤 메뉴를 골랐는지 확인해서 그 값을 가져오는 기능 수행
				JComboBox box = (JComboBox) e.getSource();
				
				//System.out.println(box.getSelectedItem());
				
				String filename = (String) box.getSelectedItem();
				
				Image myImg = new ImageIcon("images/" + filename + ".PNG")
									.getImage()
									.getScaledInstance(150, 150, DO_NOTHING_ON_CLOSE);
				
				label.setIcon(new ImageIcon(myImg));
				
			}
			
		});
		
		setLayout(new BorderLayout());
		add(itemList, "North");
		add(label, "Center");
		
		setSize(300, 200);
		setLocation(300,300);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ComboBoxTest();

	}

}
