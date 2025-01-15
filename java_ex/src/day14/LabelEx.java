package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	
	public LabelEx() {
		// TODO Auto-generated constructor stub
		setTitle("레이블 실습");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("자바 재밌다~");
		c.add(label);
		
		ImageIcon image1 = new ImageIcon("d14image/OIP.jpg"); // 이미지 상대경로
//		
//		Image image = image1.getImage();
//      Image scaledImage = image.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
//      ImageIcon scaledIcon = new ImageIcon(scaledImage);
//		>> 이미지 스케일 변경시 사용. (챗GPT)
		
		JLabel label2 = new JLabel(image1);
//		>> 스케일 변경 후에는 image1 -> scaledIcon 을 넣어줘야함.
		c.add(label2);
		
		ImageIcon phone1 = new ImageIcon("d14image/9024698_phone_call_light_icon.png");
		JLabel label3 = new JLabel("자바 좋아!", phone1, SwingConstants.CENTER);
//		>> 이미지와 문자열을 동시 출력
		c.add(label3);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
}	

}
