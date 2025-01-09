package day10;

public class Dog extends Animal{
	
//	Dog dog = new Dog("바둑이", 3, "진돗개");
//	dog.info(); // 이름 : 바둑이, 나이 : 3
//	dog.sound(); // 멍멍!
//	System.out.println("품종 : " + dog.getBreed()); // 품종 : 진돗개
//
//	Dog dog2 = new Dog();
//	dog2.info(); // 이름 : 정보없음, 나이 : 0
	
	private String breed;
	
	Dog(){
		super("정보없음",0);
	}
	
	Dog(String name, int age, String breed){
		super(name, age);
		this.breed = breed;
	}
	
	@Override
	void sound() {
		System.out.println("멍멍!");
	}
	
	String getBreed() { // 자동으로 만들 수 있음.
		return breed;
	}
}
