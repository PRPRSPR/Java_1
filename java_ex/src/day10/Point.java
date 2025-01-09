package day10;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
//		>> Object - 모든 클래스의 슈퍼클래스 > 업캐스팅이 쉬움
//			어떤 클래스의 객체를 대입할지 모르기 때문에 업캐스팅 후
//			아래 지문으로 다운캐스팅.
		Point p = (Point) obj;
//		ex) a.equals(b) / a==>(2, 3) b==>(2, 3)
//		>> Point p = (Point) b 
//		>> Object 클래스가 된 b를 Point 클래스로 다운캐스팅
		if (x == p.x && y == p.y) { 
//		>> x(a의 x값)==p.x(b의 x값)
//		>> y(a의 y값)==p.y(b의 y값)
			return true;
		} else {
			return false;
		}
	}
}
