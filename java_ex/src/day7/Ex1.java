package day7;

public class Ex1 {
	int num = 10;
//	>> 객체를 만들어야 사용가능.
	static int num2 = 20;
	static void printNum() {
//		System.out.println(num1);
//		>> printNum에서 num1에 접근, 아직 만들어지지 않은 객체 num1에 접근하게 되므로 오류 발생.
		System.out.println(num2);
	}
	

}
