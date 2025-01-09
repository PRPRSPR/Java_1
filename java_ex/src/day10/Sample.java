package day10;

public class Sample {
	String name;
	int age;
	
	Sample(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Sample obj() { 
//	>> Sample 로 만든 객체로 리턴
		return this; //>> 객체 자신을 리턴. 레퍼런스 리턴됨
	}
}
