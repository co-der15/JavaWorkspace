package com.kh.layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class E_GridBagLayout extends JFrame {

	public E_GridBagLayout() {
		// GridBagLayout :
		//    특정한 영역 안의 각 컴포넌트들을
		//    가로, 세로의 기준을 세워
		//    사이즈를 정의한 후 배치하는 방식
		
		super("그리드 백 레이아웃 테스트");
		
		GridBagLayout gridBag = new GridBagLayout();
		
		setLayout(gridBag);
		setBounds(300, 300, 500, 500);
		
		// 제약조건 :
		//   각 행 별로 배치하기 위한 별도의 제약 사항을 설정한다.
		//   이를 직접 설정하기 위해 GridBagConstraints 객체를 생성한다.
		
		GridBagConstraints cons = new GridBagConstraints();
		
		// 제약조건을 설정할 수 있는 사항들
		cons.fill = GridBagConstraints.BOTH;
		// BOTH : 가로, 세로 모두 직접 설정하는 것
		// HORIZONTAL : 가로만 설정
		// VERTICAL : 세로만 설정
		// NONE : 별도의 변경사항 없이 설정하겠다.
		
		// 각 컴포넌트가 차지할 공간 비율(가로 측에 대한 비율)
		cons.weightx = 1.0; 
		/*
		JButton btn1 = new JButton("1번 버튼");
		gridBag.setConstraints(btn1, cons);
		add(btn1);
		
		JButton btn2 = new JButton("2번 버튼");
		gridBag.setConstraints(btn2, cons);
		add(btn2);
		
		JButton btn3 = new JButton("3번 버튼");
		gridBag.setConstraints(btn3, cons);
		add(btn3);
		*/
		
		makeMyBtn("1번 버튼", gridBag, cons);
		makeMyBtn("2번 버튼", gridBag, cons);
		makeMyBtn("3번 버튼", gridBag, cons);
		
		// 한 줄의 마지막 컴포넌트 선언
		cons.gridwidth = GridBagConstraints.REMAINDER;
		makeMyBtn("4번 버튼", gridBag, cons);
		
		// 두번째 줄 공간 설정하기
		cons.weightx = 0.0;
		makeMyBtn("5번 버튼", gridBag, cons);
		
		// 두번째 줄의 마지막 전 위치까지 선언
		cons.gridwidth = GridBagConstraints.RELATIVE;
		makeMyBtn("6번 버튼", gridBag, cons);
		
		cons.gridwidth = GridBagConstraints.REMAINDER;
		makeMyBtn("7번 버튼", gridBag, cons);
		
		cons.gridwidth = 1;
		cons.gridheight = 2;
		cons.weightx = 1.0;
		makeMyBtn("8번 버튼", gridBag, cons);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 그리드 백 설정 적용 메소드 만들기
	public void makeMyBtn(
					String name, // 버튼 이름
					GridBagLayout grid, // 설정할 그리드 백 레이아웃
					GridBagConstraints cons // 그리드백 제약조건
				) {
		
		JButton btn = new JButton(name);
		grid.setConstraints(btn, cons);
		this.add(btn);
		
	}
}
