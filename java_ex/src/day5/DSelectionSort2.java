package day5;

public class DSelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,4,1};
		
//		1
		int minIndex = 0; // arr[0] => 3
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		} //minIndex = 4 => arr[minIndex] = 1
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0]=temp;
		
		// arr[]= {1,5,2,4,3}
		
		
//		2
		minIndex = 1; // arr[1] => 5
		for(int i=2; i<arr.length; i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		} //minIndex = 2 => arr[minIndex] = 2
		temp = arr[minIndex];
		arr[minIndex] = arr[1];
		arr[1]=temp;
		
		// arr[]= {1,2,5,4,3}
		
		
//		3
		minIndex = 2; //arr[2] = 5
		for(int i=3; i<arr.length; i++) {
			if(arr[i]<arr[minIndex]) {
				minIndex = i;
			}
		} //minIndex = 3 => arr[minIndex] = 4
		temp = arr[minIndex];
		arr[minIndex] = arr[2];
		arr[2]=temp;
		
		// arr[]= {1,2,3,4,5}
		
		
		// for문으로 1~3 과정 단축
		for(int i=0; i<arr.length-1; i++) {
			minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]=temp;
		}
		
	}

}
