package day10;

public class ArrayClass {
	
	static int maxValue(int[] array) {
//	>> 어떤 배열이든 최대값을 찾아주는 메소드
		int max = array[0];
		for(int value : array) { 
			if(max<value) {
				max = value;
			}
		}
		return max;
	}
	
	//배열에서 가장 큰 값의 '위치'를 찾는(리턴) 메소드
	static int maxIndex(int[] array) {
		int index = 0;
		for(int i=1; i<array.length; i++) {
			if(array[index]<array[i]) {
				index = i;
			}
		}
		return index;
	}
	
	
	//1. (정수형)배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
	static int minValue(int[] array) {
		int min = array[0];
		for(int value : array) { 
			if(min>value) {
				min = value;
			}
		}
		return min;
	}
//	>> 다른 방법으로 동일한 작동
//	static int minValue(int[] arr) {
//		int minIndex = 0;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]<arr[minIndex]) {
//				minIndex = i;
//			}
//		}
//		return arr[minIndex];
//	}
	
	
	//2. 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
//	static void maxMinChange(int[] array) {
//		int maxIndex = maxIndex(array);
//		int minIndex = 0;
//		for(int i=1; i<array.length; i++) {
//			if(array[minIndex]>array[i]) {
//				minIndex = i;
//			}
//		}
//		int temp = array[maxIndex];
//		array[maxIndex] = array[minIndex];
//		array[minIndex] = temp;
//	}
	
	static void maxMinChange(int[] arr) {
		int max = 0;
		int min = 0;
		for(int i=1; i<arr.length; i++) {
			max = arr[i]>arr[max]?i:max;
			min = arr[i]<arr[max]?i:min;
		}
		int temp = arr[max];
		arr[max] = arr[min];
		arr[min] = temp;
	}
	
}
