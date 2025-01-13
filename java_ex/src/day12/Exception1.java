package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// 입력받은 숫자 중 0이 나올 수 있음.
		
		while (true) {
			try {
				System.out.print("나뉘는 수 : ");
				int num1 = scan.nextInt();
				System.out.print("나눌 수 : ");
				int num2 = scan.nextInt();
				
				System.out.println(num1/num2);
				break;
				
			} catch (ArithmeticException e) { //java.lang 패키지.
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) { //java.util 패키지
				System.out.println("숫자 입력");
				scan.nextLine();
			} catch (Exception e) { // 상위 클래스
				System.out.println("예기치 못한 에러 발생");
				scan.nextLine();
			}
			
		}
	}

}
