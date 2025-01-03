package day6;

public class CalcMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 calc = new Calculator1();
		calc.sum(3, 5); //==> void : return이 없음 메소드 코드만 실행함
//		System.out.println(calc.sum(3, 5)); << 오류가 발생됨
		int a = calc.sum2(3, 5); //==> 리턴타입 'int'. 호출 시 값이 return 됨
		System.out.println(calc.sum2(3, 5));
		System.out.println("합 : "+a);
		
		// b = 5*2*3;
		int b = calc.multiple(5,2,3);
		System.out.println(b);
		int c = calc.multiple(10, 20);
		System.out.println(c);
		double d = calc.multiple(5, 7.5); //매개변수가 하나라도 double일 경우 리턴타입 double이어야함
		System.out.println(d);
	}

}
