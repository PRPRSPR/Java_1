package day9;

public abstract class Calculator { 
//	>> "abstract" 추상클래스
	
	int sum(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	
	abstract int mul(int x, int y);
	abstract int div(int x, int y);
//	>> "abstract" 추상메소드 {작업문}이 구현되어있지 않음.
	
}
