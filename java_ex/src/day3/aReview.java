package day3;

import java.util.Scanner;

public class aReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("이름을 입력하세요 : ");
//		String name = scan.next(); //scan.next(); 문자열을 입력받을 수 있는 기능
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); //scan.nextInt(); 숫자를 입력받을 수 있는 기능
		
		
		age += 1; // age = age + 1;
		if(age>=20) { //age가 20보다 크거나 같다면, 결과가 참-거짓으로 나뉘어야함
			System.out.println("20대 이상 입니다.");
		} else if(age>=10) {
			System.out.println("10대 입니다.");
		} else {
			System.out.println("10살 미만 입니다.");
		}
		
		// =  ==
		int num1=10;
		int num2=20;
		System.out.println(age==num1);
		
		//and > 둘 다 true 일때만 true. 하나라도 false 라면 결과 false
		System.out.println(true&&true); //true
		System.out.println(true&&false); //false
		
		//or > 하나라도 true 라면 결과는 true
		System.out.println(true||false); // true
		System.out.println(false||false); //false
		
		if(num1>5&&num2>30) { //true&&false
			System.out.println("실행"); //실행x
		}
		if(num1>5||num2>30) { //true||false
			System.out.println("실행"); //실행o
		}
	}

}
