package day18;

import java.util.ArrayList;

public class Student extends Human{
	
	private String stuNo;
	
	Student(String name, int age, String stuNo) {
		super(name, age);
		this.stuNo = stuNo;
	}
	
	ArrayList<String> subjectList(){
		ArrayList<String> subject = new ArrayList<>();
		subject.add("자바");
		subject.add("오라클");
		subject.add("HTML");
		return subject;
	}
}
