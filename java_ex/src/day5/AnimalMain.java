package day5;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Animal 클래스로 lion, bear 라는 객체 만들기
		
		Animal lion = new Animal();
		
		lion.name = "lion";
		lion.age = 4;
		lion.eat();
		lion.speak();
		lion.love();
		
		Animal bear = new Animal();
		
		bear.name = "bear";
		bear.age = 8;
		bear.eat();
		bear.speak();
		bear.love();
	}

}
