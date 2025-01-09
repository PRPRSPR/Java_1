package day10;

public class Test {

	static void addNum(int n) {
		n++;
	}
	static void addArr(int[] arr) {
		arr[0]=100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		addNum(n);
		System.out.println(n);
		
		int arr[] = {3,4,5,1};
		addArr(arr);
		System.out.println(arr[0]);
	}

}
