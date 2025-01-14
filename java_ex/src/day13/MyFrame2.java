package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	
	public MyFrame2() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane(); // 컨텐트팬 영역
		c.setBackground(Color.cyan); //배경색
		c.setLayout(new BorderLayout(10,10)); 
//		>> BorderLayout, 버튼간 간격(10,10)
		JButton btn1 = new JButton("1번버튼");
		JButton btn2 = new JButton("2번버튼");
		JButton btn3 = new JButton("3번버튼");
		JButton btn4 = new JButton("4번버튼");
		JButton btn5 = new JButton("5번버튼");
		c.add(btn1, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.NORTH);
		c.add(btn4, BorderLayout.SOUTH);
		c.add(btn5, BorderLayout.CENTER);
//		>> 상하좌우중앙 위치를 지정
		
		
		// 아래 세 코드는 거의 필수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		>> 종료버튼 누르면 프레임 닫고 응용프로그램 종료
		setSize(300,300); // >> 프레임 크기
		setVisible(true); // >> 프레임 출력 (디폴트 : 최소화)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame2 gui = new MyFrame2();
		
	}

}
