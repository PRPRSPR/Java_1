package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[6];
		while(true) {
			System.out.println("숫자 6개 입력");
			for(int i=0; i<arr.length; i++) {
				System.out.print((i+1)+"번째 숫자 : ");
				int input = scan.nextInt();
				if(input<1 || input>100) {
					System.out.println("1~100 사이로 입력해주세요.");
					i--;
				}else if(input%5==0) {
					System.out.println("5의 배수는 입력할 수 없습니다.");
					i--;
				}else {
					arr[i] = input;
				}
			}
			System.out.println(Arrays.toString(arr));
			break;
		}
	}

}
