package day9;

public class PointMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[1번] Point 를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 
//		다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
		
//		결과 : RED색의 (10,20)의 점입니다. 


	}

}
