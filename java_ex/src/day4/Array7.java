package day4;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가장 큰 값의 위치 구하기

//		int arr[]= {5,4,3,2,1};
//		int max=0;
//		int index=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//				index=i;
//			}
//		}
//		System.out.println(index);

		// 좀 더 축약 가능
//		int arr[]= {5,4,3,2,1};
//		int maxindex=0; //arr[maxindex]=5
//		
//		for(int i=1;i<arr.length;i++) { //i=0;도 가능하나 0번쨰와 0번쨰는 비교할 필요없음. i=1;
//			if(arr[i]>maxindex) {
//				maxindex = i;
//			}
//		}
//		System.out.println(maxindex+1); //컴퓨터 관점에서는 0부터 시작. 보기쉽게 +1

		// 큰 값 위치와 작은 값 위치 바꾸기
		int arr[] = { 5, 4, 3, 2, 1 };
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) { //가장 큰 값의 위치
				maxIndex = i;
			}
			minIndex = arr[i] < arr[minIndex] ? i : minIndex; //가장 작은 값의 위치
		}
		System.out.println(arr[maxIndex]); //5
		System.out.println(arr[minIndex]); //1
		
		int temp = arr[minIndex];    // >>> temp = 1;
		arr[minIndex]=arr[maxIndex]; // >>> arr[minIndex] = 5;
		arr[maxIndex]=temp;          // >>> arr[maxIndex] = 1;
		
		System.out.println(Arrays.toString(arr));
	}

}
