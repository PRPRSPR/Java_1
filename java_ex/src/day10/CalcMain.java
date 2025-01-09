package day10;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2-3. main 이 포함된 클래스를 생성하고 main 메소드 내에 아래 조건에 맞게 작성하시오.
//		- Calc 클래스의 메소드를 호출하시오(sum 1개, multiple 3개)
		
		System.out.println(Calc.sum(5, 10));
		System.out.println(Calc.multiple(4, 5));
		System.out.println(Calc.multiple(2, 3, 4));
		System.out.println(Calc.multiple(2, 3, 2.3));
	}

}
