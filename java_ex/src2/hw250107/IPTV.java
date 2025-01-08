package hw250107;

public class IPTV extends ColorTV {

	private String addr; // IP주소

	IPTV(String addr, int inch, int color) { //inch=size 
		super(inch, color); //ColorTV 클래스와 동일하게 매개변수 맞춰 생성자 호출.
		this.addr = addr;
	}

	void printProperty() { // 오버라이딩. 직접 작성했지만 자동완성을 이용해도 됨.
//		System.out.println("나의 IPTV는 " + addr + "주소의 " + getSize() + "인치 " + getColor() + "컬러");
		System.out.print("나의 IPTV는 " + addr + "주소의 ");
		super.printProperty();
//		>> 부모클래스의 메소드를 호출 (getSize()+"인치 "+color+"컬러")
	}
	
}
