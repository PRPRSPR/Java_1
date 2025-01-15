package day14;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame{

	public MouseEvent1() {
		setTitle("마우스 이벤트");
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("test!"); //레이블(라벨)만들기
		label.setSize(50,20);
		label.setLocation(30, 30);
		
		c.add(label);
		
		c.addMouseListener(new MouseListener() { // 익명클래스로 이벤트리스너 작성
			// 인터페이스> 추상메소드 구현 필요. 오버라이딩 후 필요한 이벤트 코드 작성
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) { //마우스를 클릭했을때
				// TODO Auto-generated method stub
				int x = e.getX(); // 마우스가 클릭된 x 좌표
				int y = e.getY(); // 마우스가 클릭된 y 좌표
				label.setLocation(x, y); // 라벨의 위치를 마우스 클릭 위치로 변경
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEvent1 gui = new MouseEvent1();
	}

}
