package day2;

import java.util.Scanner;

public class FLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("(1)추가 (2)판매 (3)종료");
			int choice=scan.nextInt();
			if(choice==1) {
				System.out.println("추가되었습니다.");
			} else if(choice==2) {
				System.out.println("판매되었습니다.");
			} else if(choice==3) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("없는 메뉴 입니다.");
			}
		}
	}

}
