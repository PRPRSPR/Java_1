package day7;

public class CalcMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator(); //객체 생성 후 호출
		calc.intro();
//		calc.sum(5, 10);  <<return만 받고 결과출력은 없음.
//		System.out.println(calc.sum(5, 10)); //메소드 안에 메소드
		
		int sum = calc.sum(5, 10);
		System.out.println(sum);

		//sum(int x, int y)
		sum = calc.sum(400, 1500);
		System.out.println(sum);
		
		//sum(double x, double y)
		sum=calc.sum(5.3, 3.1);
		System.out.println(sum);
		
		//sum(int x, int y, double z)
		sum=calc.sum(10, 20, 30.5); // 60
		System.out.println(sum);
		
	}

}
