package day1;

public class bCalculator {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = x/y; //int z = 10/3;
		//정수(int)간의 나눗셈은 결과가 정수로 나온다.
		//하나라도 실수(double)이면 결과가 실수로 나온다.
		
		System.out.println(x+10);
		System.out.println(y*20);
		System.out.println(z);
		System.out.println(x+y);
		
		System.out.println(x);   //10
		System.out.println("x"); //x

		System.out.println("x+y="+ x + y);
		//문자열이 우선. 뒤에 붙는 것도 문자열로 표현됨.
		System.out.println("x+y="+ (x+y));
		//괄호가 우선.
		
		int num1 = 10;
		//num1 = 10.5;  정수에서 실수로 불가능.
		num1 = (int) 12.5;
		//형 변환. 강제로 int로 지정. 소수점 날림.
		int num2 = 3;
		double num3 = 3.5;
		num3 = 10; //실수에서 정수로 가능.
		
	}

}
