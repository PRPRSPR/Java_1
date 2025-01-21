package hw250121;

public class InhProblem {

//	1. 자바의 모든 클래스가 반드시 상속받게 되어 있는 클래스는?
//			1. Object
//			2. Java
//			3. Class
//			4. Super

//	>> 1

//		2. 상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하라.
//		class SharpPencil { // 샤프펜슬
//			private int width; // 펜의 굵기
//			private int amount; // 남은 량
//			public int getAmount() { return amount; }
//			public void setAmount (int amount) { this.amount = amount; }
//		}
//
//		class Ballpen  { // 볼펜
//			private int amount; // 남은 량
//			private String color; // 볼펜의 색
//			public int getAmount() { return amount; }
//			public void setAmount (int amount) { this.amount = amount; }
//			public String getColor() { return color; }
//			public void setColor(String color) { this.color = color; }
//		}
//
//		class FountainPen { // 만년필
//			private int amount; // 남은 량
//			private String color; // 볼펜의 색
//			public int getAmount() { return amount; }
//			public void setAmount (int amount) { this.amount = amount; }
//			public String getColor() { return color; }
//			public void setColor(String color) { this.color = color; }
//			public void refill (int n) { setAmount(n); }
//		 }  

//	>> day18/SharpPencil, day18/Ballpen , day18/FountainPen

//		3. 다음 중 설명에 적절한 단어를 기입하라.
//		자바에서 상속받는 클래스를 ________라고 부르며,
//		 _____ 키워드를 이용하여 상속을 선언한다. 
//		상속받은 클래스에서 상속해준 클래스의 멤버를 접근할 때 ______ 키워드를 이용한다. 
//		한편, 객체가 어떤 클래스의 타입인지 알아내기 
//		위해서는 ________ 연산자를 이용하며, 인터페이스는 클래스와 달리 ________ 키워드를 이용하여 선언한다.

//	>> 서브(자녀)클래스 / extends / get,set / instanceof / implements

//		4. 상속에 관련된 접근 지정자에 대한 설명이다. 틀린 것은?
//
//		슈퍼 클래스의 private 멤버는 서브 클래스에서 접근할 수 없다.
//		슈퍼 클래스의 protected 멤버는 같은 패키지에 있는 서브 클래스에서만 접근할 수 있다.
//		슈퍼 클래스의 public 멤버는 모든 다른 클래스에서 접근할 수 있다.
//		슈퍼 클래스의 디폴트 멤버는 같은 패키지에 있는 모든 다른 클래스에서 접근 가능하다.

//	>> 4

//		5. 다음 빈칸에 적절한 한 줄의 코드를 삽입하라.
//
//		class TV {
//		   private int size;
//		   public TV(int n) { size = n; }
//		}
//		class ColorTV extends TV {
//		   private int colors;
//		   public ColorTV(int colors, int size) {
//		      ___________
//		      this.colors = colors;
//		   }
//		}

//	>> super(size);

//		6. 상속에 있어 생성자에 대해 묻는 문제이다. 실행될 때 출력되는 내용은 무엇인가?
//		class A {
//			public A() { System.out.println("A"); }
//			public A(int x) { System.out.println("A: " + x); }
//		}
//		class B extends A {
//			public B() { super(100); }
//			public B(int x) { System.out.println("B: " + x); }
//		}
//		public class Example {
//			public static void main(String[] args) {
//			B b = new B(11);
//			}
//		}

//	>> B: 11

//		7. 다음 코드에서 생성자로 인한 오류를 찾아내어 이유를 설명하고 오류를 수정하라.
//		class A {
//			private int a;
//			protected A(int i) { a = i; }
//		}
//		class B extends A {
//			private int b;
//			public B() { b = 0; }
//		}

//	>> 클래스 B 의 생성자 실행 시 우선적으로 슈퍼클래스의 기본생성자를 호출하게 되나, 
//	A 클래스에 이미 만들어놓은 생성자가 있어 기본생성자가 자동생성되지 않았다.
//	A 클래스의 기본생성자 생성.
	
//		class A {
//			private int a;
//			protected A(int i) {a = i;}
//			protected A() {	}
//		}

	
//		8. 다음 추상 클래스의 선언이나 사용이 잘못된 것을 있는 대로 가려내고 오류를 지적하라.
//		(1)
//		abstract class A {
//			void f();
//		}
//
//		(2)
//		abstract class A {
//			void f() {
//				System.out.println("~");
//			}
//		}
//
//		(3)
//		abstract class B {
//			abstract void f();
//		}
//
//		(4)
//		class C extends B {}
//
//		(5)
//		abstract class B {
//			abstract int f();
//		}
//
//		class C extends B {
//			void f() {
//				System.out.println("~");
//			}
//		}

//	(1).abstract void f(); 
//	>> 추상메소드는 작업문이 없음. 따라서 추상메소드로 만들어주거나 작업문을 추가해야한다.
//	(4).void f();를 오버라이딩
//	>> 추상클래스를 상속받은 일반클래스가 되려면 모든 추상메소드를 오버라이딩 해야 함.
//	(5).int f();를 오버라이딩
//	>> (4)와 같은 이유.
	
	
//		9. 추상 클래스를 구현하는 문제이다. 실행 결과와 같이 출력되도록 클래스 B를 완성하라.
//		abstract class OddDetector {
//			protected int n;
//			public OddDetector (int n) {
//				this.n = n;
//			}
//			public abstract boolean isOdd(); // 홀수이면 true 리턴
//		}
//		public class B extends OddDetector {
//			public B(int n) {
//				super(n);
//			}
//			public static void main(String[] args) {
//				B b = new B(10);
//				System.out.println(b.isOdd());
//			}
//		}

//	>> 	
	
	
//		10. 다음 상속 관계의 클래스들이 있다.
//		class A {
//			int i;
//		}
//		class B extends A {
//			int j;
//		}
//		class C extends B {
//			int k;
//		}
//		class D extends B {
//			int m;
//		}
//		다음 중 업캐스팅을 모두 골라라
//		(1) A a = new A();
//		(2) B b = new C();
//		(3) A a = new D();
//		(4) D d = new D();
//
//
//		다음 코드를 실행한 결과는?
//		A x = new D();
//		System.out.println(x instanceof B);
//		System.out.println(x instanceof C);
//
//
//		11. 다형성에 대한 설명 중 틀린 것은?
//
//		추상 메소드를 두는 이유는 상속 받는 클래스에서 다형성을 실현하도록 하기 위함이다.
//		인터페이스도 구현하는 클래스에서 다형성을 실현하도록 하기 위함이다.
//		다형성은 서브클래스들이 수퍼 클래스의 동일한 메소드를 서로 다르게 오버라이딩하여 이루어진다.
//		자바에서 다형성은 모호한(ambiguous) 문제를 일으키므로 사용하지 않는 것이 바람직하다.
}
