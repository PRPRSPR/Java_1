package day4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너를 통해 숫자 5개를 입력받고 가장 작은 수를 구하시오.
		Scanner scan=new Scanner(System.in);
		int min = 0;
		
		System.out.println("숫자 5개를 입력해주세요.");
		for(int i=1; i<=5; i++) {
			System.out.print(i+"번째 숫자 : ");
			int input = scan.nextInt();
			if(i==1) {
				min=input;
				continue;
//			} else {
//				min=(input<min)?input:min;
			}
			min=(input<min)?input:min;			
		}
		System.out.println("가장 작은 수 : "+min);
	}

}
