package day6;

public class Human {

	String name;
	int age;
	String addr;
	
	Human(String name,int age,String addr){ //생성자. class 이름과 동일. 리턴을 가지고있지 않음.
		this.name = name; //this(객체 본인)
		this.age = age;
		this.addr = addr;
	}
	Human(String name, int age){ //오버로딩 사용
		this(name,age,"알 수 없음"); //다른 생성자를 호출. 무조건 맨 윗줄에 있어야함. 아래 3줄과 동일.
//		this.name = name;
//		this.age = age;
//		this.addr = "알 수 없음";
	}
	
	
	void study() {
		System.out.println("공부를 합니다.");
	}
	
	String eat(String food) {
		return food+"를(을) 먹습니다.";
	}
}
