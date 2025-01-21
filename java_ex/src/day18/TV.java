package day18;

public class TV {
	int size;
	String manufacturer;

	public TV() {
		this(32,"LG");
		System.out.println(size + "인치 " + manufacturer);
	}

	public TV(String manufacturer) {
		this(32,manufacturer);
		System.out.println(size + "인치 " + manufacturer);
	}

	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println(size + "인치 " + manufacturer);
	}
	
	public static void main(String[] args) {
		TV a = new TV();
		TV b = new TV("삼성");
	}
}
