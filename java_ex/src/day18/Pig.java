package day18;

public class Pig extends Animal{

	Pig(String name, int age) {
		super(name, age);
	}

	@Override
	void sound() { // 추상메소드.
		System.out.println("꿀꿀");
	}
	
	
	
}
