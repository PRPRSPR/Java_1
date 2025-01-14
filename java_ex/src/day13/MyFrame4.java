package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {
	
	public MyFrame4() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane(); // 컨텐트팬 영역
		c.setBackground(Color.cyan); //배경색
		
//		>> 배치관리자 => null
		c.setLayout(null);
//		c.add(new JButton("test"));
//		>> 배치 지정 x. 아무것도 나오지 않음.
		JButton btn1 = new JButton("test");
//		btn1.setSize(75, 75);
//		btn1.setLocation(100,200);
//		>> 버튼 사이즈, 좌표 지정
//		c.add(btn1);
//		>> 타이틀바 포함 300,300이기 때문에 버튼(사이즈 75, 위치 200)이 일부 잘려서 나옴
		btn1.setSize(60, 60);
		btn1.setLocation(210,75);
		c.add(btn1);
		
		for(int i=1; i<=9; i++) {
			JButton btn = new JButton(i+"");
			btn.setSize(50,20);
			btn.setLocation(i*15, i*15);
			c.add(btn);
		}
		
		// 아래 세 코드는 거의 필수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		>> 종료버튼 누르면 프레임 닫고 응용프로그램 종료
		setSize(300,300); // >> 프레임 크기
		setVisible(true); // >> 프레임 출력 (디폴트 : 최소화)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame4 gui = new MyFrame4();
		
	}

}
