package practice;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		
		//랜덤으로 6자리 배열 만들어 오름차순, 내림차순 선택정렬 해보기
		
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(99)+1;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("중복 제거");
					i--;
				}
			}
		}
		System.out.println("6자리 랜덤 배열");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		//선택정렬 오름차순 (작은 값 찾아 자리 바꾸기)
		//{5,4,3,2,1,0}
		
		for(int i=0; i<arr.length-1; i++) { 
			int minIndex = i;
			for(int j=(i+1); j<arr.length; j++) {
				if(arr[minIndex]>arr[j]) { 
					minIndex=j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("선택정렬 오름차순");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//선택정렬 내림차순 (큰 값 찾아 자리 바꾸기)
		//{0,1,2,3,4,5}
		
		for(int i=0; i<arr.length-1; i++) { 
			int maxIndex = i;
			for(int j=(i+1); j<arr.length; j++) { 
				if(arr[i]<arr[j]) {
					maxIndex=j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("선택정렬 내림차순");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
	}

}
