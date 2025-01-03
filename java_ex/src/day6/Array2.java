package day6;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,-4,-10,8,-5,6,2};
		
		
		//배열의 양수 찾기
		
		//1.
		for(int i:arr) {
			if(i>0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		
		//2.
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println();
		
		
		//새 배열에 기존 배열의 양수 값 넣기
		int newArr[]; //새 배열
		//기존 배열의 양수가 몇개인지 카운트.
		int count = 0;
		for(int num:arr) {
			if(num>0) {
				count++;
			}
		}
		System.out.println(count); //count = 5
		
		newArr= new int[count]; // newArr[]={0,0,0,0,0}
		
		//1.
		int index=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				newArr[index++]=arr[i]; 
				//newArr[i]의 경우 count(newArr의 length)보다 큰 숫자도 들어가게됨
				//ex) count=5, i=7, newArr[7]=arr[7] => newArr의 7번째 공간없음. 오류발생
				//따로 값을 지정해(index) 조건(if)에 맞을 경우에만 위치값을 더해주면(index++)
				//i가 아무리 커져도 newArr에 순차적으로 값을 넣어줄 수 있게됨
			}
		}
		System.out.println(Arrays.toString(newArr));
		
		//2.
		int index2=0;
		for(int num:arr) {
			if(num>0) {
				newArr[index2++]=num;
			}
		}
		
	}

}
