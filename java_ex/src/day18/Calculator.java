package day18;

public interface Calculator {// 'interface'
	
	//숫자 2개 받아서 더한 후 리턴
	int sum(int x, int y); //모든 메소드가 추상메소드
	//숫자 3개 받아서 더한 후 리턴
	int sum(int x, int y, int z); // 인터페이스 내 오버로딩
	//숫자 2개 받아서 곱한 후 리턴
	int multiple(int x, int y);
	//숫자 2개 받아서 나눈 후 리턴
	int divide(int x, int y);
	
}
