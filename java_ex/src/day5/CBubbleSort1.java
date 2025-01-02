package day5;

import java.util.Arrays;

public class CBubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q. 내림차순으로 정렬
		
		int arr[]= {3,5,2,4,1};
		
		//부등호 방향에 주의
//		for(int i=arr.length-1; i>0; i--) { // 1. i = 4,3,2,1
		for(int i=1; i<arr.length; i++) { // 2. i = 1,2,3,4
//			for(int j=0; j<i; j++) { // 1.방식으로 작성시에 사용할 수 있는 방법 
			// i=4,3,2,1 >> j<4, j<3, j<2, j<1
			for(int j=0; j<arr.length-i; j++) { // 2.방식으로 작성시에 사용할 수 있는 방법
			// i=1,2,3,4 | arr.length=5 >> j<4, j<3, j<2, j<1
				if(arr[j]<arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
