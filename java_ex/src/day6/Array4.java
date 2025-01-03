package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int arr[][] = new int[4][2]; //4행 2열
		
		//ex)
		//{10,20}
		//{30,40}
		//{5,3}
		//{9,100}
		
		for(int i=0; i<arr.length; i++) { //i=행
			for(int j=0; j<arr[i].length; j++) { //j=열
				System.out.print(i+","+j+"번째 수 입력 : ");
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
			//arr[0] => {10,20} | arr[1] => {30,40} ... ==> 반복문으로 처리
		}
		
	}

}
