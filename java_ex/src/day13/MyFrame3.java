package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame {
	
	public MyFrame3() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane(); // 컨텐트팬 영역
		c.setBackground(Color.cyan); //배경색
		
		c.setLayout(new GridLayout(4,3,5,10));
//		>> GridLayout 행,열,버튼간격(n,m,i,j)
		GridLayout grid = new GridLayout(4,3);
		grid.setVgap(5);
		grid.setHgap(10);
		c.setLayout(grid);
//		>> 위와 동일함
		
		for(int i=1; i<=9; i++) {
			c.add(new JButton(i+""));
		}
		c.add(new JButton("+"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
//		>> 계산기 버튼 배치
		
		
		// 아래 세 코드는 거의 필수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		>> 종료버튼 누르면 프레임 닫고 응용프로그램 종료
		setSize(300,300); // >> 프레임 크기
		setVisible(true); // >> 프레임 출력 (디폴트 : 최소화)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame3 gui = new MyFrame3();
		
	}

}
