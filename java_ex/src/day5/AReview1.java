package day5;

public class AReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int형 정수 3개를 보관할 수 있는 배열 선언
		int arr1[] = new int[3];
		
		//문자열 3개를 보관할 수 있는 배열 선언
		String arr2[] = new String[3];
		arr2[0] = "1"; //arr2[0]=1; <불가 ""안에 넣어 문자열로 담아야함.
		
		//Object는 뭐든 다 담을 수 있는 클래스
		Object arr3[] = new Object[3];
		arr3[0]=10;
		arr3[1]="자바";
		arr3[2]=true;
	}

}
