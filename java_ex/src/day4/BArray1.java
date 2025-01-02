package day4;

import java.util.Arrays;

public class BArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]=new int[5];
		//int[] arr = new int[5];
		//5개의 공간을 가지는 arr 배열 선언
		
//		arr[0]=10; //[0~4]
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		//arr[] = {10,20,30,40,50}
//		System.out.println(arr[2]);
//		System.out.println(Arrays.toString(arr));
		
//		int arr[]= {10,20,30,40,50};
//		
//		for(int i=0; i<5;i++) { // i<5 = 0~4
//			System.out.println(arr[i]);
//		}
		
		int arr[]= {10,20,30,40,50,6,7,22,3,4,737,45,634,2,34,62,3,4};

		for(int i=0; i<arr.length;i++) { 
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println(arr.length);
	}

}
