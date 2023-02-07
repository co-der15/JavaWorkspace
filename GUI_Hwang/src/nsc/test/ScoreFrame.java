package nsc.test;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {

	private JTextField javaScore, sqlScore;
	private JTextField total, average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		super("문제");
		
		setBounds(200,100,400,300);
		
		JPanel centerPane = new JPanel();
		centerPane.setLayout(new GridLayout(4,1,0,0));
		
		javaScore = new JTextField(10);
		sqlScore = new JTextField(10);
		
		JLabel title = new JLabel("점수를 입력하세요");
		title.setFont(new Font("맑은고딕", Font.BOLD,40));
		
		JPanel titlePane = new JPanel();
		titlePane.add(title);
		
		JPanel centerPane1 = new JPanel();
		centerPane1.add(new JLabel("점수 : "));
		centerPane1.add(javaScore);
		centerPane1.add(new JLabel("      "));
		centerPane1.add(new JLabel("SQL : "));
		centerPane1.add(sqlScore);
		
		JPanel centerPane2 = new JPanel();
		calcBtn = new JButton("계산하기");
		calcBtn.addActionListener(new ActionHandler());
		
		centerPane2.add(calcBtn);
		
		JPanel centerPane3 = new JPanel();
		total = new JTextField(10);
		average = new JTextField(10);
		
		centerPane3.add(new JLabel("총점 : "));
		centerPane3.add(total);
		centerPane3.add(new JLabel("      "));
		centerPane3.add(new JLabel("평균 : "));
		centerPane3.add(average);
		
		centerPane.add(titlePane);
		centerPane.add(centerPane1);
		centerPane.add(centerPane2);
		centerPane.add(centerPane3);
		
		add(centerPane);

		setVisible(true);
		setBounds(300,300,400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int score1 = Integer.parseInt(javaScore.getText());
			int score2 = Integer.parseInt(sqlScore.getText());
			
			total.setText(String.valueOf(score1 + score2));
			average.setText(String.valueOf((score1 + score2) / 2));
			
			
		}
		
	}
	
	
}
