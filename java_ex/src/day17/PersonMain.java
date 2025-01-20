package day17;

import java.util.HashMap;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동",30);
		hong.setMbti("ISFP");
		System.out.println(hong);
		
		Student kim = new Student("김철수",25,"20201234",3);
		
		//김철수의 mbti는 ㅇㅇㅇ 입니다.
		//학번은 20201234, 학년은 3학년 입니다.
		System.out.println(kim);
		
		//"자바는 재밌다!"
		System.out.println(kim.study("자바"));
		
		//학번,학년 둘 다 리턴
		HashMap<String,Object> map = kim.getInfo();
		System.out.println(map.get("stuNo"));
		System.out.println(map.get("grade"));
	}
	
}
