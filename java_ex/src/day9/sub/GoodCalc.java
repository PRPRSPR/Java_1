package day9.sub;

public class GoodCalc implements Calculator {
//	>> "implements" 인터페이스 구현. Calculator 인터페이스의 모든 추상메소드를 구현해야함
//	빨간 밑줄이 생긴 GoodCalc에 마우스 올리면 add 확인됨.
//	선택하면 자동으로 Calculator 인터페이스의 모든 추상메소드를 오버라이딩해줌.

	@Override
	public int sum(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		return x/y;
	} 
	
	
}
