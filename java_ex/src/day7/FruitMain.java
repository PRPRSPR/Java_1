package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private로 선언할 것
		
		Fruit orange = new Fruit("오렌지", 1500, 5);
		// name, price, num 변수에 오렌지, 1500, 5 를 넣을 것
		orange.toString2(); // 결과 : "오렌지는 개당 1500원 입니다."
		int num = orange.getNum(); 
		System.out.println(num); // 결과 : 5


		Fruit banana = new Fruit("바나나", 2000);
		banana.setNum(10);
		num = banana.getNum(); 
		System.out.println(num); // 결과 10
		
	}

}
