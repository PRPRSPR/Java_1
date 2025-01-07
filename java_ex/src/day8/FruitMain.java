package day8;

public class FruitMain {
	
//	>> main이 있는경우 해당 클래스는 객체를 만드는 클래스가 아니기때문에 static을 써줘야함

//	static void orangeBoxing(Orange o, int num) { 
//		System.out.println(o.name+"를 "+num+"개 박스에 담았습니다.");
//	}
//	static void bananaBoxing(Banana b, int num) {
//		System.out.println(b.name+"를 "+num+"개 박스에 담았습니다.");
//	}
//	static void appleBoxing(Apple a, int num) {
//		System.out.println(a.name+"를 "+num+"개 박스에 담았습니다.");
//	}
	
	static void fruitBoxing(Fruit f, int num) {
		System.out.println(f.name+"를 "+num+"개 박스에 담았습니다.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
		
		orange.print();
//		>> "과일은 맛있다"
		
//		orangeBoxing(orange,a);
//		fruitBoxing(orange,a);
//		>> 업캐스팅. 서브클래스 객체(orange)를 슈퍼클래스 타입(fruit)으로 변환.
		
		Banana banana = new Banana();
		banana.name = "바나나";
//		bananaBoxing(banana, 8);
//		fruitBoxing(banana, 8);
		
		Apple apple = new Apple();
		apple.name = "사과";
//		appleBoxing(apple, 10);
//		fruitBoxing(apple, 10);
	}

}
