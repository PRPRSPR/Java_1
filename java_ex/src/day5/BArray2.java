package day5;

public class BArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,4,1};
		
		//배열의 값 만큼 * 찍기
//		ex)
//		***
//		*****
//		**
//		****
//		*
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
