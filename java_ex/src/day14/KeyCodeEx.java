package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame {

	public KeyCodeEx() {
		setTitle("키 입력 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);

		Container c = getContentPane();
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar()=='%') {
					c.setBackground(Color.cyan);
				}else if (e.getKeyCode()== KeyEvent.VK_F1) {
					c.setBackground(Color.lightGray);
				}
			}
		});
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new KeyCodeEx();
	}

}
