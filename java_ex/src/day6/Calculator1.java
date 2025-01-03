package day6;

public class Calculator1 {
	void sum(int x, int y) {
		System.out.println("두 수의 합은 "+(x+y));
	}
	
	int sum2(int x, int y) {
		return x+y;
	}
	
	int multiple(int x, int y) {
		return x*y;
	}
	//multiple로 동일한 이름의 메소드. 매개변수 개수가 달라서 가능.
	int multiple(int x, int y, int z){
		return x*y*z;
	}
	
	double multiple(int x, double y) {
		return x*y;
	}
	
}
