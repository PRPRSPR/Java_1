package day9;

public class PointMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[4번] Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라. 
//		다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

		   PositivePoint p = new PositivePoint();
		   p.move(10, 10);
		   System.out.println(p.toString()+"입니다.");
		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
		   System.out.println(p.toString()+"입니다.");
		   PositivePoint p2 = new PositivePoint(-10, -10);
		   System.out.println(p2.toString()+"입니다.");
		
//		(10,10)의 점입니다.
//		(10,10)의 점입니다.
//		  (0,0)의 점입니다.
	
	}

}
