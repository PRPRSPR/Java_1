package day4;

import java.util.Arrays;
import java.util.Random;

public class BArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		// 랜덤한 숫자 6개를 배열에 넣기 (범위 1~45)
		// +중복되는 숫자가 없도록 해보기
		
		int arr[]=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(45)+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
