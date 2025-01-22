package hw250121;

public class ClsProblem {
//	1. 자바 클래스와 객체에 대한 설명 중 틀린 것은? >> 4
//
//		1. 클래스 바깥에 전역 변수는 선언할 수 없다.
//		2. 클래스는 객체를 생성하기 위한 틀이다.
//		3. 클래스의 멤버 변수를 필드라고 부르며, 클래스는 필드와 메소드로 이루어진다.
//		4. 필드는 클래스 내에서 private 보다 public으로 선언하는 것이 바람직하다.
//			
//	2. 생성자에 대한 설명 중 틀린 것은? >> 4
//
//		1. 생성자가 작성되어 있지 않으면, 컴파일러가 자동으로 기본 생성자를 추가해준다.
//		2. 생성자의 이름은 클래스의 이름과 반드시 같아야 한다.
//		3. this()는 생성자 내에서 다른 생성자를 호출하는 코드이다.
//		4. 생성자에서는 아무 값도 리턴하지 않기 때문에 return문을 사용할 수 없다.
//
//	3. 다음 코드 중 오류가 있는 것은? >> 3
//
//		1. Power []p = new Power[10];    
//		2. Power p[] = new Power[10];    
//		3. Power p[10] = new Power[10];    
//		4. Power[] p;
//
//	4. 다음 코드에 대해 설명하는 문항 중 틀린 것은? >> 2
//			Book[] book = new Book[10];
//		1. book은 배열에 대한 레퍼런스이다.
//		2. Book 객체가 10개 만들어진다.
//		3. for(int i=0; i<book.size; i++) book[i] = new Book();로 객체들을 만들어야 비로소 배열이 완성된다.
//		4. book[0], book[1], ... , book[9] 모두 Book 객체에 대한 레퍼런스이다.
//
//	5. 다음 중 메소드 오버로딩에 실패한 사례는? >> 1 / 리턴타입이 달라도 매개변수 개수와 형태가 같음
//		1) class A{
//	            int x;
//	            void f(int a) { x = a; }
//	            int f(int b) { return x+b; }
//			}
//	
//		(2) class A{
//					int x;
//					void f(int a ) { x = a; }
//					void f() { x = 0; }
//			}
//			 
//		(3) class A {
//					int x;
//					inf f() { return x; }
//					int f(int a, int b) { return a+b; }
//			}
//			 
//		(4) class A {
//					static int x=0;
//					static int f(int a) { return a+x; }
//					static int f() { return 3; }
//			}
//
//
//	6. 다음 코드에 대해 답하라.
//
//		class TV {
//		   int size;
//		   String manufacturer;
//		   public TV() {
//			  size = 32;
//			  manufacturer = "LG";
//			  System.out.println(size+"인치 "+manufacturer);
//		   }
//		   public TV(String manufacturer) {
//			  this.size = 32;
//			  this.manufacturer = manufacturer;
//			  System.out.println(size+"인치 "+manufacturer);
//		   }
//		   public TV(int size, String manufacturer) {
//			  this.size = size;
//			  this.manufacturer = manufacturer;
//			  System.out.println(size+"인치 "+manufacturer);
//		   }
//		}
//
//	 (1) this()를 이용하여 생성자를 수정하라
	
//	public TV() {
//		this(32,"LG");
//	}
//
//	public TV(String manufacturer) {
//		this(32,manufacturer);
//	}
//
//	public TV(int size, String manufacturer) {
//		this.size = size;
//		this.manufacturer = manufacturer;
//		System.out.println(size + "인치 " + manufacturer);
//	}
	
//	 (2) new TV();와 new TV("삼성"); 를 실행하면 실행 결과는 각각 무엇인가?
	
//	>> 32인치 LG
//	>> 32인치 삼성
	
//	 (3) 65인치 "삼성" TV 객체를 생성하는 코드를 적어라.
	
//	>> TV a = new TV(65,"삼성");
	
//	 (4) this()를 이용하는 장점은 무엇인가?
	
//	>> 코드를 재사용해 더욱 간략한 코드를 만들 수 있다.
//	추후 수정 시 모든 생성자 코드를 변경하지 않고
//	this()로 연결된 생성자만 변경해주면 되어 유지보수에 용이하다.
	
//	 
//	7. 다음 클래스에는 컴파일 오류가 있다. 오류 부분을 지적하고 오류를 수정할 수 있는 방법을 모두 제시하라. 
//	그리고 그중 객체 지향 프로그래밍에 가장 적합한 방법을 설명하라.
//		class Person {
//			private int age;
//		}
//		public class Example {
//			public static void main (String args[]) {
//				Person aPerson = new Person();
//				aPerson.age = 17;
//			}
//		}
	
//	>> aPerson.age = 17;
//	Person 클래스의 변수 int age 는 접근지정자가 private 이므로
//	Example 클래스에서 age 에 접근할 수 없다.
//	Person 클래스에서 public 으로 선언된 메소드를 만들면 타 클래스에서 
//	간접적으로 접근할 수 있게 되어 person 객체의 age 초기화가 가능하다.
	
//	8. 다음 코드를 객체 지향 프로그래밍 관점에서 바람직한 코드로 수정하라.
//		class Power {
//			public int kick;
//			public int punch;
//		}
//		public class Example {
//			public static void main (String args[]) {
//				Power robot = new Power();
//				robot.kick = 10;
//				robot.punch = 20;
//			}
//		}

//	class Power {
//		private int kick;
//		private int punch;
//		public void setKick(int kick) {
//			this.kick = kick;
//		}
//		public void setPunch(int punch) {
//			this.punch = punch;
//		}
//	}
//	public class Example {
//		public static void main (String args[]) {
//			Power robot = new Power();
//			robot.setKick(10);
//			robot.setPunch(20);
//		}
//	}
//	>> + 생성자를 통해 초기화 할 수 있도록 한다.
	
//	9. 다음 코드가 실행될 때 가비지가 발생하는가? 만일 발생한다면 발생하는 위치와 과정을 설명하라.
//		(1) String s = null;
//			for(int n=0; n<10; n++) {
//				s = new String("Hello"+n);
//				System.out.println(s); 
//			}
			
//			>> 반복문을 통해 n++ 가 진행되면 
//			이전의 n 값으로 만들어진 문자열들은 가비지가 된다.
	
//		(2) String a = new String("aa");
//			String b = a;
//			String c = b;
//			a = null;
//			b = null; 
	
//		>> a 와 b 가 null 값을 가지게 되어도 
//		c 가 문자열 "aa"를 가리키고 있어 가비지가 발생하지 않는다.
	
//	10. 다음 클래스에서 멤버 함수의 사용이 잘못된 것은?
//		class StaticTest {
//			static int a;
//			static int getA() { return a; } //(1)
//			int b;
//			int getB() { return b; } //(2)
//			int f() { return getA(); } //(3)
//			static int g() { return getB(); } //(4)
//		}
	
//		>> 4 
//		static 은 객체 없이 클래스명으로도 접근이 가능하다.
//		(4)에서 static 으로 non-static인 getB(), int b 를 호출할때
//		객체가 없으면 non-static 멤버를 호출할 수 없기 때문에 문제 발생.
	
}
