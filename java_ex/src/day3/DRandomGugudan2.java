package day3;

import java.util.Random;
import java.util.Scanner;

public class DRandomGugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

//		System.out.println("랜덤 구구단 입니다. 0을 입력하면 종료됩니다.");
//		
//		int total = 0; //총 문제수
//		int count = 0; //정답횟수
//		while(true) {//무한루프
//			int x=ran.nextInt(8)+2; //2~9
//			int y=ran.nextInt(9)+1; //1~9
//			System.out.print(x+"*"+y+"=");
//			int answer = scan.nextInt();
//			if(answer==0) {//프로그램종료. ~문제 중 ~문제 맞추셨습니다.
//				System.out.println("총 "+total+"문제 중 "+count+"문제 맞추셨습니다.");
//				System.out.println("종료되었습니다.");
//				break;
//			} else if (answer==x*y) { //정답인경우
//				System.out.println("정답입니다.");
//				count++; //정답 카운트
//				total++; //푼 문제 카운트
//			} else { //오답인경우
//				System.out.println("오답! 정답은 "+(x*y)+" 입니다.");
//				total++; //푼 문제 카운트
//			}
//		}
		
		while(true) {
			System.out.println("문제 수를 입력해주세요. 0을 입력하면 종료됩니다.");
			int total=scan.nextInt(); //풀어야하는 문제수
			int count = 0; //정답횟수
			if(total<1) {//total<=0
				System.out.println("종료되었습니다.");
				break;
			}
			for(int i=1;i<=total;i++) { //i <문제수
				int x=ran.nextInt(8)+2;
				int y=ran.nextInt(9)+1;
				System.out.print(x+"*"+y+"=");
				int answer = scan.nextInt();
				if (answer==x*y) { //정답
					System.out.println("정답입니다.");
					count++; //정답횟수
				} else { //오답
					System.out.println("오답! 정답은 "+(x*y)+" 입니다.");
				}
//				if(i==total) {
//					System.out.println("총 "+total+"문제 중 "+count+"문제 맞추셨습니다.");
//				}
			}
			System.out.println("총 "+total+"문제 중 "+count+"문제 맞추셨습니다."); //for문 안 if보다 깔끔
		}

		

	}

}
