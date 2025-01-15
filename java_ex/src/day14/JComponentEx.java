package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	
	public JComponentEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("버튼 컴포넌트");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("색상 버튼");
		JButton btn2 = new JButton("비활성 버튼");
		JButton btn3 = new JButton("버튼 활성화");
		
		btn1.setBackground(Color.cyan); // 버튼 배경색
		btn1.setForeground(Color.blue); // 버튼 글자색
		btn1.setFont(new Font("", Font.BOLD, 20)); // 버튼 폰트, 스타일, 크기
		
		btn2.setEnabled(false); // 비활성화
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				btn2.setEnabled(!btn2.isEnabled());
				btn1.setVisible(false); // 컴포넌트가 사라진게 아니고 안보이게 한 것
				c.remove(btn1); // 화면 갱신이 되지 않아 버튼이 그대로 보임
				revalidate();
				repaint();
//				>> 화면 갱신. btn1이 삭제되어 보이지 않게됨.
			}
		});
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
