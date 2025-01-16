package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame {
	
	public RadioButtonEx() {
		// TODO Auto-generated constructor stub
		setTitle("라디오버튼");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup gender = new ButtonGroup(); // 그룹 만들기
		
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		gender.add(radio1);
		gender.add(radio2);
		c.add(radio1);
		c.add(radio2);
//		>> 그룹으로 묶지 않으면 두 버튼을 중복 선택할 수 있음
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
