package day7;

public class StaticEx1 {
	int num = 10;
	int money = 50000;
	
	static final double PI=3.141592;
//	>> static은 주로 final과 같이 쓰여짐. 수정 불가.
	
	int sum(int x, int y) {
		return x+y;
	}
	
	static int staticSum(int x, int y) {
		return x+y;
	}
	
	
}
