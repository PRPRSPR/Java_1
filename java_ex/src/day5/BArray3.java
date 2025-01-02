package day5;

import java.util.Arrays;

public class BArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,4,1};
		
		// 1,2,3,4,5 로 정렬하여 출력하기
		//버블정렬 - 인접한 값끼리 비교하여 정렬
		//ex) 3:5, 5:2 -> 5와 2 자리 변경 >> 3,2,4,1,5 >> 3:2 부터 재비교.
//		for(int i=arr.length-1; i>0; i--) { // arr.length = 5 | i = 4,3,2,1
//			for(int j=0; j<i; j++) {
//				if(arr[j]>arr[j+1]) { // j<i가 조건. 최대 인덱스 길이를 넘지않아 오류가 발생하지 않음
//					//arr[j] 값과 arr[j+1] 값의 위치 변경
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
