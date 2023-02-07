package com.kh.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	
	public D_CardLayout() {
		// CardLayout :
		//    하나의 컨테이너 안에서
		//    여러 개의 컴포넌트들을 겹쳐 놓고
		//    각각의 컴포넌트에 순서를 매겨
		//    앞장, 뒷장의 배치 형태로
		//    특정 이벤트가 발생했을 때
		//    컴포넌트를 변경하는 방법
		
		super("카드 레이아웃 테스트");
		
		setBounds(300, 300, 500, 800);
		
		CardLayout cards = new CardLayout();
		
		setLayout(cards);
		
		// JPanel : 컴포넌트(요소)이면서
		//          각각이 컨테이너 역할을 하는
		//          배치 전용 컴포넌트
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// 각 컴포넌트에 배경색 입히기
		card1.setBackground(Color.ORANGE);
		card2.setBackground(Color.GREEN);
		card3.setBackground(Color.PINK);
		
		// JLabel : 이름표(평범한 문자열을 표기하는 컴포넌트)
		card1.add(new JLabel("첫번째 카드"));
		card2.add(new JLabel("두번째 카드"));
		card3.add(new JLabel("세번째 카드"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// 각 패널에 이벤트 추가하기
		// EventListener와 EventAdapter
		// EventListener는 특정 이벤트에 대한
		// 모든 감지요소를 가진 인터페이스이다.
		// 이러한 이벤트리스너는 내용을 구현 시
		// 미완성된 메소드 전부를 구현해야 하는 불편함이 있다.
		// 따라서 이를 보다 쉽게, 여러 이벤트 중 하나 등을 선택하여
		// 사용하기 위해 이벤트어댑터를 주로 사용한다.
		card1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					// 왼쪽 클릭했느냐!
					cards.next(card1.getParent());
				} else if(e.getButton() == 3) {
					// 우클릭이냐!
					cards.previous(card1.getParent());
				}
				
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					// 왼쪽 클릭했느냐!
					cards.next(card2.getParent());
				} else if(e.getButton() == 3) {
					// 우클릭이냐!
					cards.previous(card2.getParent());
				}
				
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					// 왼쪽 클릭했느냐!
					cards.next(card3.getParent());
				} else if(e.getButton() == 3) {
					// 우클릭이냐!
					cards.previous(card3.getParent());
				}
				
			}
		});
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
