package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickExextends extends JFrame{

	public ClickAndDoubleClickExextends() {
		// TODO Auto-generated constructor stub
		
		setTitle("랜덤 색상");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);

		Container c = getContentPane();
		
		Random ran = new Random();
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getClickCount() == 2) {
					int r = ran.nextInt(256);
					int g = ran.nextInt(256);
					int b = ran.nextInt(256);
					c.setBackground(new Color(r,g,b));
				}
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickExextends();
	}

}
