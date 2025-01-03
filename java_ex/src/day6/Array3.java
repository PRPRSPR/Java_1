package day6;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,-4,-10,8,-5,6,2};
		int arr2[]= {3,5,-4,-10,8,-5,6,2};
		int arr3[]= {3,5,-4,-10,8,-5,6,2};
		
		//1.
		for(int i=0; i<arr.length-1; i++) {
			int index=i;
			for(int j=i+1; j<arr.length; j++) {
				int orgNum=arr[j]>0?arr[j]:-arr[j];
				int indexNum=arr[index]>0?arr[index]:-arr[index];
				if(orgNum<indexNum) {
					index=j;
				}
			}
			int temp = arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		//2.
		for(int i=0; i<arr2.length-1; i++) {
			int index=i;
			for(int j=i+1; j<arr2.length; j++) {
				if(arr2[j]*arr2[j]<arr2[index]*arr2[index]) {
					index=j;
				}
			}
			int temp = arr2[index];
			arr2[index]=arr2[i];
			arr2[i]=temp;
		}
		System.out.println(Arrays.toString(arr2));
		
		//3.
		for(int i=0; i<arr3.length-1; i++) {
			int index=i;
			for(int j=i+1; j<arr3.length; j++) {
				if(Math.abs(arr3[j])<Math.abs(arr3[index])) {
					index=j;
				}
			}
			int temp = arr3[index];
			arr3[index]=arr3[i];
			arr3[i]=temp;
		}
		System.out.println(Arrays.toString(arr3));
	}

}
