package day8;

public class Student extends Person { //Person을 상속받음
	String stuNo; //학번
	int grade; //학년
//	>>학생들이 가지고있는 특성
	
	Student(){ // 기본생성자 (Person의 기본생성자가 없으면 오류 발생)
		System.out.println("자식 클래스 생성자 실행!");
	}
	
	Student(String name, int age, String addr){
//		>> 따로 지정해주지 않는 이상 부모클래스의 기본생성자를 실행
		super(name, age, addr); 
//		>> 부모클래스 생성자 실행. 매개변수 확인 필요. => super();인 경우 기본생성자 실행
	}
	
	Student(String name, int age, String addr, String stuNo){
		super(name,age,addr);
		this.stuNo = stuNo;
//		>> 부모클래스 생성자 호출(지정)은 첫줄에 있어야한다. 
//		첫줄에서 지정된 부모클래스의 생성자를 호출, 실행 후 
//		자식클래스의 생성자로 돌아와 this.stuNo = stuNo; 실행
	}
	
	void study(){
		System.out.println(name+"이(가) 공부하고 있습니다.");
//		>> 해당 클래스에는 name이라는 변수가 없지만 
//		Person에서 상속받았기떄문에 name 사용 가능
	}
}
