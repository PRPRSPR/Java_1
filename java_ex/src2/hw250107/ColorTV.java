package hw250107;

public class ColorTV extends TV {
	
	private int color;
	
	ColorTV(int inch , int color){ //inch=size
		super(inch); //TV 클래스 생성자를 호출하기 위해 매개변수 하나를 주고 호출.
//		>> 기본생성자가 없기 때문에 매개변수를 맞춰줘야함.
		this.color = color;
	}
	
//	protected int getColor() {
//		return color;
//	}
//	>> IPTV 클래스에서 super로 메소드를 사용해 호출했기때문에 굳이 만들어주지 않아도 됨.
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
//		>> TV 클래스의 size가 private로 보호되고있어 getSize 메소드를 이용해 간접적으로 불러옴.
	}
	
}
