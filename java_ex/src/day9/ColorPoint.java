package day9;

public class ColorPoint extends Point {
	
	private String color;
	
	ColorPoint(){ 
//	>> 문제2. 매개변수가 없는 생성자. "(0,0) 위치의 BLACK 색 점"
		super(0,0); 
//		>> Point 클래스는 기본생성자가 없음. 매개변수 2개를 가진 생성자.
//			생성자를 호출하기 위해 x,y 값에 0을 보내주기.
		color = "BLACK"; // color 입력 없음. 디폴트값으로 BLACK 지정.
	}
	
	ColorPoint(int x, int y){
//	>> 문제2. 매개변수가 2개인 생성자. "(10,10) 위치의 BLACK 색 점"
		super(x,y);
		color = "BLACK"; // color 입력 없음. 디폴트값으로 BLACK 지정.
	}
	
	ColorPoint(int x, int y, String color){
//	>> 문제1. 매개변수 3개인 생성자.
		super(x, y); // Point 클래스의 생성자는 매개변수 2개를 필요로 함.
		this.color = color;
	}
	
	void setXY(int x, int y) { 
		move(x, y);
//	>> Point 클래스의 x,y 는 private 로 보호됨.
//		값 변경을 위해 Point 클래스의 move 메소드 사용
	}
	
	void setColor(String color) { //color 는 해당 클래스에서 선언됨.
		this.color = color;
	}
	
	@Override
	public String toString() { 
//	>> toString은 Object 클래스의 메소드.
//		원하는 내용을 리턴받으려면 오버라이딩 해줘야함.
		return color+"색의 ("+getX()+","+getY()+") 점";
//		>> Point 클래스의 x,y 는 private 로 보호됨.
//			getX(),getY() 메소드로 x,y 값 리턴받기 (간접접근)
//		=> "RED(color)색의 (10(x),20(y)) 점" 출력
	}
	
	
	
}
