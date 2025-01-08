package day9;

public class GoodCalc extends Calculator{ //일반클래스
//public "abstract" class GoodCalc extends Calculator{ //추상클래스
	
//	>> 일반클래스로 유지하려면 추상메소드를 구체화, 오버라이딩 해줘야함

	@Override
	int mul(int x, int y) { 
		return x*y;
	}
	
	@Override
	int div(int x, int y) {
		return x/y;
	}
	
	int mod(int x, int y) {
		return x%y;
	}
	
}
