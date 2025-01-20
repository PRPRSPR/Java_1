package day17;

import java.util.Arrays;

public class Review_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,4,2,6,3};
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=(i+1); j<arr.length; j++) {
				min = (arr[j]<arr[min])?j:min;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
