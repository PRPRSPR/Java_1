package day9sub;

import java.lang.classfile.instruction.IncrementInstruction;

public class Test {
	
	static void increase(int n) {
		n=n+1; 
//		>> n++; [3] 객체 n 값의 복사본을 변수 n 에 담아 작업. 작업했으나 return 없음. 
//		1이 더해진 복사본이 반환되지 않았기 때문에, 객체 n 의 값은 여전히 30
	}
	
	static void increase(Circle c) {
		c.radius++; 
//		>> (3) 해당 주소(c)로 찾아가 radius 값을 더해준 것
//		객체는 여전히 같은 주소를 가리키기 떄문에 메소드로 인해 변경된 값을 출력함.
	}
	
	public static void main(String[] args) {
	
		int n = 30; //[1] 객체 값 30
		increase(n);//[2] 객체 값의 복사본을 보내줌
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
//		>> c3가 c2와 같은 주소를 가지게 되었기 떄문.
		
	}
}

class Circle {
	
	int radius;
	
	Circle(int r){
		radius = r;
	}
	
}