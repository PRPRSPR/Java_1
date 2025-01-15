package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	public ButtonEx() {

		setTitle("레이블 실습");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image1 = new ImageIcon("d14image/9055353_bxs_phone_call_icon.png");
		ImageIcon image2 = new ImageIcon("d14image/9024698_phone_call_light_icon.png");
		ImageIcon image3 = new ImageIcon("d14image/8726191_phone_volume_icon.png");
		
		JButton btn = new JButton(image1); // 이미지가 들어간 버튼 만들기
		btn.setRolloverIcon(image2); // 마우스가 올려졌을떄 출력되는 이미지
		btn.setPressedIcon(image3); // 마우스 클릭했을때 출력되는 이미지
		c.add(btn);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
