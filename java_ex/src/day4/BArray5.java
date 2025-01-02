package day4;

import java.util.Arrays;
import java.util.Scanner;

public class BArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5개의 숫자를 입력받아서 배열에 저장
		// 0이나 음수가 입력되면 배열에 저장되지 않고 다시 입력 받도록.
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		System.out.println("숫자 5개를 입력해주세요.");
		for(int i=0; i<arr.length;i++) {
			System.out.print((i+1)+"번째 값 입력 : ");
			int input=scan.nextInt();
			if(input>0) {
				arr[i]=input;
			} else {
				System.out.println("0보다 큰 수를 입력해주세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
