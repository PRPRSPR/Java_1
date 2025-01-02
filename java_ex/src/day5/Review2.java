package day5;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,10,2,4};
		arr[2] = 1; //10 -> 1
		
		//단순 출력 (가시성이 좋으나 배열이 많아지면 비효율적)
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//반복문으로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//반복문으로 배열의 합 구하기
		int sum = 0; //순차적으로 더해져 나온 값이 저장될 변수
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i]; //sum=sum+arr[i];
		}
		
		//배열의 가장 큰 값 구하기
		int max = arr[0]; //max=3
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		//가장 큰 값의 위치 구하기
		int index = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[index]) {
				index=i;
			}
		}
		
	}

}
