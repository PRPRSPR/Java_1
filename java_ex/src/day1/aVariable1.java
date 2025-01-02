package day1;

public class aVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동"; //String "문자열"
		int stduentNumber = 20241226; //카멜표기법
		int age; //integer(정수). 변수선언
		age = 30; //초기화
		//int age = 30;  선언과 동시에 초기화
		double height = 170.5; //소수점.실수
		boolean isSingle = true; //true or false
		
		System.out.println(name);
		//syso + Ctrl + Space  화면에 프린트
		System.out.println(age);
		System.out.println(height);
//		Ctrl + /   주석 단축키. 각 줄을 주석으로.
		
		/*
		 * System.out.println(name); 
		 * System.out.println(age);
		 * System.out.println(height);
		 */
		//Ctrl + Shift + /  묶어서 주석.
		
		age = 31; //변수선언은 한번만 가능. 값 변경됨
		System.out.println(age); //변경된 값으로 프린트됨.
		//Ctrl + F11  실행
		
		/*
		 * double PI = 3.141592; 
		 * PI = 3.14; 값 변경 가능
		 */
		final double PI = 3.141592;
		//PI = 3.14;  final 때문에 변경 불가.
		
		// 홍길동의 나이는 31 입니다.
		System.out.println(name + "의 나이는 " + age + " 입니다.");
	}

}
