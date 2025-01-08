package day9;

public class CalcMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator clac = new Calculator();
//		>> 추상클래스는 객체 생성 불가능. 오류발생
		
		GoodCalc calc = new GoodCalc();
//		>> 추상메소드를 오버라이딩(구체화)하여 일반클래스로서 작동. 객체 생성 가능
		
		int div = calc.div(5, 10);
		int mod = calc.mod(5, 2);
		int sum = calc.sum(3, 2);
		int mul = calc.mul(3, 5);
		int sub = calc.sub(10, 5);
	}

}
