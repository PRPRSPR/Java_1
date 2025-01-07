package day8;

public class Point {
	private int x;
	private int y;
//	>> 한점을 구성하는 x, y 좌표
	 
	public void set(int x, int y) {
		 this.x = x; this.y = y;
	}
	
	public void showPoint() { // 점의 좌표 출력 (x,y)
		System.out.println("(" + x + "," + y + ")");
	}
}
