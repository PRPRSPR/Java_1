package day10;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		if (a == b) // false
			System.out.println("a==b");
		if (a.equals(b))// true
			System.out.println("a is equal to b");
		if (a.equals(c)) // false
			System.out.println("a is equal to c");

	}

}
