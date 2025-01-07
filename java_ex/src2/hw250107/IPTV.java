package hw250107;

public class IPTV extends ColorTV {

	private String addr;

	IPTV(String addr, int inch, int color) {
		super(inch, color);
		this.addr = addr;
	}

	void printProperty() {
		System.out.println("나의 IPTV는 " + addr + "주소의 " + getSize() + "인치 " + getColor() + "컬러");
	}

}
