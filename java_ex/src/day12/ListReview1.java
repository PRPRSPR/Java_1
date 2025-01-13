package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//{1,3,5,4,2}
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(1);
//		list.add(3);
//		list.add(5);
//		list.add(4);
//		list.add(2);
//		System.out.println(list);
//		list.add(1, 10);
//		System.out.println(list);
		
		// 숫자 입력받아 list에 넣고 총 합 구하기. -1 입력하면 종료
		
		while(true) {
			System.out.println("숫자 입력 : ");
			int input = scan.nextInt();
			if(input != -1) {
				list.add(input);
			} else {
				break;
			}
		}
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
	}

}
