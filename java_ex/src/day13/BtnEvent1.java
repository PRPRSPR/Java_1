package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnEvent1 extends JFrame {
	
	public BtnEvent1() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane(); // 컨텐트팬 영역
		c.setBackground(Color.cyan); //배경색
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new MyEvent());
//		>> 이벤트 발생하려면 Listener 필요 // new MyEvent() 이벤트 객체 필요
		c.add(btn1);
		
		JButton btn2 = new JButton("Action");
		btn2.addActionListener(new MyEvent());
		c.add(btn2);
		
		// 아래 세 코드는 거의 필수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		>> 종료버튼 누르면 프레임 닫고 응용프로그램 종료
		setSize(300,300); // >> 프레임 크기
		setVisible(true); // >> 프레임 출력 (디폴트 : 최소화)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BtnEvent1 gui = new BtnEvent1();
		
	}

}

class MyEvent implements ActionListener{ 
//	 ActionListener => 인터페이스 >> 추상메소드 오버라이딩 해야함

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton) e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
		
	}
	
}
