package day7;

public class Calculator {
	
	//intro 메소드 생성
	//리턴 x, 호출 시 "계산기 객체 입니다." 출력
	
	void intro() { //매개변수관련 지문 없음.
		System.out.println("계산기 객체 입니다.");
	}
	
	//int형 숫자 2개를 받아서 더한 후 되돌려주는 메소드
	
	int sum(int x, int y) { //리턴 타입이 int로 지정. 리턴 값이 없으면 오류표시됨.
		return x+y; 
	}
	
	//double형 숫자 2개를 받아서 더한 후 소수점을 제거하고 int형으로 되돌려주는 메소드
	
	int sum(double x, double y) {
		return (int)(x+y); //(int) > 강제로 int로 바꿔줌. | (int)x+y 로 하면 x만 int로 바뀌어서 오류발생됨.
	}
	
	int sum(int x, int y, double z) {
		return x+y+(int)z; 
	}
	
}
