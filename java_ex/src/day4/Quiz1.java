package day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 통해 숫자(양의 정수) 5개를 입력받고 입력받은 수 중에서
		// 가장 큰 수, 가장 작은 수, 입력한 수들의 평균을 구하시오.

		Scanner scan = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int sum = 0;

		System.out.println("숫자를 5개 입력해주세요.");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int num = scan.nextInt();
			sum += num;
			if (i == 1) {
				max = num;
				min = num;
			} else {
				if (num > max) { //max=Math.max(max,num);
					max = num;
				} else if (num < min) {//min=Math.min(min,num);
					min = num;
				}
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		System.out.println("평균 : " + ((double)sum / 5));
	}

}
