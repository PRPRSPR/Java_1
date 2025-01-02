package day3;

import java.util.Scanner;

public class fStringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String input=scan.next();
		
		//문자열은 equals() 메소드를 사용
		//숫자는 == 사용
		if(input.equals("종료")) { //input=="종료" 하면 else 작업 실행됨.
			System.out.println("종료되었습니다.");
		} else {
			System.out.println("실행 중입니다.");
		}
	}

}
