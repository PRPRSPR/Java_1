package practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 성적 평균 계산기

		System.out.println("성적 평균 계산하기!");
		System.out.print("이름 기입 후 시작하기 : ");
		String name=scan.next();
		
		int i = 0;
		double sum = 0;
		
		System.out.println(name+"님 반갑습니다. 원하시는 메뉴의 번호를 입력해주세요.");
		
		while (true) {
			System.out.println("1.과목 추가" + '\t' + "2.평균 확인" + '\t' + "3.종료");
			System.out.print("=> ");
			int num = scan.nextInt();
			
			if(num==3) {
				System.out.println("종료되었습니다. 감사합니다.");
				break;
			}
			while (true) {
				if (num == 1) {
					System.out.println("1.과목 추가");
					System.out.println("점수를 입력해주세요. 0을 입력하면 메뉴 선택으로 돌아갑니다.");
					System.out.print("과목" + (i+1) + " : ");
					double scr = scan.nextDouble();
					if (scr == 0) {
						System.out.println("메인 메뉴로 돌아갑니다.");
						System.out.println();
						break;
					} else if(scr<=100) {
						sum += scr;
						i++;
						System.out.println();
						continue;
					} else {
						System.out.println();
						System.out.println("정확한 수치를 입력해주세요.");
						System.out.println();
						continue;
					}
				} else if(num==2) {
					System.out.println("현재 점수를 입력하신 과목은 총 "+i+"과목 입니다.");
					System.out.println("1.계속 진행"+'\t'+"2.돌아가기");
					System.out.print("=> ");
					int num2 = scan.nextInt();
					if (num2==1) {
						System.out.println();
						System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						System.out.println(name+"님의 평균은 "+(sum/i)+"점 입니다.");
						System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						System.out.println();
						System.out.println("메인 메뉴로 돌아갑니다.");
						System.out.println();
						break;
					} else if(num2==2) {
						System.out.println("메인 메뉴로 돌아갑니다.");
						System.out.println();
						break;
					} else {
						System.out.println("정확한 번호를 입력해주세요.");
						System.out.println();
						continue;
					}
				} else {
					System.out.println("정확한 번호를 입력해주세요.");
					System.out.println();
					break;
				}
			}

		}
	}

}
