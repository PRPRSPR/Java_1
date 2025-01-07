package day8;

public class Orange extends Fruit{
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("오렌지는 달다.");
//		super.print(); << 상황에 따라 같이 출력 가능
	}
//	>>print+ctrl+space
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "과일명 : "+name+", 색 : "+color+", 가격 : "+price ;
	}
}
