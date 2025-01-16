package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame {
	
	public CheckBoxEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("체크박스");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("배",true); // 체크된 상태로 출력
		
		ImageIcon phone1 = new ImageIcon("d14image/9055353_bxs_phone_call_icon.png");
		JCheckBox check3 = new JCheckBox(phone1);
		ImageIcon phone2 = new ImageIcon("d14image/9024698_phone_call_light_icon.png");
		check3.setBorderPainted(true); // 이미치 테두리
		check3.setSelectedIcon(phone2); // 선택 시 이미지 변경
		
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}

}
