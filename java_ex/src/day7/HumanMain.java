package day7;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Human hong = new Human(); // hong이라는 객체 생성
//		hong.intro();
//		>> Human hong = new Human();일 때,
//		>> 입력받은 값이 없어 "null의 나이는 0, 주소는 null 입니다."로 출력됨
		
//		hong.name = "홍길동";
//		hong.age=30;
//		>> Human 클래스에서 변수 접근지정자가 private이므로 수정불가.
//		>> hong이라는 객체 생성시에 생성자(new Human("홍길동",30,"인천");)를 통해 값 입력 가능.
		Human hong = new Human("홍길동",30,"인천");
		hong.intro();
//		>> "홍길동의 나이는 30, 주소는 인천 입니다."

//		hong.setAge(31);
		hong.setAge(hong.getAge()+1);
//		>> 나이가 31가 되었습니다.
		hong.setAge(-10);
//		>> 현재 나이보다 큰 값을 입력하세요.
		
		hong.money = 40000;
		System.out.println("홍길동 가진 돈 : "+hong.money);
		
		hong.money_708 = 195000;
//		>> hong이 회비 5000원 사용
		
		Human kim = new Human("김철수",20,"제주도");
		int age = kim.getAge();
		System.out.println(age);
		
		kim.money = 80000;
		System.out.println("철수 가진 돈 : "+kim.money);
		
		System.out.println("철수가 회비 확인 : "+kim.money_708);
//		>> "철수가 회비 확인 : 195000"출력. money_708은 static으로 공유됨.
		
		Human.money_708 = 100000;
		System.out.println("길동이 회비 확인 : "+hong.money_708);
		
	}

}
