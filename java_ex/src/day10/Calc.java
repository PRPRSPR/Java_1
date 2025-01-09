package day10;

public class Calc { // - 클래스명 : Calc
	
//	- 메소드 : sum, multiple
//	- 위 메소드 들은 객체 생성없이 클래스명으로 호출가능하도록
//	- 위에서 정의한 메소드는 각각 2개의 정수를 받아서 덧셈, 곱셈 결과를 리턴
	static int sum(int x,int y) {
		return x+y;
	}
	
	static int multiple(int x, int y) {
		return x*y;
	}
	
//	해당 클래스의 multiple 메소드를 아래조건에 맞게 수정하시오.
//	- 오버로딩하여 3개의 메소드로 만들기(매개변수 수정은 자유롭게)
	static int multiple(int x, int y, int z) {
		return x*y*z;
	}
	
	static double multiple(int x, int y, double z) {
		return x*y*z;
	}
}
