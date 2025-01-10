package day11;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		System.out.println("빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		String str = scan.next();
		
		for(int i=0; i<str.length(); i++) {
			String first = str.substring(0, 1);
			String last = str.substring(1);
			str = last + first;
			System.out.println(str);
		}
		
	}

}
