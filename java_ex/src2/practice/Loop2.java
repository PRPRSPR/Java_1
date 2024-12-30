package practice;

import java.util.Random;
import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//랜덤 곱셈 문제 만들기
		
		while (true) {
			System.out.println("구구단을 외자! 구구단을 외자!");
			System.out.println("입력한 숫자만큼 문제를 냅니다. 0을 입력하면 종료됩니다.");
			int qst = scan.nextInt();
			int slt = 0;
			if(qst==0) {
				System.out.println("랜덤 곱셈 문제를 종료합니다.");
				break;
			}
			for(int i=1; i<=qst; i++) {
				System.out.println(i+")");
				int x = ran.nextInt(8)+2;
				int y = ran.nextInt(9)+1;
				System.out.print(x+"*"+y+"=");
				int ans = scan.nextInt();
				if(ans==(x*y)) {
					System.out.println("정답!");
					System.out.println();
					slt++;
				} else {
					System.out.println("오답! 정답은 "+(x*y)+" 입니다.");
					System.out.println();
				}
				
			}
			System.out.println("총 "+qst+"문제 중 "+slt+"문제 맞추셨습니다.");
			System.out.println();
		}
	}

}
