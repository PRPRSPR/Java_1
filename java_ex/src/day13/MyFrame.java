package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane(); // 컨텐트팬 영역
		c.setBackground(Color.cyan); //배경색
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,30)); 
//		>> 배치관리자. 아래 버튼의 크기, 위치(FlowLayout.LEFT(정렬),30,30(간격)) 조정됨 
//		>> FlowLayout, BorderLayout, GridLayout, CardLayout
		JButton btn1 = new JButton("1번버튼");
		JButton btn2 = new JButton("2번버튼");
		JButton btn3 = new JButton("3번버튼");
		c.add(btn1); //배경에 버튼달기
		c.add(btn2);
		c.add(btn3);
		for(int i=0; i<10; i++) { // java 문법 그대로 사용 가능
			c.add(new JButton("test"+i));
		}
		
		
		// 아래 세 코드는 거의 필수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		>> 종료버튼 누르면 프레임 닫고 응용프로그램 종료
		setSize(300,300); // >> 프레임 크기
		setVisible(true); // >> 프레임 출력 (디폴트 : 최소화)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame gui = new MyFrame();
		
	}

}
