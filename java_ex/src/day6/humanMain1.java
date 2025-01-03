package day6;

public class humanMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human hong = new Human("홍길동", 30, "인천");
		//hong 객체를 생성하면서 Human(); 생성자가 호출됨. 동시에 매개변수 입력가능.
		System.out.println(hong.name);
		
		// 예제) 김철수, 25, 제주도
		Human kim = new Human("김철수", 25, "제주도");
		System.out.println(kim.name);
		
		// 예제2) 박영희, 35. 주소x
		Human park = new Human("박영희", 35);
		System.out.println(park.name);
		System.out.println(park.addr); //"알수없음"
	}

}
