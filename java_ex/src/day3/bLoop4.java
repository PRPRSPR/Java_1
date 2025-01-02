package day3;

import java.util.Scanner;

public class bLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자를 입력받고 선택한 메뉴에 따라서 더하거나 빼기
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		while(true) {//무한루프됨.
			System.out.println("메뉴 선택");
			System.out.println("(1)덧셈 (2)뺄셈 (3)결과 (4)종료");
			int menu = scan.nextInt();
			if(menu==1) {//값을 입력받아 sum에 더하기
				System.out.print("더할 숫자를 입력 : ");
				sum += scan.nextInt(); 
//				int value = scan.nextInt();
//				sum += value;
			} else if(menu==2) {//값을 입력받아 sum에 빼기
				System.out.print("뺄 숫자를 입력 : ");
				sum-=scan.nextInt();
			} else if(menu==3) {//sum 출력
				System.out.println("현재 값 : "+sum);
			} else if(menu==4) {//프로그램 종료
				System.out.println("종료되었습니다.");
				break;
			} else {//그 외 값을 입력했을 경우 출력.
				System.out.println("1~4 중 하나를 입력해주세요.");
			}
		}
	}

}
