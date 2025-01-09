package day9;

public class PositivePoint extends Point {
	
	PositivePoint(){
		super (0,0);
//		>> 부모클래스에 기본생성자가 없고, 첫 지문에 매개변수가 없는 생성자 사용.
//			임의 값 0,0을 넣어 부모클래스의 생성자 호출
	}
	
	PositivePoint(int x, int y){
		super (x,y);
//		>> super 가 맨 윗줄에 있어야함.
		if(x<0 || y<0) { 
//		>> 두 매개변수 중 하나라도 음수값이 있으면 0으로 초기화.
			super.move(0, 0);
		}
			
	}
	
	@Override
	public String toString() { //오버라이딩
		return "("+getX()+","+getY()+")의 점";
	}
	
	@Override
	protected void move(int x, int y) { 
//	>> 매개변수 중 하나라도 음수 값이 있으면 이동하지 않는 move 메소드 필요
//		if(x>0 && y>0) {
		if(!(x<0 || y<0)) {
			super.move(x, y);
		} 
	}
	
}
