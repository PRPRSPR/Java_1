package day10;

public class Student { // 조건 1. 클래스명 : Student
	
// 조건 2. 필드(변수) : stuNo(학번, int), stuName(이름, String), 
// stuDept(학과, String), age(나이, int), gender(성별, String)
	
	private int stuNo;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;
	
//	조건 3. 생성자 :
//	1) 학번, 이름 초기화 하는 생성자
	Student(int stuNo, String stuName){
		this(stuNo,stuName,"");
	}
//	2) 학번, 이름, 학과 초기화 하는 생성자
	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
//	조건 4. 메소드 :
//	1. setInfo (나이와 성별을 입력받아서 저장, 리턴 x)
	void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
//	2. getAge (호출 시 객체의 나이 값 리턴)
	int getAge() {
		return age;
	}
	
//	3. toString 
//	(호출 시 'ooo(이름) 학생의 학번은 oooo(학번), 나이는 oo(나이) 입니다.' 문자열 리턴)
	@Override
	public String toString() {
		return stuName+" 학생의 학번은 "+stuNo+", 나이는 "+age+" 입니다.";
	}
	
	
}
