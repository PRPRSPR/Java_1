package day14;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ReviewEx1 extends JFrame {

	
	public ReviewEx1 () {
		setTitle("랜덤 버튼 배치");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i+"");
			btn.setSize(50,50);
			int x = ran.nextInt(350)+50;
			int y = ran.nextInt(350)+50;
			btn.setLocation(x, y);
			c.add(btn);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewEx1 gui = new ReviewEx1();
	}

}
