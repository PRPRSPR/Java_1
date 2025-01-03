package day5;

public class Human1 {
	//변수
	String name;
	int age;
	String addr;
	double height;
	boolean isSingle;
	
	//메소드
	void speak(String name) { //괄호 안에 요구조건. 매개변수
		//말한다
		System.out.println(name+"가 말한다.");
	}
	void eat() {
		//먹는다
		System.out.println("맛있는걸 먹는다.");
	}
	// => speak, eat를 호출하면 작업문이 실행된다
	
	void intro(String name, int age, String addr) {
		// 이름, 나이, 주소. ㅇㅇㅇ의 나이는 ㅇㅇ, 주소는 ㅇㅇㅇ 입니다.
		System.out.println(name+"의 나이는 "+age+", 주소는 "+addr+" 입니다.");
	}
	
	void intro2() {
		System.out.println(name+"의 나이는 "+age+", 주소는 "+addr+" 입니다.");
	}
	
	void intro3(String name) { //위에서 초기화한 값보다 내부에서 선언된 매개변수가 우선적으로 적용됨
		System.out.println(name+"의 나이는 "+age+", 주소는 "+addr+" 입니다.");
		System.out.println(name+"의 본명은 "+this.name); // name => 매개변수 값 | this => 초기화한 값
	}
}
