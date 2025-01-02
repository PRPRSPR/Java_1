package day2;

import java.util.Scanner;

public class dScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next(); //scan.next(); 문자열을 입력받을 수 있는 기능
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); //scan.nextInt(); 숫자를 입력받을 수 있는 기능
		
		System.out.println(name+"의 나이는 "+age+" 입니다.");
		//실행시 콘솔에 입력된 내용으로 프린트됨.
		
		
	}

}
