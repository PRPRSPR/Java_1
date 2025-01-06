package packB;

import packA.ClassA;

public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
//		>> 다른 패키지에 있는 클래스이므로 오류발생.
//		>> ctrl+shift+O로 불러와줘야함.
		a.varPublic=10;
		
//		a.varDefault=10;
//		a.varProtected=10;
//		>> 다른 패키지이므로 접근 불가능 = 오류발생
		
//		a.varPrivate=10;
//		>> Private이라 접근 불가. 같은 클래스에서만 접근 가능 = 오류발생
	}

}
