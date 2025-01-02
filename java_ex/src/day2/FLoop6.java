package day2;

import java.util.Scanner;

public class fLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q. 스캐너로 숫자 하나 입력받아서 1부터 입력받은 숫자까지의 
		//홀수들의 합, 짝수들의 합 구하기
		//홀수들의 합 : 000, 짝수들의 합 : 000
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt(); //value
		int sum1=0; //oddsum
		int sum2=0; //evensum
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				sum1+=i;
			} else {
				sum2+=i;
			}
		}
		
		System.out.println("홀수들의 합 : "+sum1);
		System.out.println("짝수들의 합 : "+sum2);
	}

}
