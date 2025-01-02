package day4;

public class BArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = { 3, 5, 12, 7, 10 };

		// arr 배열의 합 구하기
//		int sum = 0;
		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
		
		// arr 배열의 가장 큰 수 구하기
		// 배열의 음수는 제외되는 문제점.
//		int max=0;
//
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);

		//배열이 음수인 경우 가장 큰 수
		int arr[] = { -3, -5, -12, -7, -10 };
		int max=arr[0];

		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}
