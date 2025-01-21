package day18;

public class GoodCalc implements Calculator { //Calculator 가 추상클래스(인터페이스)

	//모든 메소드 오버라이딩
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public int multiple(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		int z = 0;
		try {
			z=x/y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return z;
	}
	
	//숫자 2개 받아 큰 수 리턴해주는 함수. 함수명 max, 리턴-매개변수 모두 int
	int max(int x, int y) {
		return (x>y)?x:y;
	}
	
}
