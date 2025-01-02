package day5;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human hong = new Human();
		hong.name = "홍길동";
		hong.age = 30;
		hong.addr = "인천";
		hong.height = 170.5;
		hong.isSingle = true;
		
		System.out.println(hong.name);
		
		hong.eat();
		hong.speak("길동이");
		
		hong.intro2();
		//매개변수가 없어도 위에서 변수를 기입했기 때문에 정상출력됨.
		hong.intro3("길동이");
		
		
//		Human kim = new Human();
//		kim.name="김철수";
//		
//		System.out.println(kim.name);
//		
//		kim.speak("철수");
//		kim.intro("철수", 25, "제주도");
	}

}
