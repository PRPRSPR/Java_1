package day5;

import java.util.Arrays;
import java.util.Random;

public class BArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열을 사용해 랜덤한 숫자 6개 출력 +중복없이
		
		Random ran = new Random();
		
		int arr[] = new int[6];
		
//		for(int i=0; i<arr.length; i++) {
//			int ranNum = ran.nextInt(45)+1; // 1~45
//			arr[i] = ranNum;
//		}

		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(45)+1;
			for(int j=0; j<i; j++) { // j<i 첫번째 값, 값이 0인 배열의 비교를 막아줌. 효율적.
				if(ranNum==arr[j]) { 
					System.out.println("중복된 숫자 있음");
					
				}
			}
			arr[i] = ranNum;
		}

		
		System.out.println(Arrays.toString(arr));
	}

}
