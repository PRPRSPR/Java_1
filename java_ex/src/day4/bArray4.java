package day4;

import java.util.Arrays;
import java.util.Scanner;

public class bArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		System.out.println("숫자 5개를 입력해주세요.");
		for(int i=0; i<arr.length;i++) {
			System.out.print((i+1)+"번째 값 입력 : ");
//			int input =scan.nextInt();
//			arr[i]=input;
			arr[i]=scan.nextInt(); //한줄로 입력 가능.
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
