package day9;

public class Point3D extends Point{
//	>> ColorPoint 클래스가 아니고 Point 클래스를 상속받고 있음
	
	private int z;
	
	Point3D(int x, int y, int z){
//	>> 문제3. 매개변수 3개인 생성자.
		super(x,y);
//		>> Point 클래스의 생성자 호출.
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}

}
