package day6;

import java.util.Arrays;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[3][3];
		
		Random ran = new Random();
		
		// arr의 모든 요소의 값을 1~20사이의 랜덤한 값으로 넣기
		// 그 후 모든 수의 평균 구하기
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=ran.nextInt(20)+1;
				sum+=arr[i][j];
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("모든 수의 합 : "+sum);
		System.out.println("평균 : "+(double)sum/(arr.length*arr[0].length));
		
	}

}
