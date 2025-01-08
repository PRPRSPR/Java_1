package day9.sub;

import java.lang.classfile.instruction.IncrementInstruction;

public class Test {
	
	static void increase(int m) {
		m=m+1; 
//		>> m++; [3] 값 받아서 작업했으나 m 값의 return 없음. 
//		객체 n 의 값은 여전히 30
	}
	
	static void increase(Circle c) {
		c.radius++; //(3) 해당 주소(c)의 radius 값을 더해준 것
	}
	
	public static void main(String[] args) {
	
		int n = 30; //[1] 객체 값 30
		increase(n);//[2] 객체 값을 보내줌
		System.out.println(n); // ==> 30
		
		
		Circle c = new Circle(50);
//		(1) >> c = 객체 레퍼런스(주소)
		increase(c); //(2) >> 주소를 보내준 것
		System.out.println(c.radius); //==>51
		
		Circle c2 = new Circle(20);
		c.radius = 30;
		System.out.println(c2.radius); //==>20
		
		Circle c3 = c2;
		c3.radius = 100;
		System.out.println(c2.radius); //==>100
//		>> 같은 주소를 가지게 되었기 떄문.
		
	}
}

class Circle {
	
	int radius;
	
	Circle(int r){
		radius = r;
	}
	
}