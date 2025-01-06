package packB;

import packA.ClassA;

public class ClassB extends ClassA { //ClassA에서 상속받음.
	
	void test() {
		varPublic=10;
		
//		varDefault=10;
//		>> 다른 패키지이므로 접근 불가능 = 오류발생
		
		varProtected=10;
//		>> Default와 다르게 다른 패키지이지만 상속관계이기 때문에 접근 가능.
		
//		varPrivate=10;
//		>> Private이라 접근 불가. 같은 클래스에서만 접근 가능 = 오류발생
	}
}
