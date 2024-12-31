package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		int arr[]=new int[5];
		
//		for(int i=0; i<arr.length;i++) {
//			System.out.print((i+1)+"번째 숫자 입력 : ");
//			arr[i] = scan.nextInt();  //숫자 입력받아 배열 채우기
//			if(arr[i]<=0) { //0이나 음수는 입력되지 않게 하기
//				i--;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		
		//Array5에서 했던 내용 +
		
//		System.out.println("숫자를 몇 개 저장하시겠습니까?");
//		System.out.print("= ");
//		int arr[];
//		int size = scan.nextInt();
//		if(size>0) {
//			arr=new int[size];
//		} else { //다시 음수를 입력하면 오류 발생. 옳은방법X
//			System.out.println("다시입력하세요");
//			size = scan.nextInt();
//			arr=new int[size];
//		}
		
		System.out.println("숫자를 몇 개 저장하시겠습니까?");
		int size; //초기화 값 없이 선언만. 위치 주의. while문 안에 넣으면 바깥에서 쓸 수 없음.
		while(true) {
			System.out.print("= ");
			size = scan.nextInt();
			if(size<1) { //알맞은 수를 입력하지 않으면 계속 반복.
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				break; //무한루프 종료.
			}
		}
		int arr[]=new int[size]; //size 만큼 배열 생성
		for(int i=0; i<arr.length;i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(input>0) {
				arr[i]=input;
			} else {
				System.out.println("양수를 입력해주세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
