package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReviewEx2 extends JFrame {

	private int checkNum = 1;
	
	private double startTime;
	private double endTime;
	private JLabel label;
	
	
	public ReviewEx2 () {
		
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
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { 
					//어떤 버튼(컴포넌트)을 눌렀는지 객체 e 에 담김. 
					// => e.getSource();로 담긴 정보 가져옴(오브젝트형태)
					// (JButton)으로 다운 캐스팅.
					JButton btn = (JButton) e.getSource();
					// "1" => 1
					int btnNum = Integer.parseInt(btn.getText());
					//btn.getText() => 버튼에 저장된 text 가져오기
					//Integer.parseInt => 스트링을 인티저(숫차)형태로 반환
					if(btnNum == checkNum) {
						btn.setVisible(false);
						checkNum++;
						if(checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if(checkNum > 10) {
							endTime = System.currentTimeMillis();
							double time = (endTime-startTime)/1000;
							System.out.println(time+"초");
						}
					}
				}
			});
			c.add(btn);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewEx2 gui = new ReviewEx2();
	}

}
