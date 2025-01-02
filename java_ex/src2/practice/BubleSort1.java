package practice;

import java.util.Arrays;
import java.util.Random;

public class BubleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//랜덤으로 6자리 배열 만들어 오름차순, 내림차순 버블정렬 해보기
		
		Random ran = new Random();
		
		int arr[] = new int[6]; //arr[] = {0,0,0,0,0,0}
		
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
		
		// ex) arr[] = {5,4,3,2,1,0}
		
		//버블정렬 오름차순
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[i]) { //ex) arr[0]>arr[1] ==> 5>4
					int temp = arr[j];  //ex) temp=5
					arr[j]=arr[i]; //ex) arr[0]=4
					arr[i]=temp; //ex) arr[1]=5
				} //ex) ==> arr[] = {4,5,3,2,1}
			}
		}
		
		System.out.println("버블정렬 오름차순");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//버블정렬 내림차순
		//ex) arr[] = {0,1,2,3,4,5}
		
		for(int i=1; i<arr.length; i++) { 
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) { //ex) arr[0]<arr[1] ==> 0<1
					int temp = arr[j]; //ex) temp=0
					arr[j]=arr[i]; //ex) arr[0]=1
					arr[i]=temp; //ex) arr[1]=0
				} //ex) ==> arr[] = {1,0,2,3,4,5}
			}
		}
		
		System.out.println("버블정렬 내림차순");
		System.out.println(Arrays.toString(arr));
		
	}

}
