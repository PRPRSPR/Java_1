package practice;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		// 랜덤한 숫자 6개를 배열에 넣기 (범위 1~45)
		// +중복되는 숫자가 없도록 해보기
		
		int arr[]=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(45)+1; //arr[] = {0,1,2,3,4,5}
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) { // 0==1, 0==2, 0==3...
					System.out.println("중복 제거");
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
