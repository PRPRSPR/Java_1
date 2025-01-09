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
//		>> toString은 Object 클래스의 메소드.
//		원하는 내용을 리턴받으려면 오버라이딩 해줘야함.
		return "("+getX()+","+getY()+","+z+")의 점";
//		>> Point 클래스의 x,y 는 private 로 보호됨.
//		getX(),getY() 메소드로 x,y 값 리턴받기 (간접접근)
//	=> "(1(x),2(y),3(z))의 점" 출력
	}
	
//	>> toString 메소드의 경우 프린트문 안에 p.toString() 전체를 명시하지 않아도 가능
//	==> System.out.println(p.toString()+"입니다.");
//	==> System.out.println(p+"입니다.");
	
	void moveUp() {
		z++;
	}
//	>> moveUp, moveDown 값이 리턴되는 것이 아니기 때문에 실행시에 바로 확인할 수 없음.
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
//	>> 부모클래스의 move 메소드는 매개변수 2개. 오버로딩
		move(x, y); //>> 상속받은 메소드 사용
		this.z = z;
	}

}
