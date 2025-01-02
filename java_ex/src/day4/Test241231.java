package day4;

import java.util.Random;
import java.util.Scanner;

public class Test241231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하시오.
		
		String name = "홍길동";
		int age = 30;
		String addr = "인천";
		
		System.out.println(name+"의 나이는 "+age+", 주소는 "+addr+" 입니다.");
		
		
		//2. 스캐너를 통해 숫자를 입력받은 후 50이상의 숫자일 경우 
		//"50 이상 입니다." 아닐 경우 "50 미만 입니다." 출력하시오
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input2 = scan.nextInt();
		if (input2>=50) {
			System.out.println("50 이상 입니다.");
		} else {
			System.out.println("50 미만 입니다.");
		}
		
		
		//3. 스캐너를 통해 숫자를 입력받은 후 
		//홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
		//단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		
		System.out.print("숫자 입력 : ");
		int input3 = scan.nextInt();
		if (input3%2==1) {
			System.out.println("홀수");
		} else if(input3<=0||input3>=11) {
			System.out.println("계산할 수 없습니다.");
		} else {
			System.out.println("짝수");
		}
		
		
		//4. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 출력하시오.
		//(ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
		
		System.out.print("숫자 입력 : ");
		int input4 = scan.nextInt();
		for (int h = 1; h <= 9; h++) {
			System.out.println(input4 + "*" + h + "=" + input4 * h);
		}
		
		
		//5. 반복문을 통해 1부터 30까지 숫자 중 10~19의 숫자를 제외하고 화면에 출력하시오.
		//(ex, 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)
		
		for(int i=1; i<=30; i++) {
			if(i>=10&&i<=19) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		//6. 구구단을 출력하시오. 
		//단, 5단과 8단은 제외하고 출력
		
		for (int i = 2; i <= 9; i++) {
			if(i==5||i==8) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		
		
		//7. 랜덤 숫자(1~100)를 이용한 Up & Down 게임을 만드시오.
		
		Random ran=new Random();
		
		int num = ran.nextInt(100)+1;
		int count = 0;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int input7 = scan.nextInt();
			if(input7<num) {
				count++;
				System.out.println("UP!");
			} else if(input7>num) {
				count++;
				System.out.println("DOWN!");
			} else {
				count++;
				System.out.println("정답입니다!");
				System.out.println(count+"번 만에 맞추셨습니다.");
				break;
			}
		}
	}

}
