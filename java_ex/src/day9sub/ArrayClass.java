package day9sub;

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
	
}
