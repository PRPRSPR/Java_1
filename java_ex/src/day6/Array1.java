package day6;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,1,4};
		
		int sum = 0; //배열 값의 합 저장됨
		
		for(int num:arr) { //배열의 값이 순차적으로 num에 대입됨
			sum+=num;
			System.out.println(num); // 3,5,2,1,4 가 출력됨
		}
		
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
		
	}

}
